package Inheritance;

import java.util.Scanner;

public class BankAccount {
		
		protected String name;
	    protected int number;
	    protected double balance;
	    
		public void info() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account holder name ...");
	    name = sc.next();
	    
		System.out.println("Enter the account number..");
	    number = sc.nextInt();
	    
	    balance = 125000;
	    System.out.println("Bank balance is..." + balance);
		
		
		}
	}


