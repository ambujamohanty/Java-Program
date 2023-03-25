package Java;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234, rev = 0;
		for (; num != 0; num /= 10) {
			int result = num % 10;
			rev = rev * 10 + result;
		}
System.out.println(rev);
	}

}
