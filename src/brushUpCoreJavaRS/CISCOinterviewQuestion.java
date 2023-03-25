package brushUpCoreJavaRS;

public class CISCOinterviewQuestion {

	public static void main(String[] args) {
		/*
		 * 2 11 5
		 * 3 13 7
		 * 1 3 9
		 */

		// step 1: find minimum number
		// step 2: After finding the minimum number identify the column of minimum
		// number
		// find the maximum number in identified column
		int abc[][] = { { 2, 11, 5 }, { 3, 13, 7 }, { 1, 3, 9 } };
		int min = abc[0][0];
		int mincoloumn = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
					System.out.println("Minimum number is " + min);// step 1
					mincoloumn = j;
				}

			}
		}
		int max = abc[0][mincoloumn];
		int k =0;
		while (k < 3) {
			if (abc[k][mincoloumn] > max) 
			{
               max = abc[k][mincoloumn];
               
			}
			k++;
			}
		
		System.out.println("Maximum value on the minimum number row is " + max);

	}
}