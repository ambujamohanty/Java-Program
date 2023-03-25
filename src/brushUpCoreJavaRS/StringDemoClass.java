package brushUpCoreJavaRS;

public class StringDemoClass {

	public static void main(String[] args) {
		// string: it is one of the prebuilt classes in java
		/* 1.string Literal
		 * 2. by creating object of string
		 */
		
		String a =" javatraining"; //method 1 declaration
		//String ab = new String ("Declaring string using object creation"); //method 2 declaration
		//System.out.println(ab);
		a.charAt(2);
		System.out.println(a.charAt(2));
		a.indexOf("i");
		System.out.println(a.indexOf("i"));
		System.out.println(a.subSequence(3,9));
		System.out.println(a.substring(6));
		System.out.println(a.concat("by Rahul Shetty"));
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		//split
		
		String arr[]=a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);

	}

}
