package org.varin.algorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Ignore;
import org.junit.Test;

public class RankTransformMatrixTest {

	@Test
	@Ignore
	public void testMatrixRankTransform() {

		int[][] matrix = new int[][] { { 1, 2 }, { 3, 4 } };
		int[][] expected = new int[][] { { 1, 2 }, { 2, 3 } };
		assertArrayEquals(expected, new RankTransformMatrix().matrixRankTransform(matrix));

		matrix = new int[][] { { 7, 7 }, { 7, 7 } };
		expected = new int[][] { { 1, 1 }, { 1, 1 } };
		assertArrayEquals(expected, new RankTransformMatrix().matrixRankTransform(matrix));

		matrix = new int[][] { { 20, -21, 14 }, { -19, 4, 19 }, { 22, -47, 24 }, { -19, 4, 19 } };
		expected = new int[][] { { 4, 2, 3 }, { 1, 3, 4 }, { 5, 1, 6 }, { 1, 3, 4 } };
		assertArrayEquals(expected, new RankTransformMatrix().matrixRankTransform(matrix));

		matrix = new int[][] { { -37, -26, -47, -40, -13 }, { 22, -11, -44, 47, -6 }, { -35, 8, -45, 34, -31 },
				{ -16, 23, -6, -43, -20 }, { 47, 38, -27, -8, 43 } };
		expected = new int[][] { { 3, 4, 1, 2, 7 }, { 9, 5, 3, 10, 8 }, { 4, 6, 2, 7, 5 }, { 7, 9, 8, 1, 6 },
				{ 12, 10, 4, 5, 11 } };
		assertArrayEquals(expected, new RankTransformMatrix().matrixRankTransform(matrix));

		matrix = new int[][] { { -37, -50, -3, 44 }, { -37, 46, 13, -32 }, { 47, -42, -3, -40 },
				{ -17, -22, -39, 24 } };
		expected = new int[][] { { 2, 1, 4, 6 }, { 2, 6, 5, 4 }, { 5, 2, 4, 3 }, { 4, 3, 1, 5 } };
		assertArrayEquals(expected, new RankTransformMatrix().matrixRankTransform(matrix));

	}

}
