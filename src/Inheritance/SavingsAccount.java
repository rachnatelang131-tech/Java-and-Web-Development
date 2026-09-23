package Inheritance;

import java.util.Scanner;

public class SavingsAccount extends BankAccount{
	public void display() {
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the Principal..");
	double principal = sc.nextDouble();
	
	System.out.println("Enter rate..");
	int rate = sc.nextInt();
	
	System.out.println("Enter the duration..");
	int time = sc.nextInt();
	
	
	double interest = (principal * rate * time)/ 100;
	System.out.println("Total interest is " + interest);
	
	}
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.info();
		s.display();
	}
}
