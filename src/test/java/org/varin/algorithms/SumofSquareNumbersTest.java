package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumofSquareNumbersTest {

	@Test
	public void testJudgeSquareSum() {
		assertEquals(Boolean.TRUE, new SumOfSquareNumbers().judgeSquareSum(4));
		assertEquals(Boolean.FALSE, new SumOfSquareNumbers().judgeSquareSum(3));
		assertEquals(Boolean.TRUE, new SumOfSquareNumbers().judgeSquareSum(2));
		assertEquals(Boolean.TRUE, new SumOfSquareNumbers().judgeSquareSum(1));
		assertEquals(Boolean.TRUE, new SumOfSquareNumbers().judgeSquareSum(0));
		assertEquals(Boolean.FALSE, new SumOfSquareNumbers().judgeSquareSum(2147482647));
	}

}
