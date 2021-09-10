package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecodeWaysTest {

	@Test
	public void testNumDecodings() {
		assertEquals(3, new DecodeWays().numDecodings("123"));
	}

}
