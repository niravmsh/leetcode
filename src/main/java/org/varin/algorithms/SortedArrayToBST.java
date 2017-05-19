package org.varin.algorithms;

public class SortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		return sortedArrayToBST(nums, 0, nums.length - 1);
	}

	public TreeNode sortedArrayToBST(int[] nums, int left, int right) {

		if (left > right) {
			return null;
		}

		int center = (left + right) / 2;

		TreeNode centerTN = new TreeNode(nums[center]);
		TreeNode leftTN = sortedArrayToBST(nums, left, center - 1);
		TreeNode rightTN = sortedArrayToBST(nums, center + 1, right);

		centerTN.left = leftTN;
		centerTN.right = rightTN;
		return centerTN;
	}

	public class TreeNode {
		Integer val;
		TreeNode left;
		TreeNode right;

		TreeNode(Integer x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9};
		SortedArrayToBST sortedArrayToBST = new SortedArrayToBST();
		sortedArrayToBST.sortedArrayToBST(nums);
	}
}
