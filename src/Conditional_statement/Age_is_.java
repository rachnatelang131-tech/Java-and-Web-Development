package Conditional_statement;

import java.util.Scanner;

public class Age_is_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  the age.....");
		int age = sc.nextInt();
		
		if (age < 12) {
			System.out.println("Ticket price is 100rs");
		}
		else {
			System.out.println("Ticket price is 200rs");
		}
		}

}
