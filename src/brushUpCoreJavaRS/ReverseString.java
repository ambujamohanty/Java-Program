package brushUpCoreJavaRS;

public class ReverseString {

	public static void main(String[] args) {
		// Check if the string is a Pallindrome or not
		String s = "ctc";
		String t = "";
		for (int i = s.length() - 1; i >=0; i--) {
			t = t + s.charAt(i);
		}
		System.out.println(t);
		if (s.toLowerCase().equals(t.toLowerCase()))
		{
		System.out.println("it is a pallindrome");
		}
		else {
			System.out.println("it is not a pallindrome");
		}
	}
}
