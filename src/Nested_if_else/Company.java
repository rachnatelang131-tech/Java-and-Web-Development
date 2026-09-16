package Nested_if_else;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the salary");
		int salary = sc.nextInt();

		System.out.println("Enter the years of experience");
		int experience = sc.nextInt();

		int percent_bonus;

		if(experience > 10) {
			percent_bonus = 10;
		}
		else {
			if(experience >= 6) {
				percent_bonus = 8;
			}
			else {
				percent_bonus = 5;
			}
		}

		int bonus = salary * percent_bonus / 100;

		System.out.println("Bonus = " + bonus);
		System.out.println("Final salary = " + (salary + bonus));
	}
}