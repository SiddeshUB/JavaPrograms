/*Write a java to print all the -ve odd number and 
 * +ve even numbers from the range -100 to +100 */

// create a class Evenodd
public class EvenOdd {
	public static void main(String[] args) {
//		creating for loop iterate number from range -100 to 100
		for (int i=-100;i<=100;i++) {
//			check the if condition which is not divisible by 2
			if (i%2!=0)  {
//				Checked number  will check is greater than zero
				if (i<0) {
//				print the number which is odd
				System.out.println("Odd "+i);
				}
			}
//			if condition check is false check another condition
			else if (i%2==0 && i>0) {
//				print number which is even
				System.out.println("Even " +i);
			}			
		}
		}
}
