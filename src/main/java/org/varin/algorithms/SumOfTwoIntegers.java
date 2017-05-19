package org.varin.algorithms;

public class SumOfTwoIntegers {

	public static int getSum(int a, int b) {
		System.out.println(a & b);
		return 0;
	}

	public static void main(String[] args) {
		callAll(5, 4);
		callAll(7, 4);
	}

	private static void callAll(int a, int b) {
		System.out.println(a + " --> " + Integer.toBinaryString(a));
		System.out.println(b + " --> " + Integer.toBinaryString(b));
		and(a, b);
		or(a, b);
		xor(a, b);
		not(a);
		leftShift(a);
		rightShift(a);
		System.out.println("---------------------------------");
	}

	private static void and(int a, int b) {
		System.out.println(a + " & " + b + " = " + (a & b));
	}

	private static void or(int a, int b) {
		System.out.println(a + " | " + b + " = " + (a | b));
	}

	private static void xor(int a, int b) {
		System.out.println(a + " ^ " + b + " = " + (a ^ b));
	}

	private static void not(int a) {
		System.out.println("~" + a + " = " + (~a));
	}

	private static void leftShift(int a) {
		System.out.println(a + " << 1 = " + (a << 1));
	}

	private static void rightShift(int a) {
		System.out.println(a + " >> 1 = " + (a >> 1));
	}

}
