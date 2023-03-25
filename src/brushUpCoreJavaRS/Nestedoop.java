package brushUpCoreJavaRS;

public class Nestedoop {
	public static void main(String[] args) {
		// Nested loop Works
		for (int i = 1; i <= 4; i++)//outer loop
		{
			System.out.println("Outer loop started");
			for (int j = 1; j <= 4; j++)
			{
				System.out.println("inner loop running");//inner loop
			}
			System.out.println("Outer loop Finished");
		}
			
	}
}