package Constructor;

public class Student {
	
	public void S_details(String name, String Address) {
		
		System.out.println("Student name is " + name);
		System.out.println("Address is " + Address);
		
	}
	
	public Student(int m1, int m2, int m3) {
		int total = m1+m2+m3;
		System.out.println("Total marks are ...." + total);
		
	}
	
	public static void main(String[] args) {
		Student s = new Student(20, 30, 50);
		s. S_details("rachna", "pune");
	}

}
