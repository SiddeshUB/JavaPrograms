/*you are a teacher teaching in five different schools where each have two classrom 
 * and every classrom have 10 students.Your job is check the assingnment 
 * by the student and after checking you came to know that is school number is odd 
 * and student number is even the student have complete the assingment.
 * If school number is even and student number is odd the student 
 * not completed the assingment and all other students still doing the assingment 
 * display the message in all assingnment are checked .
 * if student have completed the assingment then 
 * print student 1 of class 1 of school 1 has completed the assingment*/
public class TeacherClass {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=2;j++) {
				for (int k=1;k<=10;k++) {
					if (i%2!=0 && k%2==0) {
						System.out.println("Student "+k+" Class "+j+" school "+i +" Student have completed the assingment");
					}
					else if(i%2==0 && k%2!=0) {
						System.out.println("Student "+k+" Class "+j+" school "+i +" Student have not completed the assingment");

					}
					else {
						System.out.println("Student "+k+" Class "+j+" school "+i +" Student still doing the assingment");

					}
				}
			}
		}
	}

}
