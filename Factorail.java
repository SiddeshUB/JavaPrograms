/*Write the java program to accepts user input as the number 
 * and print its factorial*/

import java.util.Scanner;

public class Factorail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int f = 1;
		int num = scan.nextInt();
		int i = 1;
		do {
			f *=i;
			i++;
		}while(i<=num);
		System.out.println(f);
	}


}
