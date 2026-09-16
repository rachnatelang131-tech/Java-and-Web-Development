package String;

import java.util.Scanner;

public class Details {
	public void details(String name, int age, int rollno, double percentage) {
		System.out.println("Student name " + name);
		System.out.println("Age is " + age);
		System.out.println("Rollno is " + rollno);
		System.out.println("Percentage is " + percentage);
}
public static void main(String[] args) {
	Details d = new Details();
	d.details("rachna", 20, 56, 98.60);
}
	
}
