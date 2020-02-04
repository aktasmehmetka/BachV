package IQ;

import java.util.Arrays;

public class ArrayAccenigSmallToBigger {

	public static void main(String[] args) {

		int[] arr = { 3, 88, 66, 445, 90, 99 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
