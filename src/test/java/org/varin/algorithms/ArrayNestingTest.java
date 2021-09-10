package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayNestingTest {

	@Test
	public void test() {
		assertEquals(4, new ArrayNesting().arrayNesting(new int[] { 5, 4, 0, 3, 1, 6, 2 }));
		assertEquals(1, new ArrayNesting().arrayNesting(new int[] { 0, 1, 2 }));
		assertEquals(2, new ArrayNesting().arrayNesting(new int[] { 0, 2, 1 }));
	}

}
