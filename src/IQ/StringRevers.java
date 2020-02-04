package IQ;

public class StringRevers {

	public static void main(String[] args) {
		
		String str="Araba Sevdasi";
		String revers="";
		
		
		for(int i=str.length()-1; i>=0; i--) {
			revers+=str.charAt(i);
		}
		System.out.println(revers);
		
		System.out.println("=======2.WAY=========");
		
		String string="whatever";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(reverse);
		
		String str1="Aksam Ne Zaman musait olursun";
		String a=new StringBuffer(str1).reverse().toString();
		System.out.println(a);
	}
}
