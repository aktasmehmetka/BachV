package IQ;

import java.util.Arrays;

public class ArrayFindMaximum {

	public static void main(String[] args) {
		
		int[] a= {158,45,625,43,999,99};
		
		Arrays.sort(a);
		int min=a[0];
		System.out.println(min);
		int max=a[a.length-1];
		System.out.println(max);
	}
}
