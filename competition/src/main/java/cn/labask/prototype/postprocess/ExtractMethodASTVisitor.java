package cn.labask.prototype.postprocess;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;

import cn.labtask.prototype.competition.App;

public class ExtractMethodASTVisitor extends ASTVisitor {
	
	private int test_index = -1;
	private Set<String> imports = new TreeSet<String>();
	private Set<String> fields = new TreeSet<String>();
	private List<String> methods = new LinkedList<String>();
	private List<String> wrap_methods = new LinkedList<String>();
	private List<String> wrap_methods_invokes = new LinkedList<String>();
	private List<String> wrap_methods_configs = new LinkedList<String>();
	private String cu_resource = null;
	private CompilationUnit cu = null;
	private double rate_threshold = 0.1;
	
	public ExtractMethodASTVisitor(int test_index, String cu_resource, CompilationUnit cu) {
		this.test_index = test_index;
		this.cu_resource = cu_resource;
		this.cu = cu;
		TypeDeclaration tp = (TypeDeclaration)cu.types().get(0);
		int mlength = tp.getMethods().length;
		this.rate_threshold = Math.max(10.0, (mlength*1.0)/(10.0))/(mlength*1.0);
	}
	
	@Override
	public boolean visit(ImportDeclaration node) {

		// testing.
		// System.err.println("ImportDeclaration:" + node);
		
		Name n = node.getName();
		imports.add(n.toString());
		return super.visit(node);
	}
	
	@Override
	public boolean visit(FieldDeclaration node) {
		fields.add(node.toString());
		return super.visit(node);
	}
	
	@Override
	public boolean visit(MethodDeclaration node) {

		// testing.
		// System.err.println("MethodDeclaration:" + node);
		
		double rand = Math.random();
		if (rand >= 0.5) {
			ASTNode method_name_node = node.getName();
			String method_name = method_name_node.toString();
			String test_name = "test" + test_index;
			if (method_name.startsWith("test")) {
				AST ast = node.getAST();
				ASTRewrite rewrite = ASTRewrite.create(ast);
				SimpleName new_method_name_node = ast.newSimpleName(test_name);
				test_index++;
				rewrite.replace(method_name_node, new_method_name_node, null);
				String content = ASTRewriteHelper.GetRewriteContent(node, rewrite, cu_resource, cu);
				methods.add(content);
			}
			if (App.handle_jdart_input && rand <= rate_threshold) {
				AST ast = node.getAST();
				ASTRewrite rewrite = ASTRewrite.create(ast);
				StatementArgumentASTVisitor saav = new StatementArgumentASTVisitor(ast, rewrite, node, test_name);
				node.accept(saav);
				String content = ASTRewriteHelper.GetRewriteContent(node, rewrite, cu_resource, cu);
				String real_content = saav.GetFunctionName() + content.substring(content.indexOf('{'));
				BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(real_content.getBytes())));
				StringBuilder real_content_builder = new StringBuilder("");
				try {
					String r_cnt = null;
					while ((r_cnt = br.readLine()) != null) {
						real_content_builder.append(r_cnt + " ");
					}
				} catch (Exception e) {
				}
				wrap_methods.add(real_content_builder.toString());
				wrap_methods_invokes.add(saav.GetInvoke());
				wrap_methods_configs.add(saav.GetConfig());
			}
		}
		return super.visit(node);
	}

	public int GetTestIndex() {
		return test_index;
	}

	public List<String> GetFilteredMethods() {
		return methods;
	}
	
	public Set<String> GetImports() {
		return imports;
	}
	
	public Set<String> GetFields() {
		return fields;
	}

	public List<String> GetWrapMethods() {
		return wrap_methods;
	}
	
	public List<String> GetWrapMethodsInvokes() {
		return wrap_methods_invokes;
	}
	
	public List<String> GetWrapMethodsConfigs() {
		return wrap_methods_configs;
	}
	
}
