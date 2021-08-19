package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestIslandTest {

	@Test
	public void test() {
		int[][] grid = new int[][] { { 0, 0 }, { 0, 0 } };
		assertEquals(1, new LargestIsland().largestIsland(grid));
		grid = new int[][] { { 0, 0 }, { 0, 1 } };
		assertEquals(2, new LargestIsland().largestIsland(grid));
		grid = new int[][] { { 0, 0 }, { 1, 1 } };
		assertEquals(3, new LargestIsland().largestIsland(grid));
		grid = new int[][] { { 0, 1 }, { 1, 1 } };
		assertEquals(4, new LargestIsland().largestIsland(grid));
		grid = new int[][] { { 1, 1 }, { 1, 1 } };
		assertEquals(4, new LargestIsland().largestIsland(grid));
	}

}