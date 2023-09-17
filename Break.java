package JavaPrograms;

/*Write a java program to print the numbers from 1-10 
 * and if number is 7 then stop printing the number*/
public class Break {

	public static void main(String[] args) {
		int i=1;
		do { 
			System.out.println(i);
			i++;
			if (i==7) 
			{
				i++;
				break;
			}
		}
		while (i<=10); 
	}

}
