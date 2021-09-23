package org.varin.algorithms;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int finalSize = nums.length;
		int index = 0;
		while (index < nums.length) {
			if (nums[index] == val) {
				shift(nums, index);
				finalSize--;
			} else {
				index++;
			}
		}
		return finalSize;
	}

	public void shift(int[] nums, int index) {
		for (int i = index; i < nums.length - 1; i++) {
			nums[i] = nums[i + 1];
		}
		nums[nums.length - 1] = -1;
	}
}
