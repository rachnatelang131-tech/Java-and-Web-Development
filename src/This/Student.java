package This;


public class Student {
	
	String name;
	int age;
	String Address;
	
	// constructor with no parameter
	public Student() {
		this.name = "unknown";
		this.age = 0;
		this.Address = "not available";
	}
	
	// constructor with two parameter
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
		this.Address = "not available";
	}
	
	// constructor with all parameter
	public Student(int age, String name, String Address) {
		this.age = age;
		this.name = name;
		this.Address = Address;
	}
	
	// print
	public void display() {
		System.out.println("Name " + name);
		System.out.println(" ");
		System.out.println("Age " + age);
		System.out.println(" ");
		System.out.println("Address " + Address);
		System.out.println(" ");
	}
	
	//main
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		
		// with two parameter
		Student s2 = new Student(20,"Rachna");
		s2.display();
		
		// with all 
		Student s3 = new Student(28, "Rohan", "Sambhajinagar");
		s3.display();
		
	}

}
