package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComplexNumberMultiplicationTest {

	@Test
	public void testComplexNumberMultiply() {
		assertEquals("0+2i", new ComplexNumberMultiplication().complexNumberMultiply("1+1i", "1+1i"));
		assertEquals("0+-2i", new ComplexNumberMultiplication().complexNumberMultiply("1+-1i", "1+-1i"));
		assertEquals("1+0i", new ComplexNumberMultiplication().complexNumberMultiply("1+0i", "1+0i"));
	}

}
