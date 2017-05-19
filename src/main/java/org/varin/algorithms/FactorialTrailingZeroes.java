package org.varin.algorithms;

public class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
		int result = 0;
		while (n > 0) {
			result += n / 5;
			n = n / 5;
		}
		return result;
	}
	
	public int trailingZeroesRecurring(int n) {
		if (n == 0) {
			return 0;
		}
		return (n / 5) + trailingZeroesRecurring(n / 5);
	}
	
}
