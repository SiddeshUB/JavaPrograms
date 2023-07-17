/*Write a java to take user input as a number 1-5 
 * and print the number in English word*/


import java.util.Scanner;

public class WordNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number b/w 1-5");
		int num = scan.nextInt();
		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}
