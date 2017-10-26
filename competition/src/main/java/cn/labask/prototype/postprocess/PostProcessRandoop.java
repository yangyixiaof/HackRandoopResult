package cn.labask.prototype.postprocess;

import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

import cn.labask.prototype.util.FileUtil;

public class PostProcessRandoop {

	public PostProcessRandoop() {
	}

	public void ExtractAndCombineIntoOne(String work_dir) {
		Set<String> imports = new HashSet<String>();
		Set<String> fields = new HashSet<String>();
		List<String> methods = new LinkedList<String>();
		List<String> wrap_methods = new LinkedList<String>();
		List<String> wrap_methods_invokes = new LinkedList<String>();
		List<String> wrap_methods_configs = new LinkedList<String>();
		File dir = new File(work_dir);
		if (dir.exists()) {
			File[] files = dir.listFiles();
			int index = 0;
			for (File f : files) {
				if (f.getName().endsWith(".java")) {
					String content = FileUtil.ReadFromFile(f);
					OneJavaFileProcessResult oresult = ParseAndModify(f.getName(), content, index);
					index = oresult.GetIndex();
					imports.addAll(oresult.GetImports());
					fields.addAll(oresult.GetFields());
					methods.addAll(oresult.GetMethods());
					wrap_methods.addAll(oresult.GetWrapMethods());
					wrap_methods_invokes.addAll(oresult.GetWrapMethodsInvokes());
					wrap_methods_configs.addAll(oresult.GetWrapMethodsConfigs());
				}
			}
		}
		try {
			String line_sep = System.getProperty("line.separator");
			StringBuilder build = new StringBuilder("");
			for (String impt : imports) {
				build.append("import " + impt.trim() + ";" + line_sep);
			}
			build.append(line_sep);
			build.append("public class S_T_T_e_s_t {" + line_sep);
			build.append(line_sep);
			for (String field : fields) {
				build.append(field + line_sep);
			}
			build.append(line_sep);
			for (String method : methods) {
				build.append(method + line_sep);
			}
			build.append("}" + line_sep);
			String changed_class = build.toString();

			CodeFormatter codeFormatter = ToolFactory.createCodeFormatter(null);
			TextEdit textEdit = codeFormatter.format(CodeFormatter.K_COMPILATION_UNIT, changed_class, 0,
					changed_class.length(), 0, null);
			IDocument doc = new Document(changed_class);
			try {
				textEdit.apply(doc);
				changed_class = doc.get();
			} catch (Exception e) {
				e.printStackTrace();
			}

			FileWriter fw = new FileWriter(new File("S_T_T_e_s_t.java"));
			fw.write(changed_class);
			fw.close();
		} catch (Exception e) {
		}
		
		try {
			String line_sep = System.getProperty("line.separator");
			StringBuilder build = new StringBuilder("");
			for (String impt : imports) {
				build.append("import " + impt.trim() + "; ");
			}
			build.append(line_sep);
			Iterator<String> wm_itr = wrap_methods.iterator();
			Iterator<String> wmi_itr = wrap_methods_invokes.iterator();
			Iterator<String> wmc_itr = wrap_methods_configs.iterator();
			while (wm_itr.hasNext()) {
				String wm = wm_itr.next();
				build.append(wm + line_sep);
				String wmi = wmi_itr.next();
				build.append(wmi + line_sep);
				String wmc = wmc_itr.next();
				build.append(wmc + line_sep);
			}
			String jdart_content = build.toString();
			FileWriter fw = new FileWriter(new File("JDart_Run.txt"));
			fw.write(jdart_content);
			fw.close();
		} catch (Exception e) {
		}
	}

	private OneJavaFileProcessResult ParseAndModify(String unit_name, String content, int index) {
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setResolveBindings(true);
		parser.setBindingsRecovery(true);
		Map<String, String> options = JavaCore.getOptions();
		options.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_1_8);
		parser.setCompilerOptions(options);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		String[] classpath_entries = System.getProperty("java.class.path").split(System.getProperty("path.separator"));
		parser.setEnvironment(classpath_entries, null, null, true);
		parser.setUnitName(unit_name);
		parser.setSource(content.toCharArray());
		CompilationUnit compilationUnit = (CompilationUnit) parser.createAST(null);
		if (compilationUnit.getAST().hasBindingsRecovery()) {
			System.out.println("Binding activated.");
		}
		ExtractMethodASTVisitor dastv = new ExtractMethodASTVisitor(index, content, compilationUnit);
		compilationUnit.accept(dastv);
		return new OneJavaFileProcessResult(dastv.GetTestIndex(), dastv.GetImports(), dastv.GetFields(), dastv.GetFilteredMethods(), dastv.GetWrapMethods(), dastv.GetWrapMethodsInvokes(), dastv.GetWrapMethodsConfigs());
	}

}

class OneJavaFileProcessResult {

	private int index = -1;
	private Set<String> imports = null;
	private Set<String> fields = null;
	private List<String> methods = null;
	private List<String> wrap_methods = new LinkedList<String>();
	private List<String> wrap_methods_invokes = new LinkedList<String>();
	private List<String> wrap_methods_configs = new LinkedList<String>();

	public OneJavaFileProcessResult(int index, Set<String> imports, Set<String> fields, List<String> methods, List<String> wrap_methods, List<String> wrap_methods_invokes, List<String> wrap_methods_configs) {
		this.index = index;
		this.imports = imports;
		this.fields = fields;
		this.methods = methods;
		this.wrap_methods = wrap_methods;
		this.wrap_methods_invokes = wrap_methods_invokes;
		this.wrap_methods_configs = wrap_methods_configs;
	}

	public int GetIndex() {
		return index;
	}

	public Set<String> GetImports() {
		return imports;
	}

	public Set<String> GetFields() {
		return fields;
	}
	
	public List<String> GetMethods() {
		return methods;
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
