package org.varin.algorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DuplicateZerosTest {

	@Test
	public void testDuplicateZeros() {
		int[] actualArray;
		int[] expectedArray;

		actualArray = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
		expectedArray = new int[] { 1, 0, 0, 2, 3, 0, 0, 4 };

		new DuplicateZeros().duplicateZeros(actualArray);
		assertArrayEquals(expectedArray, actualArray);
	}

}
