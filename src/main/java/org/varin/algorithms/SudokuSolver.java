package org.varin.algorithms;

public class SudokuSolver {

	private static final char DOT_CHAR = '.';

	public void solveSudoku(char[][] grid) {
		sudokuBT(grid);
	}

	public boolean sudokuBT(char[][] grid) {
		int[] ra = Unassigned(grid);
		if (ra[0] == -1) {
			return true;
		}

		int row = ra[0];
		int col = ra[1];

		for (int num = 1; num <= 9; num++) {
			if (isSafe(grid, row, col, num)) {

				grid[row][col] = makeChar(num);
				if (sudokuBT(grid)) {
					return true;
				}
				grid[row][col] = DOT_CHAR;

			}
		}
		return false;
	}

	private char makeChar(int num) {
		return (char) (num + '0');
	}

	public int[] Unassigned(char[][] arr) {

		int[] ra = new int[2]; // returns the position of first unassigned position
		ra[0] = -1;
		ra[1] = -1;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				if (arr[row][col] == DOT_CHAR) {
					ra[0] = row;
					ra[1] = col;
					return ra;
				}
			}
		}

		return ra;

	}// returns the first unassigned position

	public boolean usedInRow(char[][] grid, int row, int num) {
		for (int i = 0; i < grid.length; i++) {
			if (grid[row][i] == makeChar(num)) {
				return true;
			}
		}
		return false;
	}// is it used in that row?

	public boolean usedIncol(char[][] grid, int col, int num) {
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][col] == makeChar(num)) {
				return true;
			}
		}
		return false;
	}// is it used in that col?

	public boolean usedInBox(char[][] grid, int row1Start, int col1Start, int num) {
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				if (grid[row + row1Start][col + col1Start] == makeChar(num)) {
					return true;
				}
		return false;

	}// is it used in that box?

	public boolean isSafe(char[][] grid, int row, int col, int num) {// is it safe to place that number at
																		// that position, might not be correct
																		// nut just safe

		return (!usedIncol(grid, col, num) && !usedInRow(grid, row, num)
				&& !usedInBox(grid, row - row % 3, col - col % 3, num));

	}

}
