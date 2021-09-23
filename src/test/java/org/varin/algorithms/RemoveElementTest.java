package org.varin.algorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RemoveElementTest {

	@Test
	public void testRemoveElement() {
		int[] actualArray;
		int[] expectedArray;

		actualArray = new int[] { 3, 2, 2, 3 };
		expectedArray = new int[] { 2, 2, -1, -1 };

		new RemoveElement().removeElement(actualArray, 3);
		assertArrayEquals(expectedArray, actualArray);

		actualArray = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		expectedArray = new int[] { 0, 1, 3, 0, 4, -1, -1, -1 };

		new RemoveElement().removeElement(actualArray, 2);
		assertArrayEquals(expectedArray, actualArray);
	}

}
