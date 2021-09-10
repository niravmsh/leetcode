package org.varin.algorithms;

import java.util.HashMap;
import java.util.Map;

public class RangeAdditionTwo {
	
	public int maxCountIfStartingPointOfOpsIsNot00(int m, int n, int[][] ops) {

		Map<String, Integer> matrix = new HashMap<>();

		int maxNumber = 0;
		int maxCount = m * n;

		for (int x = 0; x < m; x++) {
			for (int y = 0; y < n; y++) {
				for (int[] op : ops) {
					if (0 <= x && x < op[0]) {
						if (0 <= y && y < op[1]) {

							int currentCell = matrix.getOrDefault(x + ":" + y, 0) + 1;

							if (maxNumber == currentCell) {
								maxCount++;
							} else if (maxNumber < currentCell) {
								matrix = new HashMap<>();
								maxNumber = currentCell;
								maxCount = 1;
							}
							matrix.put(x + ":" + y, currentCell);
						}
					}
				}
			}
		}

		return maxCount;
	}

	public int maxCount(int m, int n, int[][] ops) {
		
		int minRow = m;
		int minCol = n;
		
		for (int[] op : ops) {
			minRow = Math.min(minRow, op[0]);
			minCol = Math.min(minCol, op[1]);
		}
		
		return minRow * minCol;
	}
}
