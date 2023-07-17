/*Write java program to create calculator which accepts two double values 
 * from the user as enter '+' perform addition,'-' perform subtraction 
 * '*' then multiplication and / then division if other 
 * input is given invalid input */
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
//		creating the scanner class object
		Scanner scan = new Scanner (System.in);
//		Asking the input one from the user
		System.out.println("Enter the first real number ");
//		storing the in num1 
		double num1 = scan.nextDouble();
//		Asking the second  input from the user
		System.out.println("Enter the Second real number ");
		double num2 = scan.nextDouble();
//		Asking the third input  from the user

		System.out.println("Enter the operator");
		char ch = scan.next().charAt(0);
		if (ch =='+') {
			System.out.println("Addition result:"+(num1+num2));	
		}
		else if (ch =='-') {
			System.out.println("Subtraction result:"+(num1-num2));	
		}
		else if (ch =='*') {
			System.out.println("Multiplication result:"+(num1*num2));	
		}
		else if (ch =='/') {
			System.out.println("Division result:"+(num1/num2));	
		}
		else {
			System.out.println("Invalid input");
			
		}
	}

}
