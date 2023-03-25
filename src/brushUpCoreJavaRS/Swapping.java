package brushUpCoreJavaRS;

public class Swapping {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		/*System.out.println("The value of a before swap is " +a);
		System.out.println("The value of b before swap is " +b);
		int temp;
		temp =a;
		a =b;
		b= temp;
		System.out.println("The value of a after swap is " +a);
		System.out.println("The value of b after swap is " +b);*/
		
		//without temp varible
		a = a+b;//a= 21
		b = a-b;//b= 10
		a =  a-b;//a =11
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
	
	
		


	}

}
