package org.varin.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.varin.objects.TreeNode;

public class TwoSumFourInputBST {
	int locationCounter;

	public boolean findTarget(TreeNode root, int k) {
		Map<Integer, Integer> allValues = new HashMap<>();

		locationCounter = 0;
		populateValues(root, allValues);

		List<Boolean> result = new ArrayList<>();
		result.add(Boolean.FALSE);

		locationCounter = 1;
		traverseTree(root, allValues, k, result);

		return result.get(0);

	}

	private void traverseTree(TreeNode root, Map<Integer, Integer> allValues, int k, List<Boolean> result) {
		if (root == null) {
			return;
		}

		if (allValues.containsKey(k - root.val)) {
			if (allValues.get(root.val) != locationCounter) {
				result.remove(0);
				result.add(Boolean.TRUE);
			}
		} else {
			locationCounter++;
		}

		traverseTree(root.left, allValues, k, result);
		traverseTree(root.right, allValues, k, result);
	}

	private void populateValues(TreeNode root, Map<Integer, Integer> allValues) {

		if (root == null) {
			return;
		}

		allValues.put(root.val, ++locationCounter);
		populateValues(root.left, allValues);
		populateValues(root.right, allValues);
	}
}
