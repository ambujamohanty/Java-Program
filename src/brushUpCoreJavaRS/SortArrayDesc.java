package brushUpCoreJavaRS;

public class SortArrayDesc {

	public static void main(String[] args) {

		int a[] = { 2, 6, 1, 4, 9 };
		int temp;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (a[i] < a[j]) // compare
				{
					/*temp = a[i]; // swap with temp
					a[i] = a[j];
					a[j] = temp;*/
					
					a[i]=a[i]+a[j]; //without temp
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];

				}
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);

		}

	}

}
