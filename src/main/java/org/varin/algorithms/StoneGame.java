package org.varin.algorithms;

public class StoneGame {

	public boolean stoneGame(int[] piles) {

		int[][][] counter = new int[2][piles.length][piles.length];

		return stoneGame(piles, counter, 0, piles.length - 1, 0) > 0;

	}

	private int stoneGame(int[] piles, int[][][] counter, int start, int end, int isFirstPlayer) {

		int result = 0;

		if (start > end) {
			return result;
		}

		if (counter[isFirstPlayer][start][end] != 0) {
			return counter[isFirstPlayer][start][end];
		}

		if (isFirstPlayer == 0) {

			result = Math.max(stoneGame(piles, counter, start + 1, end, 1) + piles[start],
					stoneGame(piles, counter, start, end - 1, 1) + piles[end]);
			counter[0][start][end] = result;
		} else {
			result = Math.min(stoneGame(piles, counter, start + 1, end, 0) - piles[start],
					stoneGame(piles, counter, start, end - 1, 0) - piles[end]);
			counter[1][start][end] = result;
		}

		return result;

	}

}
