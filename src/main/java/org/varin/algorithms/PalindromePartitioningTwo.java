package org.varin.algorithms;

public class PalindromePartitioningTwo {

	public int minCut(String string) {

		int[][] cache = new int[string.length()][string.length()];
		boolean[][] palindrome = new boolean[string.length()][string.length()];

		for (int i = 0; i < string.length(); i++) {
			cache[i][i] = 0;
			palindrome[i][i] = true;
		}

		return minPalPartion(string, 0, string.length() - 1, cache, palindrome);

	}

	private int minPalPartion(String string, int start, int end, int[][] cache, boolean[][] palindrome) {

		if (start >= end)
			return 0;

		if (palindrome[start][end]) {
			return 0;
		}

		if (cache[start][end] != 0) {
			return cache[start][end];
		}

		if (cache[start][end] != 0) {
			if (cache[start][end] == -1) {
				return 0;
			}
			return cache[start][end];
		}

		if (isPalindrome(string, start, end)) {
			palindrome[start][end] = true;
			cache[start][end] = -1;
			return 0;
		}

		int result = Integer.MAX_VALUE;

		for (int tracker = start; tracker < end; tracker++) {
			int tempResult = minPalPartion(string, start, tracker, cache, palindrome)
					+ minPalPartion(string, tracker + 1, end, cache, palindrome) + 1;
			result = Math.min(tempResult, result);
		}

		cache[start][end] = result;
		return result;

	}

	private boolean isPalindrome(String s, int start, int end) {

		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;

	}
}
