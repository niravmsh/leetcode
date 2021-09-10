package org.varin.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.varin.objects.TreeNode;

public class UniqueBinarySearchTreesTwo {
	public List<TreeNode> generateTrees(int n) {
		return helper(1, n);
	}

	private List<TreeNode> helper(int start, int end) {

		List<TreeNode> list = new ArrayList<>();

		if (end < start) {
			list.add(null);
			return list;
		}

		if (end == start) {
			list.add(new TreeNode(start));
			return list;
		}

		for (int value = start; value <= end; value++) {

			List<TreeNode> leftList = helper(start, value - 1);
			List<TreeNode> rightList = helper(value + 1, end);

			for (TreeNode left : leftList) {
				for (TreeNode right : rightList) {
					TreeNode node = new TreeNode(value);
					node.left = left;
					node.right = right;
					list.add(node);
				}
			}
		}
		return list;
	}
}
