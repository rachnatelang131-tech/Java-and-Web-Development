package Abstraction;

public abstract class Member {
	String name, address, phone;
	int age;
	double salary;
	
	public abstract void readDetails();
	public void printSalary() {
		  System.out.println("Salary: " + salary);
    }
	public abstract void showDetails();
	}
	