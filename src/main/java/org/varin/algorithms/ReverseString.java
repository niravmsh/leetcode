package org.varin.algorithms;

/*
 * Write a function that takes a string as input and returns the string reversed.
 */
public class ReverseString {
	
	public String reverseString(String s) {
		char[] sArray = s.toCharArray();
		StringBuilder output = new StringBuilder(sArray.length);
		for (int i = sArray.length - 1; i >= 0; i--) {
			output.append(sArray[i]);
		}
		return String.valueOf(output);
	}
}
