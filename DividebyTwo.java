/* Write java program to take user input as the number 
 * than divide with 2 until the Quotient is less equal to 1 
 * and print all the quotients*/

import java.util.Scanner;

public class DividebyTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		while(n>1) {
			System.out.println(n);
			n /= 2;
		}
		System.out.println(n);
	}

}
