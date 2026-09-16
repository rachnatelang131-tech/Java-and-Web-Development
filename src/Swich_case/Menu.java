package Swich_case;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		System.out.println("*****Menu*****");
		System.out.println("1 for even odd");
		System.out.println("2 for +ve -ve");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 : {
			
			System.out.println("Enter number to check even or odd");
			int num = sc.nextInt();
			if (num %2 == 0) {
				System.out.println("even number");
			}
			else {
				System.out.println("odd number");
			}
		}
		break;
		case 2 : {
			
			System.out.println("Enter number to check +ve or -ve");
			int num = sc.nextInt();
			if (num > 0) {
				System.out.println("+ve number");
			}
			else {
				System.out.println("-ve number");
			}
		}
		break;
		default : System.out.println("Invalid choice");
		}
		}
	}


