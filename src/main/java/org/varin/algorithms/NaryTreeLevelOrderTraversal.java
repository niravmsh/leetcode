package org.varin.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.varin.objects.Node;

public class NaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(Node root) {

		List<List<Integer>> nodes = new ArrayList<List<Integer>>();

		levelOrder(root, nodes, 1);

		return nodes;

	}

	private void levelOrder(Node root, List<List<Integer>> nodes, int depth) {

		if (root == null) {
			return;
		}

		if (nodes.size() < depth) {
			nodes.add(new ArrayList<Integer>());
		}

		nodes.get(depth - 1).add(root.val);

		if (root.children == null) {
			return;
		}

		for (Node child : root.children) {
			levelOrder(child, nodes, depth + 1);
		}
	}
}
