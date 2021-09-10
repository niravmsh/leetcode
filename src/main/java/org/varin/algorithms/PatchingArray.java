package org.varin.algorithms;

public class PatchingArray {

	public long minPatches(int[] nums, int n) {

		long reach = 0;
		int index = 0;
		int count = 0;

		while (reach < n) {

			if (index < nums.length && nums[index] <= reach + 1) {
				reach += nums[index];
				index++;
			} else {
				reach += reach + 1;
				count++;
			}

		}

		return count;
	}
}
