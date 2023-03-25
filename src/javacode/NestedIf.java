package javacode;

public class NestedIf {

	public static void main(String[] args) {
		String address = "melbourne,Australia";
	
		if (address.endsWith("India")) {
			if (address.contains("patna")) 
			{
				System.out.println("Your city is Patna");
			}
			else if (address.contains("bhubaneswar"))
			{
				System.out.println("Your city is bhubaneswar");	
			
			}
			else {
				System.out.println(address.split(",")[0]);
			}
		}else {
			System.out.println("You are not an Indian"); 
		}
		

	}

}
