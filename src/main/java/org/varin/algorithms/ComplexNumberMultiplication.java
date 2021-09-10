package org.varin.algorithms;

public class ComplexNumberMultiplication {
	public String complexNumberMultiply(String num1, String num2) {

		int index1 = num1.indexOf('+');
		int index2 = num2.indexOf('+');

		int real1 = Integer.valueOf(num1.substring(0, index1));
		int real2 = Integer.valueOf(num2.substring(0, index2));

		int imag1 = Integer.valueOf(num1.substring(index1 + 1, num1.length() - 1));
		int imag2 = Integer.valueOf(num2.substring(index2 + 1, num2.length() - 1));

		return new StringBuilder()
				.append((real1 * real2) - (imag1 * imag2))
				.append("+")
				.append((real1 * imag2) + (real2 * imag1))
				.append("i")
				.toString();
	}
}
