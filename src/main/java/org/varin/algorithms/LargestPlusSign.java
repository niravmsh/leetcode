package org.varin.algorithms;

import java.util.Arrays;

public class LargestPlusSign {
	public int orderOfLargestPlusSign(int n, int[][] mines) {

		int[][] grid = new int[n][n];

		for (int i = 0; i < n; i++) {
			Arrays.fill(grid[i], n);
		}

		for (int[] m : mines) {
			grid[m[0]][m[1]] = 0;
		}

		for (int i = 0; i < n; i++) {
			
			int l = 0, r = 0, u = 0, d = 0;
			
			for (int j = 0, k = n - 1; j <= k; j++, k--) {

				l = grid[i][j] == 0 ? 0 : l + 1;
				grid[i][j] = Math.min(grid[i][j], l);

				r = grid[i][k] == 0 ? 0 : r + 1;
				grid[i][k] = Math.min(grid[i][k], r);

				u = grid[j][i] == 0 ? 0 : u + 1;
				grid[j][i] = Math.min(grid[j][i], u);

				d = grid[k][i] == 0 ? 0 : d + 1;
				grid[k][i] = Math.min(grid[k][i], d);

			}
		}

		int res = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res = Math.max(res, grid[i][j]);
			}
		}

		return res;

	}

}
