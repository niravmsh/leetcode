package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SubsetsTwoTest {

	@Test
	public void testSubsetsWithDup() {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList());
		expected.add(Arrays.asList(1));
		expected.add(Arrays.asList(1, 2));
		expected.add(Arrays.asList(1, 2, 2));
		expected.add(Arrays.asList(2));
		expected.add(Arrays.asList(2, 2));
		assertEquals(expected, new SubsetsTwo().subsetsWithDup(new int[] { 1, 2, 2 }));
	}

}