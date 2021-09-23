package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmeticSlicesTwoSubsequenceTest {

	@Test
	public void testNumberOfArithmeticSlices() {
		int[] nums;

		nums = new int[] { 2, 4, 6, 8, 10 };
		assertEquals(7, new ArithmeticSlicesTwoSubsequence().numberOfArithmeticSlices(nums));

		nums = new int[] { 7, 7, 7, 7, 7 };
		assertEquals(16, new ArithmeticSlicesTwoSubsequence().numberOfArithmeticSlices(nums));
	}

}
