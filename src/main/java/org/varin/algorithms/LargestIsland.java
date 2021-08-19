package org.varin.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LargestIsland {
	public int largestIsland(int[][] grid) {

		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}

		int m = grid.length;
		int n = grid[0].length;
		int islandNumber = 2;
		HashMap<Integer, Integer> sizeMap = new HashMap<Integer, Integer>();
		int largestSize = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					int size = getIslandSize(grid, i, j, islandNumber);
					sizeMap.put(islandNumber++, size);
					largestSize = Math.max(size, largestSize);
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 0) {
					Set<Integer> set = new HashSet<>();
					updateSet(set, i - 1, j, grid);
					updateSet(set, i + 1, j, grid);
					updateSet(set, i, j - 1, grid);
					updateSet(set, i, j + 1, grid);
					int sum = 1;
					for (int num : set) {
						int value = sizeMap.get(num);
						sum += value;
					}
					largestSize = Math.max(sum, largestSize);
				}
			}
		}
		return largestSize;
	}

	private void updateSet(Set<Integer> set, int i, int j, int[][] grid) {
		if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] != 0) {
			set.add(grid[i][j]);
		}
	}

	private int getIslandSize(int[][] grid, int i, int j, int islandNumber) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
			return 0;
		}
		grid[i][j] = islandNumber;
		int leftIslandSize = getIslandSize(grid, i - 1, j, islandNumber);
		int rightIslandSize = getIslandSize(grid, i + 1, j, islandNumber);
		int upIslandSize = getIslandSize(grid, i, j - 1, islandNumber);
		int downIslandSize = getIslandSize(grid, i, j + 1, islandNumber);

		return leftIslandSize + rightIslandSize + upIslandSize + downIslandSize + 1;
	}
}
