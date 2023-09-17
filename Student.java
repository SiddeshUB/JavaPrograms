package JavaPrograms;
public class Student {
	private int id;
	private String name;
	private int marks;
	
	public void setData(int x,String y,int z) {
		id = x;
		name = y;
		marks = z;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	
}
