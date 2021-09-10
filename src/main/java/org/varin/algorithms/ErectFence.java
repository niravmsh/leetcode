package org.varin.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ErectFence {
	public int[][] outerTrees(int[][] trees) {

		int maxRow = 0;
		int minRow = Integer.MAX_VALUE;
		int maxCol = 0;
		int minCol = Integer.MAX_VALUE;

		for (int[] tree : trees) {
			maxRow = Math.max(maxRow, tree[0]);
			minRow = Math.min(minRow, tree[0]);
			maxCol = Math.max(maxCol, tree[1]);
			minCol = Math.min(minCol, tree[1]);
		}

		List<List<Integer>> nestedResults = new ArrayList<>();

		for (int[] tree : trees) {
			if (tree[0] == maxRow || tree[0] == minRow || tree[1] == maxCol || tree[1] == minCol) {
				nestedResults.add(Arrays.asList(tree[0], tree[1]));
			}
		}

		int[][] result = new int[nestedResults.size()][2];
		int i = 0;

		for (List<Integer> nestedResult : nestedResults) {
			result[i][0] = nestedResult.get(0);
			result[i][1] = nestedResult.get(1);
			i++;
		}
		return result;
	}
}
