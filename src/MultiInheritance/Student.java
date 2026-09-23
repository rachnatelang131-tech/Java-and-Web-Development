package MultiInheritance;

public class Student extends Teacher{
	public void student(int rollno, String name, double marks) {
		System.out.println("Student roll no is " + rollno);
		System.out.println("Student name is " + name);
		System.out.println("Student marks are " + marks);
	}
	public static void main(String[] args) {
		Student s = new Student();
		Teacher t = new Teacher();
		School p = new School();
	
		s.student(12, "rachna", 98);
		
	}

}
