package org.varin.algorithms;

public class DuplicateZeros {
	public void duplicateZeros(int[] arr) {
		for (int index = 0; index < arr.length - 1; ++index) {
			if (arr[index] == 0) {
				shiftArray(arr, ++index);
				arr[index] = 0;
			}
		}
	}

	public void shiftArray(int[] arr, int index) {
		for (int ptr = arr.length - 1; ptr > index; ptr--) {
			arr[ptr] = arr[ptr - 1];
		}
	}
}
