package cn.labtask.prototype.postprocess;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ITrackedNodePosition;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

public class ASTRewriteHelper {
	// , final ICompilationUnit type_declare_resource
	public static String GetRewriteContent(final ASTNode replace_happen, ASTRewrite rewriter, final String type_declare_resource, final CompilationUnit type_declare) {
		String text= replace_happen.toString();
		try {
			// final ASTRewrite rewriter= ASTRewrite.create(bodyDeclaration.getAST());
			// ModifierRewrite.create(rewriter, bodyDeclaration).setVisibility(Modifier.PROTECTED, null);
			ASTNode parent = replace_happen.getParent();
			final ITrackedNodePosition position_parent = rewriter.track(parent);
			final ITrackedNodePosition position = rewriter.track(replace_happen);
			final IDocument document = new Document(type_declare_resource); // type_declare.getStartPosition(), type_declare.getLength()
			
			final IDocument document_before = new Document(type_declare_resource); // type_declare.getStartPosition(), type_declare.getLength()
			document_before.getClass();
			
			int track_parent_start_before = position_parent.getStartPosition();
			int track_parent_length_before = position_parent.getLength();
			int position_length_before = position.getLength();
			
//			{
//				System.err.println("======== Start ========");
//				System.err.println("Replace_Node_Parent_Before:" + document.get(track_parent_start_before, track_parent_length_before));
//			}
			
			rewriter.rewriteAST(document, null).apply(document, TextEdit.UPDATE_REGIONS);
			int track_parent_start_after = position_parent.getStartPosition();
			int track_parent_length_after = position_parent.getLength();
			int position_length_after = position.getLength();
			int start_parent_gap = track_parent_start_after - track_parent_start_before;
			int origin_gap = position_length_after - position_length_before;
			int replaced_parent_gap = track_parent_length_after - track_parent_length_before;
			int track_start = position.getStartPosition();
			
//			if (replace_happen.toString().trim().startsWith("GreaterThanTen"))
//			{
//				System.err.println("Replace_Node:" + replace_happen.toString());
//				System.err.println("Replace_Node_Parent:" + replace_happen.getParent().toString());
//				System.err.println("Replace_Node_Parent_After:" + document.get(track_parent_start_after, track_parent_length_after));
//				System.err.println("Rewriter:" + rewriter);
//				System.err.println("position_parent_length_before:" + track_parent_length_before);
//				System.err.println("position_parent_length_after:" + track_parent_length_after);
//				System.err.println("position_length_before:" + position_length_before);
//				System.err.println("position_length_after:" + position_length_after);
//				System.err.println("track_parent_start_before:" + track_parent_start_before);
//				System.err.println("track_parent_start_after:" + track_parent_start_after);
//				System.err.println("document_before:" + document_before.get());
//				System.err.println("document_after:" + document.get());
//				System.err.println("======== End ========");
//			}
			
			text= document.get(track_start, position_length_after + start_parent_gap + replaced_parent_gap - origin_gap);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		return text;
	}
	
}
