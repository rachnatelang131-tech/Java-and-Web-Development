package Swich_case;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	
			System.out.println("*****Menu*****");
			System.out.println("1 for addition");
			System.out.println("2 for substraction");
			System.out.println("3 for multiplication");
			System.out.println("4 for division");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1 : {
				
				System.out.println("Enter number to add");
				int num_1 = sc.nextInt();
				int num_2 = sc.nextInt();
				
				int add = num_1 + num_2;
				System.out.println("Addition is " + add);
			break;
			}
			case 2 : {
				
				System.out.println("Enter number to substract");
				int num_1 = sc.nextInt();
				int num_2 = sc.nextInt();
				
				int sub = num_1 - num_2;
				System.out.println("Substraction is " + sub);
			break;
			}
			case 3 : {
				
				System.out.println("Enter number to multiply");
				int num_1 = sc.nextInt();
				int num_2 = sc.nextInt();
				
				int mul = num_1 * num_2;
				System.out.println("Multiplication is " + mul);
			break;
			}
			case 4 : {
				
				System.out.println("Enter number to divide");
				int num_1 = sc.nextInt();
				int num_2 = sc.nextInt();
				
				int div = num_1 / num_2;
				System.out.println("Division is " + div);
			break;
			}
			
			default : System.out.println("Invalid choice");
			}
}
}
