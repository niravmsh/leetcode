package org.varin.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsTwo {

	public List<List<Integer>> subsetsWithDup(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();

		if (nums == null || nums.length == 0)
			return result;

		Arrays.sort(nums);

		subsets(nums, result, new ArrayList<>(), 0);

		return result;

	}

	private void subsets(int[] nums, List<List<Integer>> result, List<Integer> subSet, int index) {
		result.add(new ArrayList<Integer>(subSet));

		for (int i = index; i < nums.length; i++) {
			if (i != index && nums[i] == nums[i - 1]) {
				continue;
			}

			subSet.add(nums[i]);
			subsets(nums, result, subSet, i + 1);
			subSet.remove(subSet.size() - 1);
		}
	}
}