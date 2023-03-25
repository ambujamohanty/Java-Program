package javacode;

public class ReverseWord {

	public static void main(String[] args) throws IndexOutOfBoundsException  {
		String s ="Engineer Ambuja Mohanty ";
		for (int i=s.length()-1;i>=0;i--) 
		{
			System.out.println(s.charAt(i));
		}

	}

}
