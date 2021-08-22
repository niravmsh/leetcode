package org.varin.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidSudoku {
	
	private static final char BLANK_CHAR = '.';

	public boolean isValidSudoku(char[][] board) {
		Map<Integer, List<Character>> rowMap = new HashMap<>();
		Map<Integer, List<Character>> colMap = new HashMap<>();
		Map<Integer, List<Character>> boxMap = new HashMap<>();

		for (int i = 0; i < 9; i++) {
			rowMap.put(i, new ArrayList<>());
			colMap.put(i, new ArrayList<>());
			boxMap.put(i, new ArrayList<>());
		}

		for (int i = board.length - 1; i >= 0; i--) {
			for (int j = board[0].length - 1; j >= 0; j--) {
				if (board[i][j] != BLANK_CHAR) {

					if (rowMap.get(i).contains(board[i][j]) || colMap.get(j).contains(board[i][j])
							|| boxMap.get(getBoxNum(i, j)).contains(board[i][j])) {
						return false;
					}

					rowMap.get(i).add(board[i][j]);

					colMap.get(j).add(board[i][j]);

					boxMap.get(getBoxNum(i, j)).add(board[i][j]);

				}
			}
		}
		return true;
	}

	private int getBoxNum(int i, int j) {
		if (i <= 2 && j <= 2) {
			return 0;
		} else if (i <= 2 && j <= 5) {
			return 1;
		} else if (i <= 2 && j <= 8) {
			return 2;
		} else if (i <= 5 && j <= 2) {
			return 3;
		} else if (i <= 5 && j <= 5) {
			return 4;
		} else if (i <= 5 && j <= 8) {
			return 5;
		} else if (i <= 8 && j <= 2) {
			return 6;
		} else if (i <= 8 && j <= 5) {
			return 7;
		} else if (i <= 8 && j <= 8) {
			return 8;
		}
		return -1;
	}
}
