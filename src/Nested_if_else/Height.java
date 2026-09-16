package Nested_if_else;

import java.util.Scanner;

public class Height {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the height..");
		double height = sc.nextDouble(); // in centimeter
		
		if (height < 150) {
			System.out.println("Short");
		}
		else if (height >= 150 && height < 180) {
			System.out.println("Average");
		}
		else {
			System.out.println("Tall");
		}
		
		
		
	}

}
