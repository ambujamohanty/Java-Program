package brushUpCoreJavaRS;

public class multidimensional {

	public static void main(String[] args) {
		// multidimensional arrays
		/*
		 * 2 4 5
		   3 4 7
		 */

		int a[][] = new int[2][3];// first bracket[2] represents rows,second[3] represents columns
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		//System.out.println(a[1][0]);
		// method 2
		// int b[][]= {{2,4,5},{3,4,7}};
		// System.out.println(a[1] [0]);

		for (int i=0; i<2; i++)// row
		{
			for (int j=0; j<3;j++)// column
			{
				System.out.println(a[i][j]);
			}
		}

	}

}
