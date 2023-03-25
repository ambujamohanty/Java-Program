package brushUpCoreJavaRS;

public class Pallindrome {

	public static void main(String[] args) {
		int r, rev = 0, temp;
		int n = 12321;

		temp = n;
		while (n > 0) {
			r = n % 10;// remainder
			rev = (rev * 10) + r;
			n = n / 10;
		}
		if (temp == rev)
			System.out.println("Pallindrome number");
		else
			System.out.println("not pallindrome");
	}

}
