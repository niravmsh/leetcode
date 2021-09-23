package org.varin.algorithms;

import java.util.Stack;

public class BasicCalculator {
	public int calculate(String s) {

		int sum = 0;
		int opr = 1;

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			// number
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int num = 0;
				while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					num = num * 10 + s.charAt(i) - '0';
					i++;
				}
				sum += opr * num;
				i--;
			}

			// +
			else if (s.charAt(i) == '+') {
				opr = 1;
			}
			// -
			else if (s.charAt(i) == '-') {
				opr = -1;
			}
			// (
			else if (s.charAt(i) == '(') {
				stack.push(sum);
				stack.push(opr);
				sum = 0;
				opr = 1;
			} else if (s.charAt(i) == ')') {
				sum = sum * stack.pop();
				sum = sum + stack.pop();
			}
		}
		return sum;
	}
}
