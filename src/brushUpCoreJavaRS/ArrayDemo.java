package brushUpCoreJavaRS;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//Array: is a container which stores multiple values of same data type.
		int a[] = new int[5];//declares an array,allocates memory
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		int b[]= {1,2,3,4,33,78};//we can dynamically assign memory,simpler to declare
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("**********");
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			
		}
		
		
		
	}   
	

}
