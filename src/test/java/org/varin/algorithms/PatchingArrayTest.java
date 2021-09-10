package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatchingArrayTest extends PatchingArray {

	@Test
	public void testMinPatches() {
		assertEquals(28, new PatchingArray().minPatches(new int[] { 1, 2, 31, 33 }, 2147483647));
	}

}
