package org.varin.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class RankTransformMatrix {
	public int[][] matrixRankTransform(int[][] matrix) {

		int colCount = matrix[0].length;
		int rowCount = matrix.length;

		int[][] result = new int[rowCount][colCount];

		int[] lowestColRank = new int[colCount];
		int[] lowestRowRank = new int[rowCount];

		for (int index = 0; index < colCount; index++) {
			lowestColRank[index] = 1;
		}

		for (int index = 0; index < rowCount; index++) {
			lowestRowRank[index] = 1;
		}

		TreeMap<Integer, List<int[]>> treemap = new TreeMap<>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int value = matrix[i][j];
				treemap.putIfAbsent(value, new ArrayList<>());
				treemap.get(value).add(new int[] { i, j });
			}
		}

		for (Integer key : treemap.keySet()) {

			List<int[]> locationList = treemap.get(key);

			int currentKeyRank = 1;

			for (int[] location : locationList) {
				int colIndex = location[1];
				int rowIndex = location[0];

				currentKeyRank = Math.max(lowestColRank[colIndex], currentKeyRank);
				currentKeyRank = Math.max(lowestRowRank[rowIndex], currentKeyRank);

				result[rowIndex][colIndex] = currentKeyRank;
			}

			for (int[] location : locationList) {
				int colIndex = location[1];
				int rowIndex = location[0];

				lowestColRank[colIndex] = currentKeyRank + 1;
				lowestRowRank[rowIndex] = currentKeyRank + 1;
			}
		}

		return result;
	}
}
