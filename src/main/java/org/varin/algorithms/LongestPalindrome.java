package org.varin.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
	public int longestPalindrome(String s) {
		
		char[] input = s.toCharArray();
		
		Map<Character, Integer> freq = new HashMap<Character, Integer>();

		for (char c : input) {
			freq.put(c, (freq.containsKey(c) ? freq.get(c) : 0) + 1);
		}

		int result = 0;
		boolean isOddFreqPresent = false;
		for (int f : freq.values()) {
			if (f % 2 == 0) {
				result += f;
			} else {
				result += f - 1;
				isOddFreqPresent = true;
			}
		}

		return isOddFreqPresent ? result + 1 : result;
	}
}
