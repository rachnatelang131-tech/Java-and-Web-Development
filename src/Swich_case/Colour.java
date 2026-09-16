package Swich_case;

import java.util.Scanner;

public class Colour {
	public static void main(String[] args) {
		
		System.out.println("******Menu******");
		System.out.println("1 for red");
		System.out.println("2 for green");
		System.out.println("3 for yellow");
		
		System.out.println("Enter the choice.........");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch (choice) {
		
		case 1 : {
			System.out.println("Stop");
			break;
		}
		
		case 2 : {
			System.out.println("Go");
			break;
		}
		
		case 3 : {
			System.out.println("Wait");
			break;
		}
		default : System.out.println("Invalid choice");
		
		}
		
		
	}

}
