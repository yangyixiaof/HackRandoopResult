package cn.labtask.prototype.competition;

import cn.labask.prototype.postprocess.PostProcessRandoop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	if (args.length == 0) {
    		return;
    	}
        // System.out.println( "Hello World!" );
        PostProcessRandoop ppr = new PostProcessRandoop();
        ppr.ExtractAndCombineIntoOne(args[0]);
    }
}
