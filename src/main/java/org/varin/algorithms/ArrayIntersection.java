package org.varin.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayIntersection {
	public int[] intersect(int[] nums1, int[] nums2) {

		Map<Integer, Integer> maps1 = new HashMap<Integer, Integer>();
		for (int num : nums1) {
			maps1.put(num, maps1.containsKey(num) ? maps1.get(num) + 1 : 1);
		}
		Map<Integer, Integer> maps2 = new HashMap<Integer, Integer>();
		for (int num : nums2) {
			maps2.put(num, maps2.containsKey(num) ? maps2.get(num) + 1 : 1);
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int key : maps1.keySet()) {
			int lcd = Math.min(maps1.get(key), maps2.getOrDefault(key, 0));
			while (lcd > 0) {
				list.add(key);
				lcd--;
			}
		}

		int[] res = new int[list.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i);
		}
		return res;

	}
}
