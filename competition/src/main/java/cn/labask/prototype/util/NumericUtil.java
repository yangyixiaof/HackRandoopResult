package cn.labask.prototype.util;

public class NumericUtil {
	
	public static boolean IsPrmitive(String str) {
		try {
			Long.parseLong(str);
			return true;
		} catch (Exception e) {
		}
		try {
			Double.parseDouble(str);
			return true;
		} catch (Exception e) {
		}
		try {
			Boolean.parseBoolean(str);
			return true;
		} catch (Exception e) {
		}
		return false;
	}
	
}
