package org.varin.algorithms;

public class LongestUncommonSubsequenceTwo {
	public int findLUSlength(String[] strs) {
		
		int result = -1;

		for (int source = 0; source < strs.length; source++) {
			boolean hasUncommonSubsequence = false;

			for (int destination = 0; destination < strs.length; destination++) {
				if (source == destination) {
					continue;
				}
				if (isSubsequence(strs[source], strs[destination])) {
					hasUncommonSubsequence = true;
				}
			}

			if (!hasUncommonSubsequence) {
				result = Math.max(result, strs[source].length());
			}
		}
		return result;
	}

	private boolean isSubsequence(String source, String destination) {

		int j = 0;
		for (int i = 0; i < source.length(); i++) {
			for (; j < destination.length();) {
				if (source.charAt(i) != destination.charAt(j)) {
					j++;
				} else {
					if (i == source.length() - 1) {
						return true;
					}
					j++;
					break;
				}
			}
		}
		return false;
	}
}
