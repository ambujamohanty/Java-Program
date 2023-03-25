package brushUpCoreJavaRS;

public class PyramidStar {

	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++)// outer loop
		{
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print("*");
				System.out.print("\t");

			}
			System.out.println("");
		}

	}

}
