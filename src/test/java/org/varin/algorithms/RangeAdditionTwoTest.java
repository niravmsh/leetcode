package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RangeAdditionTwoTest {

	@Test
	public void testMaxCount() {
		assertEquals(1,(new RangeAdditionTwo().maxCount(40000, 40000, new int[][] { { 1, 1 } })));
	}

}
