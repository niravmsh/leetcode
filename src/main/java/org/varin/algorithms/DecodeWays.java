package org.varin.algorithms;

public class DecodeWays {
	public int numDecodings(String s) {

		int[] dp = new int[s.length() + 1];

		dp[0] = 1;
		dp[1] = s.charAt(0) == '0' ? 0 : 1;

		for (int index = 2; index <= s.length(); index++) {
			int oneDigit = Integer.valueOf(s.substring(index - 1, index));
			int twoDigit = Integer.valueOf(s.substring(index - 2, index));

			if (oneDigit > 0) {
				dp[index] += dp[index - 1];
			}

			if (10 <= twoDigit && twoDigit <= 26) {
				dp[index] += dp[index - 2];
			}
		}
		return dp[s.length()];
	}
}
