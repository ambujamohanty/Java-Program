package javacode;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		/*int rev = 0;
		while (num!=0)
		{
			rev = rev*10+num%10; 
			num =num/10;
			
		}*/
		//Using StringBuffer Class
		/* StringBuffer rev;
		 StringBuffer sb = new StringBuffer(String.valueOf(num));
		 StringBuffer rev1 = sb.reverse();
		 
		 System.out.println("Reverse number is " + rev1);*/
		 
		 //Using StringBuilder Class
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev1 = sbl.reverse();
		System.out.println("Reverse number is " + rev1);



	}

}
