package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestUncommonSubsequenceTwoTest {

	@Test
	public void testFindLUSlength() {
		String[] strs;

		strs = new String[] { "aba", "cdc", "eae" };
		assertEquals(3, new LongestUncommonSubsequenceTwo().findLUSlength(strs));

		strs = new String[] { "aaa", "aaa", "aa" };
		assertEquals(-1, new LongestUncommonSubsequenceTwo().findLUSlength(strs));

		strs = new String[] { "aabbcc", "aabbcc", "cb" };
		assertEquals(2, new LongestUncommonSubsequenceTwo().findLUSlength(strs));

		strs = new String[] { "aaa", "acb" };
		assertEquals(3, new LongestUncommonSubsequenceTwo().findLUSlength(strs));
	}

}
