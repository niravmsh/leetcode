package org.varin.algorithms;

/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {

	public int singleNumber(int[] nums) {
		int output = 0;
		for (int num : nums) {
			output ^= num;
		}
		return output;
	}
}
