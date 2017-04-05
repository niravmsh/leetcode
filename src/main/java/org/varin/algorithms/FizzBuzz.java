package org.varin.algorithms;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”
 */
public class FizzBuzz {

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String FIZZ_BUZZ = "FizzBuzz";

	public List<String> fizzBuzz(int n) {
		int fizz = 0;
		int buzz = 0;

		List<String> output = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {
			fizz++;
			buzz++;
			if (fizz == 3 && buzz == 5) {
				output.add(FIZZ_BUZZ);
				fizz = 0;
				buzz = 0;
			} else if (fizz == 3) {
				output.add(FIZZ);
				fizz = 0;
			} else if (buzz == 5) {
				output.add(BUZZ);
				buzz = 0;
			} else {
				output.add(String.valueOf(i));
			}
		}
		return output;
	}
}
