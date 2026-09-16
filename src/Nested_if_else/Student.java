package Nested_if_else;

public class Student {
	public void Student(int marks) {
		
		if (marks >= 90) {
			System.out.println("A grade");
		}
		
		else if (marks > 80 && marks < 89) {
			System.out.println("B grade");
			}
		
	    else if (marks > 70 && marks < 79) {
			System.out.println("C grade");
			}
		
		else if (marks > 60 && marks < 69) {
			System.out.println("D grade");
			}
		
		else {
			System.out.println("Fail");
		}	
	  }
	
public static void main(String[] args) {
	Student obj = new Student();
	obj.Student(80);
			
}
}
