package ExceptionHandelling;

public class Student {
	
	public static void check (int marks) throws FailException {
		if (marks > 33) {
			throw new FailException();
		}
		else {
			System.out.println("Student passed in exam");
			System.out.println("Student scored..." + marks);
		}
	}
public static void main(String[] args) {
	try {
		check(52);
	}
	catch (FailException e) {
		e.printStackTrace();
	}
}
}
