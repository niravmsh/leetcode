package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumProfitJobSchedulingTest {

	@Test
	public void testJobScheduling() {
		int[] startTime, endTime, profit;

		startTime = new int[] { 1, 2, 3, 3 };
		endTime = new int[] { 3, 4, 5, 6 };
		profit = new int[] { 50, 10, 40, 70 };

		assertEquals(120, new MaximumProfitJobScheduling().jobScheduling(startTime, endTime, profit));
	}

}
