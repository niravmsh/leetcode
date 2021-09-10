package org.varin.algorithms;

public class ArrayNesting {
	public int arrayNesting(int[] nums) {

		int maxCount = 1;

		for (int i = 0; i < nums.length; i++) {

			int count = 1;
			int j = i;

			while (nums[j] != i) {
				j = nums[j];
				count++;
			}

			maxCount = Math.max(maxCount, count);
		}
		return maxCount;
	}
}
