package IQ;

public class IQ3 {

	public static void main(String[] args) {

		// Write a java program to reverse String? Reverse a string word by word?

		String str2 = "Write a java program to reverse String? Reverse a string word by word?";

		char[] array = str2.toCharArray();

		for (int i = str2.length() - 1; i >= 0; i--) {
			System.out.print(array[i] + "");
		}
	}
}
