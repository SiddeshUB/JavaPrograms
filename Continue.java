/* Write a java program to print the numbers from 1-10 
 * (but if number is skip and printing it and print the remaining numbers*/
public class Continue {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
			if (i==7) {
				i++;
				continue;
			}
		}
	}

}
