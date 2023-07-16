/*Write a java program to take two user input and store them in the variables 
 * and display the values before swaping and after swaping */

import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
//		creating scanner object from scanner class object 
		Scanner scan = new Scanner(System.in);
//		Asking the first user input
		System.out.println("Enter the first number");
//		Storing value integer type value in variable
		int num1 = scan.nextInt();
//		Asking the second user input
		System.out.println("Enter the second number");
//		Storing value integer type value in variable
		int num2 = scan.nextInt();
//		print the values before swaping
		System.out.println("Before Swaping");
		System.out.println("Num1="+num1);
		System.out.println("Num2="+num2);
//		with using another variable
//		int x=num2;
//		num2=num1;
//		num1=x;
//		System.out.println("After Swaping");
//		System.out.println("Num1="+num1);
//		System.out.println("Num2="+num2);
		
		
//		without using another variable
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
//		print the values after swaping 
		System.out.println("After Swaping");
		System.out.println("Num1="+num1);
		System.out.println("Num2="+num2);
	}

}
