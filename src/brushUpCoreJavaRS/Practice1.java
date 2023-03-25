package brushUpCoreJavaRS;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="payment $100 paid";// this syntax is only valid for String class object
		System.out.println(str.charAt(8));
		//String str1 = new String ("payment $100 paid");// generic syntax
		String str1 = "paymens $100 paid";
		System.out.println(str1.indexOf("$"));
		System.out.println(str.substring(8));
		
		

	}

}
