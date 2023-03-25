package brushUpCoreJavaRS;

public class PrintTheStringinReverse {

	public static void main(String[] args) {
		// if you do reverse then it should be same
		String s = "AMBU";
		String t = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);

			//System.out.println(s);
			
		}
		System.out.println(t);
			if (s == t) {
				System.out.println("it is reversed");
			
		}
	}

}
