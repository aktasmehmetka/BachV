package IQ;

public class IQ2 {

	public static void main(String[] args) {
		
		// Find out how many alpha characters present in a string?

				String str = "he987654$%^&*()llo";

				String str1 = str.replaceAll("[^a-zA-Z]", "");

				System.out.println(str1);
				System.out.println(str1.length());
	}
}
