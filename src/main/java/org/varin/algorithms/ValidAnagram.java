package org.varin.algorithms;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		int[] charsMap = new int[26];

		for (char c : s.toCharArray()) {
			charsMap[c - 'a']++;
		}

		for (char c : t.toCharArray()) {
			charsMap[c - 'a']--;
		}

		for (int count : charsMap) {
			if (count != 0) {
				return false;
			}
		}

		return true;
	}
}
