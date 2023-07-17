/*Write a java program for the below scenario there are four friends 
 * 'Ajay' leaves in Delhi,'Arjun' leaves in pune,
 * 'Ankit' leaves in Bangalore and 'Akash' leaves in Hydrabad.
 * Take the input as the of the user and print name 
 * and respective city if the entered name not matching 
 * with above given name then print name India */

import java.util.Scanner;
public class NameAscity {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name ");
		String a = scan.nextLine();
		switch (a) {
		case "Ajay":
			System.out.println("Delhi");
			break;
		case "Arjun":
			System.out.println("Pune");
			break;
		case "Ankit":
			System.out.println("Banglore");
			break;
		case "Akash":
			System.out.println("Hyderabad");
			break;
		default:
			System.out.println(a+" India");
		}
		
	}
}
