package Parameter;

public class Student {
	public void st_details(int roll,String name,int m1,int m2) {
		double total = m1+m2;
		System.out.println("Roll no is: " +roll);
		System.out.println("name is: " +name);
		System.out.println("Total Marks is: " +total);
		System.out.println();	
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.st_details(101, "Sanket", 45, 42);
		s.st_details(102, "Rahul", 43, 44);
		s.st_details(103, "Ayush", 44, 48);
		s.st_details(104, "Om", 46, 41);
	}

}
