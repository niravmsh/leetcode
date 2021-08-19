package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.varin.objects.TreeNode;

public class PathSumTwoTest {

	@Test
	public void test() {

		TreeNode root = TreeNode.stringToTreeNode("[5,4,8,11,null,13,4,7,2,null,null,5,1]");
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(5, 4, 11, 2), Arrays.asList(5, 8, 4, 5));
		assertEquals(expected, new PathSumTwo().pathSum(root, 22));

		root = TreeNode.stringToTreeNode("[1,2,3]");
		expected = Arrays.asList();
		assertEquals(expected, new PathSumTwo().pathSum(root, 5));

		root = TreeNode.stringToTreeNode("[1,2]");
		expected = Arrays.asList();
		assertEquals(expected, new PathSumTwo().pathSum(root, 0));
		
		root = TreeNode.stringToTreeNode("[-2, null, -3]");
		expected = Arrays.asList(Arrays.asList(-2, -3));
		assertEquals(expected, new PathSumTwo().pathSum(root, -5));
	}

}
