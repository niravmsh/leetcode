package org.varin.algorithms;

/*
 * Given a binary tree, find its maximum depth.
 * 
 *   1
 *  2 3
 * 4 5
 */
public class MaxDepthBinaryTree {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	private class TreeNode {
		TreeNode left;
		TreeNode right;
	}

}
