package org.varin.algorithms;

public class ArithmeticSlices {
	public int numberOfArithmeticSlices(int[] nums) {

		int result = 0;

		if (nums.length > 2) {

			int[] dp = new int[nums.length];
			dp[0] = 0;
			dp[1] = 0;

			for (int index = 2; index < nums.length; index++) {
				if (nums[index] - nums[index - 1] == nums[index - 1] - nums[index - 2]) {
					dp[index] = dp[index - 1] + 1;
					result += dp[index];
				}
			}
		}

		return result;
	}
}
