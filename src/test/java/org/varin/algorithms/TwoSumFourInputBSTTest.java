package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.varin.objects.TreeNode;

public class TwoSumFourInputBSTTest {

	@Test
	public void testFindTarget() {
		TreeNode root = TreeNode.stringToTreeNode("[5,3,6,2,4,null,7]");
		assertEquals(Boolean.TRUE, new TwoSumFourInputBST().findTarget(root, 9));
		
		root = TreeNode.stringToTreeNode("[1]");
		assertEquals(Boolean.FALSE, new TwoSumFourInputBST().findTarget(root, 2));

	}

}
