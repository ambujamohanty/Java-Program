package javacode;

public class NestedIfForAgeWeight {

	public static void main(String[] args) {
		int age = 22;
		int weight =35;
		if (age >18) 
		{
			if (weight >48) {
				System.out.println("Eligible");
		}
			else {
				System.out.println("Not Eligible");
			}

		}else {
			System.out.println("Age should be greater");
		}

		
	}

}
