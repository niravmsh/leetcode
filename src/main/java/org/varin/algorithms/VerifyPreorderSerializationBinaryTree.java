package org.varin.algorithms;

public class VerifyPreorderSerializationBinaryTree {
	public boolean isValidSerialization(String preorder) {
		String[] nodes = preorder.split(",");

		int nodeCount = 1;

		for (String node : nodes) {

			nodeCount--;

			if (nodeCount < 0) {
				return false;
			}

			if (!"#".equals(node)) {
				nodeCount += 2;
			}
		}
		return nodeCount == 0;
	}
}