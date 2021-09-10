package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestPlusSignTest {

	@Test
	public void testOrderOfLargestPlusSign() {
		assertEquals(2, new LargestPlusSign().orderOfLargestPlusSign(5, new int[][] { { 4, 2 } }));
	}

}
