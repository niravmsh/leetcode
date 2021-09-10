package org.varin.algorithms;

public class SlowestKey {
	public char slowestKey(int[] releaseTimes, String keysPressed) {

		int maxPressedTime = releaseTimes[0];
		char maxSlowestKey = keysPressed.charAt(0);

		for (int index = 1; index < releaseTimes.length; index++) {
			int currentPressedTime = releaseTimes[index] - releaseTimes[index - 1];
			char currentSlowestKey = keysPressed.charAt(index);

			if (currentPressedTime > maxPressedTime) {
				maxPressedTime = currentPressedTime;
				maxSlowestKey = currentSlowestKey;
			} else if (currentPressedTime == maxPressedTime) {
				maxSlowestKey = currentSlowestKey > maxSlowestKey ? currentSlowestKey : maxSlowestKey;
			}

		}
		
		return maxSlowestKey;

	}
}
