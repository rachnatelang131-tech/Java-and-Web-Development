package Constructor;

public class School {
	
	// constructor with no parameter
	public School() {
		System.out.println("Student name is unknoun");
	}
	
	// constructor with parameter
	public School(String name) {
		System.out.println("Student name is " + name);
	}
	
	public static void main(String[] args) {
		School s1 = new School();
		School s2 = new School("Rachna");
	}

}
