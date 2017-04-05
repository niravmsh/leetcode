package org.varin.algorithms;

public class RomanToInteger {
	public int romanToInt(String s) {
		char[] input = s.toCharArray();
		int output = 0;
		for (int i = 0; i < input.length; i++) {
			switch (input[i]) {
			case 'I':
				if (i != input.length - 1 && (input[i + 1] == 'V' || input[i + 1] == 'X')) {
					output -= 1;
				} else {
					output += 1;
				}
				break;
			case 'V':
				output += 5;
				break;
			case 'X':
				if (i != input.length - 1 && (input[i + 1] == 'L' || input[i + 1] == 'C')) {
					output -= 10;
				} else {
					output += 10;
				}
				break;
			case 'L':
				output += 50;
				break;
			case 'C':
				if (i != input.length - 1 && (input[i + 1] == 'D' || input[i + 1] == 'M')) {
					output -= 100;
				} else {
					output += 100;
				}
				break;
			case 'D':
				output += 500;
				break;
			case 'M':
				output += 1000;
				break;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		RomanToInteger romanToInteger = new RomanToInteger();
		System.out.println(romanToInteger.romanToInt("DCXXI"));
	}
}
