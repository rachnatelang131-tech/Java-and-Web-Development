package Nested_if_else;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks ");
		int marks = sc.nextInt();
		
		if (marks < 40) {
			System.out.println("Grade C");
		}
		else if (marks > 40 && marks < 60 ) {
			System.out.println("Grade B");
		}
		else {
			System.out.println("Grade A");
		}
	}
}
