package PCK1;


public class Student {
	Person p;
	String Major;
	double GPA;
	int studentId;

	public Student(int studentId,String Major, double GPA) {
		this.GPA = GPA;
		this.Major = Major;
		this.studentId = studentId;

	}
	public Student() {

	}
	
	public void displayData() {
		System.out.println("ID = " + p.id);
		System.out.println("Name = " + p.firstName + " " + p.lastName);
		System.out.println("Student ID = " + studentId);
		System.out.println("GPA = " + GPA);
		System.out.println("Major = " + Major + "\n");
	}
}
