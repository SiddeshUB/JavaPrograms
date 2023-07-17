/* Write a java program to accept user input as a number 
 * and check weather it is in the range 1-10 print range 1 
 * if it is in range 11-20 then print range 2 so on.
 * if number is not in any range then print outside range*/

import java.util.Scanner;

public class RangeoneTofourty {

	public static void main(String[] args) 
	{ 
		//Creating the object of Scanner class
		Scanner scan = new Scanner(System.in);
//		Asking user to enter a number
		System.out.println("Enter the number");
//		Storing the number in num variable
		int num = scan.nextInt();
//		Checking whether a number is in range from 1 to 10
		if (num>=1  && num<=10){
			System.out.println("Range one");
		}
//		Checking whether a number is in range from 11 to 20

		else if (num>=11 && num<=20) {
			System.out.println("Range two");
		}
//		Checking whether a number is in range from 21 to 30
		else if (num>=21 && num<=30) {
			System.out.println("Range three");
		}
//		Checking whether a number is in range from 31 to 40
		else if (num>=31 && num<=40) {
			System.out.println("Range four");
		}
//		Otherwise print out of the range 
		else {
			System.out.println("number is out of range");
		}
	}
	

}
