package brushUpCoreJavaRS;

public class NestedIF {

	public static void main(String[] args) {

		String Address = "odisha,India";
		if (Address.endsWith("India")) {
			if (Address.contains("Meerut")) {
				System.out.println("Your city is Meerut");
			} else if (Address.contains("Noida")) {
				System.out.println("Your city is Noida");
			} else {
				System.out.println(Address);//.split(",")[0](if you want to see only city
			}
		} else {
			System.out.println("You are not living in India");
		}
	}
}