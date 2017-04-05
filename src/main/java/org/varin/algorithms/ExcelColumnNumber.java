package org.varin.algorithms;

public class ExcelColumnNumber {
	public int titleToNumber(String s) {
		int output = 0;
		for (int i = 0; i < s.length(); i++) {
			output = output * 26 + (s.charAt(i) - 'A' + 1);
		}
		return output;
	}
}
