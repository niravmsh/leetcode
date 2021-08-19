package org.varin.algorithms;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StoneGameTest {

	@Test
	public void test() {

		int[] piles = new int[] { 5, 3, 4, 5 };
		assertTrue(new StoneGame().stoneGame(piles));

		piles = new int[] { 5, 4, 3, 5 };
		assertTrue(new StoneGame().stoneGame(piles));

		piles = new int[] { 3, 7, 2, 3 };
		assertTrue(new StoneGame().stoneGame(piles));

		piles = new int[] { 7, 7, 12, 16, 41, 48, 41, 48, 11, 9, 34, 2, 44, 30, 27, 12, 11, 39, 31, 8, 23, 11, 47, 25,
				15, 23, 4, 17, 11, 50, 16, 50, 38, 34, 48, 27, 16, 24, 22, 48, 50, 10, 26, 27, 9, 43, 13, 42, 46, 24 };
		assertTrue(new StoneGame().stoneGame(piles));
	}

}
