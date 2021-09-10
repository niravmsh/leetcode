package org.varin.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShiftingLettersTest {

	@Test
	public void testShiftingLetters() {
		String s;
		int[] shifts;

		s = "abc";
		shifts = new int[] { 3, 5, 9 };
		assertEquals("rpl", new ShiftingLetters().shiftingLetters(s, shifts));

		s = "ruu";
		shifts = new int[] { 26, 9, 17 };
		assertEquals("rul", new ShiftingLetters().shiftingLetters(s, shifts));

		s = "bad";
		shifts = new int[] { 10, 20, 30 };
		assertEquals("jyh", new ShiftingLetters().shiftingLetters(s, shifts));

		s = "z";
		shifts = new int[] { 52 };
		assertEquals("z", new ShiftingLetters().shiftingLetters(s, shifts));

		s = "mkgfzkkuxownxvfvxasy";
		shifts = new int[] { 505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950,
				81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837, 622939912,
				116899933, 983296461, 536563513 };
		assertEquals("wqqwlcjnkphhsyvrkdod", new ShiftingLetters().shiftingLetters(s, shifts));
	}

}
