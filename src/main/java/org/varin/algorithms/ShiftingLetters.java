package org.varin.algorithms;

public class ShiftingLetters {
	public String shiftingLetters(String s, int[] shifts) {

		for (int index = shifts.length - 2; index >= 0; index--) {
			shifts[index] += shifts[index + 1] % 26;
		}

		char[] charArray = s.toCharArray();

		for (int index = 0; index < charArray.length; index++) {

			charArray[index] = (char) ((charArray[index] - 'a' + shifts[index]) % 26 + 'a');

		}

		return String.valueOf(charArray);
	}
}
