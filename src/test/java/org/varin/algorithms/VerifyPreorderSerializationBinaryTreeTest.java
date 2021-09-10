package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VerifyPreorderSerializationBinaryTreeTest {

	@Test
	public void testIsValidSerialization() {
		assertEquals(Boolean.TRUE,
				new VerifyPreorderSerializationBinaryTree().isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
	}

}
