/* Write a java program to accept user input as a character
 * and check whether it is upper case letter 
 * or lower case letter or number or special*/

import java.util.Scanner;

public class UpperLowerSpecial {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the character");
		char ch = scan.next().charAt(0);
		if (ch>='a' && ch <='z') {
			System.out.println("Lower case");
		}
		else if (ch>='A' && ch <='Z') {
			System.out.println("Upper case");
			
		}
		else if (ch>='0' && ch <='9') {
			System.out.println("Number");
			
		}
		else {
			System.out.println("Special case");
		}

	}

}
