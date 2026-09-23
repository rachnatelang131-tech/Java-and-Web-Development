package Inheritance;

import java.util.Scanner;

public class Manager extends Employee{
	public void display() {
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the department..");
	String department = sc.next();
	
	System.out.println("Enter bonus..");
	double bonus = sc.nextDouble();
	
	System.out.println("Your total salary is... ");
	double total = bonus + salary;
	System.out.println("Total salary is " + total);
	
	}
	public static void main(String[] args) {
		Manager m = new Manager();
		m.info();
		m.display();
	}
}
