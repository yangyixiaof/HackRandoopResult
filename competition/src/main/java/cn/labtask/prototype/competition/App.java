package cn.labtask.prototype.competition;

import cn.labask.prototype.postprocess.PostProcessRandoop;

/**
 * Hello world!
 *
 */
public class App {

	public static boolean handle_jdart_input = false;

	public static void main(String[] args) {
		if (args.length == 0) {
			return;
		}
		if (args.length >= 2) {
			App.handle_jdart_input = true;
		}
		System.out.println("Transformation running!");
		System.out.println("Test Directory:" + args[0]);
		System.out.println("App.handle_jdart_input:" + App.handle_jdart_input);
		PostProcessRandoop ppr = new PostProcessRandoop();
		ppr.ExtractAndCombineIntoOne(args[0]);
	}

}
