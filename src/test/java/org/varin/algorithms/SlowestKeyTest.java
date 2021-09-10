package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SlowestKeyTest {

	@Test
	public void testSlowestKey() {
		int[] releaseTimes = new int[] { 9, 29, 49, 50 };
		String keysPressed = "cbcd";
		assertEquals('c', new SlowestKey().slowestKey(releaseTimes, keysPressed));
	}

}
