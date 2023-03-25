package brushUpCoreJavaRS;

public class StringConcept {

	public static void main(String[] args) {
		String a ="hello";
		String b ="hello";
		a.concat("World");// only hello will print as its immutable
		String c = a.concat("World");// now hello world will print as it refers to different string 
		System.out.println(a);
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		
		/*//String Buffer and String Builder
		StringBuffer sb = new StringBuffer("hello");
		sb.append("World");
		System.out.println(sb);
		sb.insert(2, "She");
		System.out.println(sb);
		sb.replace(5, 7, "aa");
		System.out.println(sb);
		sb.reverse();//string reverse
		System.out.println(sb);
		StringBuilder sbb = new StringBuilder("Hello");
		//StringBuilder is not thread safe.It is not synchronized ,it is faster
		//can be used like StringBuffer*/
		
	}

}
