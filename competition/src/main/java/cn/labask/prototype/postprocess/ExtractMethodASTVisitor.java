package cn.labask.prototype.postprocess;

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
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;

public class ExtractMethodASTVisitor extends ASTVisitor {
	
	private int test_index = -1;
	private Set<String> imports = new TreeSet<String>();
	private Set<String> fields = new TreeSet<String>();
	private List<String> methods = new LinkedList<String>();
	private String cu_resource = null;
	private CompilationUnit cu = null;
	
	public ExtractMethodASTVisitor(int test_index, String cu_resource, CompilationUnit cu) {
		this.test_index = test_index;
		this.cu_resource = cu_resource;
		this.cu = cu;
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
			if (method_name.startsWith("test")) {
				AST ast = node.getAST();
				ASTRewrite rewrite = ASTRewrite.create(ast);
				SimpleName new_method_name_node = ast.newSimpleName("test" + test_index);
				test_index++;
				rewrite.replace(method_name_node, new_method_name_node, null);
				String content = ASTRewriteHelper.GetRewriteContent(node, rewrite, cu_resource, cu);
				methods.add(content);
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
	
}
