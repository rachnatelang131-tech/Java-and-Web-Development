package Nested_if_else;

import java.util.Scanner;

public class Age_gap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age ");
		int age = sc.nextInt();
		
		if (age < 18) {
			System.out.println("You are Minor");
		}
		else if (age > 18 && age < 60 ) {
			System.out.println("You are adult");
		}
		else {
			System.out.println("You are senior citizen");
		}
	}
}
