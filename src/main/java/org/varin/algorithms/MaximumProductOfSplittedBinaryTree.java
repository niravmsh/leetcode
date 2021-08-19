package org.varin.algorithms;

import org.varin.objects.TreeNode;

public class MaximumProductOfSplittedBinaryTree {

	public long result = Integer.MIN_VALUE;

	public int maxProduct(TreeNode root) {

		subTreeSum(root, totalTreeSum(root));

		return (int) (result % 1000000007);
	}

	private long subTreeSum(TreeNode root, long totalTreeSum) {

		if (root == null)
			return 0;

		long subTreeSum = root.val + subTreeSum(root.left, totalTreeSum) + subTreeSum(root.right, totalTreeSum);

		result = Math.max(result, subTreeSum * (totalTreeSum - subTreeSum));

		return subTreeSum;
	}

	private int totalTreeSum(TreeNode root) {

		if (root == null)
			return 0;

		return root.val + totalTreeSum(root.left) + totalTreeSum(root.right);
	}
}
