package cn.labask.prototype.postprocess;

import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;

import cn.labask.prototype.util.NumericUtil;

public class StatementArgumentASTVisitor extends ASTVisitor {
	
	int arg_count = 0;
	AST ast = null;
	ASTRewrite rewrite = null;
	MethodDeclaration node = null;
	boolean first = true;
	
	StringBuilder declare_func_name = new StringBuilder("public static void ");
	StringBuilder invoke = new StringBuilder("");
	StringBuilder config = new StringBuilder("");
	
	public StatementArgumentASTVisitor(AST ast, ASTRewrite rewrite, MethodDeclaration node, String func_name) {
		this.ast = ast;
		this.rewrite = rewrite;
		this.node = node;
		declare_func_name.append(func_name);
		invoke.append(func_name);
		config.append(func_name);
	}
	
	@Override
	public boolean visit(MethodInvocation node) {
		IMethodBinding nbinding = node.resolveMethodBinding();
		// System.err.println(nbinding);
		if (nbinding != null && node.arguments() != null && node.arguments().size() > 0) {
			ITypeBinding[] it_args = nbinding.getParameterTypes();
			int index = 0;
			@SuppressWarnings("unchecked")
			List<Expression> args = (List<Expression>)node.arguments();
			for (Expression arg : args) {
				ITypeBinding itb = it_args[index];
				String arg_cnt = arg.toString().trim();
				
				// testing.
				System.err.println(arg_cnt + "#" + NumericUtil.IsPrmitive(arg_cnt));
				
				if (NumericUtil.IsPrmitive(arg_cnt)) {
					arg_count++;
					SimpleName s = ast.newSimpleName("x" + arg_count);
					rewrite.replace(arg, s, null);
					String pre = "(";
					if (first) {
						first = false;
					} else {
						pre = ",";
					}
					declare_func_name.append(pre + itb.getQualifiedName() + " " + s.toString());
					invoke.append(pre + arg_cnt);
					config.append(pre + s.toString() + ":" + itb.getQualifiedName());
				}
				index++;
			}
		} else {
//			System.out.println("===================");
//			System.out.println(node);
		}
		return super.visit(node);
	}
	
	@Override
	public void endVisit(MethodDeclaration node) {
		if (this.node.equals(node)) {
			declare_func_name.append(")");
			invoke.append(")");
			config.append(")");
		}
		super.endVisit(node);
	}

	public String GetFunctionName() {
		return declare_func_name.toString();
	}
	
	public String GetConfig() {
		return config.toString();
	}

	public String GetInvoke() {
		return invoke.toString();
	}
	
	public boolean NeedJdartExecution() {
		return arg_count > 0;
	}
	
}
