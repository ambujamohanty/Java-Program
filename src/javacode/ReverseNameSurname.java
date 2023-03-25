package javacode;

import java.util.Scanner;

public class ReverseNameSurname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ambuja Mohanty
		// Enter a Name - Ambuja Mohanty - Mohanty Ambuja 
		// Enter a Name - Kali Charan Mohapatra - Mohapatra Charan Kali
		// Enter a Name - I am a good boy - boy good a am I
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your line : ");
		
		String str = sc.nextLine();
        sc.close();
        String words[] = str.split("\\s"); 
		String rev = "";
		String a[] = str.split(" ");
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
			
		}
		System.out.println();
		for (int i = a.length - 1; i >= 0; i--) {
			
	     rev = rev+a[i] +" ";
			
		}
		System.out.println(rev);
	}

}