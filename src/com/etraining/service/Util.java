package com.etraining.service;

public class Util {
	public static String[] cutArray(String[] array, int start, int finish) {
		if (start<0) {
			start = 0;
		}
		String[] ans = new String[(start<array.length ? (finish>array.length? array.length-start : finish-start) : 0)];		
		int j = 0;		
		for (int i = start; i<finish; i++) {
			if (i<array.length) {
				ans[j] = array[i];
				j++;
			}
		}		
		return ans;
	}
	
	public static boolean isInt(String s) throws NumberFormatException {
	    try {
	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
	public static boolean isDouble(String s) throws NumberFormatException {
	    try {
	        Double.parseDouble(s);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
}
