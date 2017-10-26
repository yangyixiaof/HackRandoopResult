package cn.labask.prototype.util;

import org.eclipse.jdt.core.dom.Expression;

public class NumericUtil {
	
	public static boolean IsPrmitive(Expression arg) {
		if (arg == null) {
			return false;
		}
		Object cv = arg.resolveConstantExpressionValue();
		return IsPrmitive(arg.toString().trim()) || (cv != null ? IsPrmitive(cv.toString().trim()) : false);
	}
	
	
	/**
	 * Judge wheather str is a literal of int, short, long, float, double, boolean.
	 * 
	 * Preprocess for JDart.
	 * 
	 * PLEASE NOTE THAT Boolean.parseBoolean(String s) returns false does not apply
	 * s.equals("false")!!!
	 * 
	 * @param str
	 * @return
	 */
	public static boolean IsPrmitive(String str) {
		try {
			// long rst = 
			Long.parseLong(str);
//			System.out.println("parse " + str + " to " + rst);
			return true;
		} catch (NumberFormatException e) {
		}

		try {
			// double rst = 
			Double.parseDouble(str);
//			System.out.println("parse " + str + " to " + rst);
			return true;
		} catch (NumberFormatException e) {
		}

		try {
			// boolean rst = 
			myParseBoolean(str);
//			System.out.println("parse " + str + " to " + rst);
			return true;
		} catch (NumberFormatException e) {
		}

		return false;
	}

	/**
	 * Boolean.parseBoolean(String s) returns false doesn't apply s.equals("false")!
	 * 
	 * I'm angry, so I write this funtion.
	 * 
	 * @param s
	 * @return
	 * @throws NumberFormatException
	 */
	private static Boolean myParseBoolean(String s) throws NumberFormatException {
		if (s == null) {
			throw new NumberFormatException("For input string: \"" + s + "\"");
		}
		if (s.equalsIgnoreCase("true")) {
			return true;
		}
		if (s.equalsIgnoreCase("false")) {
			return false;
		}
		throw new NumberFormatException("For input string: \"" + s + "\"");
	}
}
