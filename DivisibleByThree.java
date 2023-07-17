/*Write a java program to display the sum of all the numbers 
 * which are divisible by three in the range 1-50*/

// creating class DivisibleByThree
public class DivisibleByThree {
	
	public static void main(String[] args) {
//		create a integer type variable and initialize zero 
		int sum=0;
//		create a for loop given the range from 1-50
		for (int i=1;i<=50;i++) {
//			check the condition number is divisible by three
			if (i%3==0) {
//				add the number with sum value
				sum =sum+i;	
				System.out.println(sum);
			}
		}
		
	}
}
