package org.varin.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _ScratchNotes {
	public int[] intersect(int[] nums1, int[] nums2) {

		List<Integer> list = new ArrayList<>();
		List<Integer> result = new ArrayList<>();

		if (nums1.length > nums2.length) {
			list = Arrays.stream(nums2).boxed().collect(Collectors.toList());
		} else {
			list = Arrays.stream(nums1).boxed().collect(Collectors.toList());
			nums1 = nums2;
		}

		for (int num : nums1) {
			if (list.contains(num)) {
				result.add(num);
				list.remove(list.indexOf(num));
			}
		}
		return result.stream().mapToInt(i -> i).toArray();
	}
}
