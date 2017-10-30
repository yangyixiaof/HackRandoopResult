package cn.labtask.prototype.competition;

import cn.labtask.prototype.postprocess.PostProcessRandoop;

/**
 * Hello world!
 *
 */
public class App {
	
	public static boolean handle_jdart_input = false;
	public static int JDART_METHOD_THRESHOLD = 30;
	public static int jdartMethodAlready = 0;
	public static String targetFile = "JDart_Run.txt";

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: <input_randoop_testcase_dir> [output_file=JDart_Run.txt] [jdart [JDART_METHOD_THRESHOLD=30] ]");
			return;
		}
		String inputDir = args[0];
		if(args.length >= 2) {
			targetFile = args[1];
		}
		if (args.length >= 3 ) {
			App.handle_jdart_input = true;
		}
		if (args.length >= 4) {
			try {
				JDART_METHOD_THRESHOLD = Integer.parseInt(args[3]);
			}catch(NumberFormatException nfe) {
				nfe.printStackTrace();
			}
		}
		System.out.println("Transformation running!");
		System.out.println("Test Input Directory:" + inputDir);
		System.out.println("Output Directory:" + targetFile);
		System.out.println("App.handle_jdart_input: " + App.handle_jdart_input);
		System.out.println("App.JDART_METHOD_THRESHOLD: " + App.JDART_METHOD_THRESHOLD);
		PostProcessRandoop ppr = new PostProcessRandoop();
		ppr.ExtractAndCombineIntoOne(inputDir);
	}

}
