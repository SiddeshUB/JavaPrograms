package JavaPrograms;
public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setData(125, "ramesh", 100);
		System.out.println(s1.getId());
		System.out.println(s1.getMarks());
		System.out.println(s1.getName());
	}

}
