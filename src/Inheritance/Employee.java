package Inheritance;

import java.util.Scanner;

public class Employee {
	
	protected String name;
    protected int id;
    protected double salary;
    
	public void info() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the employee name ...");
    name = sc.next();
    
	System.out.println("Enter the employee id..");
    id = sc.nextInt();
    
    System.out.println("Enter the basic salary...");
	salary = sc.nextDouble();
	
	}
}
