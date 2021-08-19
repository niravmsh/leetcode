package org.varin.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.varin.objects.TreeNode;

public class PathSumTwo {

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

		List<List<Integer>> paths = new ArrayList<List<Integer>>();

		List<Integer> path = new ArrayList<Integer>();

		pathSum(root, paths, path, targetSum);

		return paths;
	}

	private void pathSum(TreeNode root, List<List<Integer>> paths, List<Integer> path, int targetSum) {
		if (root == null) {
			return;
		}

		path.add(root.val);

		if (root.left == null && root.right == null & targetSum == root.val) {
			paths.add(new ArrayList<Integer>(path));
		} else {
			pathSum(root.left, paths, path, targetSum - root.val);
			pathSum(root.right, paths, path, targetSum - root.val);
		}

		path.remove(path.size() - 1);
	}

}
