package Conditional_statement;

import java.util.Scanner;

public class Divisible_by_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		
		if (num %3 == 0 ) {
			System.out.println("Divisible by 3 ");
		}
		else {
			System.out.println("Not divisble by 3");
		}
	}

}
