package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.varin.objects.Node;

public class NaryTreeLevelOrderTraversalTest {

	@Test
	public void test() {
		Node root = new Node(10);
		root.children = new ArrayList<Node>();
		(root.children).add(new Node(2));
		(root.children).add(new Node(34));
		(root.children).add(new Node(56));
		(root.children).add(new Node(100));
		root.children.get(0).children = new ArrayList<Node>();
		(root.children.get(0).children).add(new Node(77));
		(root.children.get(0).children).add(new Node(88));
		root.children.get(2).children = new ArrayList<Node>();
		(root.children.get(2).children).add(new Node(1));
		root.children.get(3).children = new ArrayList<Node>();
		(root.children.get(3).children).add(new Node(7));
		(root.children.get(3).children).add(new Node(8));
		(root.children.get(3).children).add(new Node(9));

		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(new ArrayList<Integer>());
		expected.add(new ArrayList<Integer>());
		expected.add(new ArrayList<Integer>());
		expected.get(0).add(10);
		expected.get(1).add(2);
		expected.get(1).add(34);
		expected.get(1).add(56);
		expected.get(1).add(100);
		expected.get(2).add(77);
		expected.get(2).add(88);
		expected.get(2).add(1);
		expected.get(2).add(7);
		expected.get(2).add(8);
		expected.get(2).add(9);

		assertEquals(expected, new NaryTreeLevelOrderTraversal().levelOrder(root));
	}

}
