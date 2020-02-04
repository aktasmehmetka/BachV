package IQ;

public class StringRemoveDuplicate {

	public static void main(String[] args) {

		String str = "aaaannnnbbbbeeeeccc";
		String dup = "";

		for (int i = 0; i < str.length(); i++) {
			if (dup.indexOf(str.charAt(i)) < 0) {
				dup += str.charAt(i);
			}
		}
		System.out.println(dup);

	}

}
