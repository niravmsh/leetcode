package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMinimumInRotatedSortedArrayTest {

	@Test
	public void testFindMin() {
		assertEquals(1, new FindMinimumInRotatedSortedArray().findMin(new int[] { 3, 4, 5, 1, 2 }));
		assertEquals(0, new FindMinimumInRotatedSortedArray().findMin(new int[] { 4, 5, 6, 7, 0, 1, 2 }));
		assertEquals(11, new FindMinimumInRotatedSortedArray().findMin(new int[] { 11, 13, 15, 17 }));
		assertEquals(1, new FindMinimumInRotatedSortedArray().findMin(new int[] { 2, 1 }));
		assertEquals(1, new FindMinimumInRotatedSortedArray().findMin(new int[] { 2, 3, 4, 5, 1 }));
	}

}
