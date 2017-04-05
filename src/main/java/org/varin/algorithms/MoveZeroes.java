package org.varin.algorithms;

/*
 * Move all 0's to the end while maintaining the relative order of the non-zero elements.
 */
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int firstZero = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				swap(nums, i, firstZero);
				firstZero++;
			}
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
