package javacode;
//Java Program to demonstrate the example of Switch statement  
//where we are printing month name for the given number 
public class MonthPrint {

	public static void main(String[] args) {
		int month = 12;
		String monthName="";
		switch (month) {
		case 1:
			System.out.println("January");
		break;
		case 2:
			System.out.println("February");
		break;
		case 3:
			System.out.println("march");
		break;
		case 4:
			System.out.println("April");
		break;
		case 5:
			System.out.println("may");
		break;
		case 6:
			System.out.println("june");
		break;
		case 7:
			System.out.println("july");
		break;
		case 8:
			System.out.println("August");
		break;
		case 9:
			System.out.println("september");
		break;
		case 10:
			System.out.println("october");
		break;
		case 11:
			System.out.println("november");
		break;
		case 12:
			System.out.println("December");
		break;
		
		default:System.out.println("Invalid");
		}	

	}

}
