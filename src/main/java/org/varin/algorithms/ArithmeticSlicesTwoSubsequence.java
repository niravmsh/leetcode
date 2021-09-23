package org.varin.algorithms;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticSlicesTwoSubsequence {
	public int numberOfArithmeticSlices(int[] nums) {

		int result = 0;

		if (nums.length > 2) {

			Map<Long, Integer>[] frequency = new HashMap[nums.length];

			for (int index = 0; index < nums.length; index++) {
				frequency[index] = new HashMap<>();
			}

			for (int i = 1; i < nums.length; ++i) {
				for (int j = 0; j < i; ++j) {

					long diff = (long) nums[i] - (long) nums[j];

					int ArithSliceEndingOnJ = frequency[j].getOrDefault((long) diff, 0);
					int ArithSliceEndingOnI = frequency[i].getOrDefault((long) diff, 0);

					result += ArithSliceEndingOnJ;

					frequency[i].put((long) diff, ArithSliceEndingOnI + ArithSliceEndingOnJ + 1);
				}
			}
		}
		return result;
	}
}
