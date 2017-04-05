package org.varin.algorithms;

/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1
 */
public class UniqueCharInString {
	public int firstUniqChar(String s) {
		char[] input = s.toCharArray();
		int[] tracker = new int[26];

		for (char c : input) {
			tracker[c - 'a']++;
		}

		for (int i = 0; i < input.length; i++) {
			if (tracker[input[i] - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}
}
