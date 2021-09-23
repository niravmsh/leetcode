package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmeticSlicesTest {

	@Test
	public void testNumberOfArithmeticSlices() {
		int[] nums;

		nums = new int[] { 1, 2, 3, 4 };
		assertEquals(3, new ArithmeticSlices().numberOfArithmeticSlices(nums));
	}

}
