package ExceptionHandelling;

import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter Withdrawl amount...");
			double amount = sc.nextDouble();
			
			System.out.println("enter the number of months...");
			int months = sc.nextInt();
			
			if (amount < 0 || months < 0) 
                throw new IllegalArgumentException("Negative value not allowed");
				
			 double result = amount / months;
	            System.out.println("Monthly amount: " + result);
	        }
		 catch (ArithmeticException e) {
	            System.out.println("Arithmetic error!");
	        }
	        catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (java.util.InputMismatchException e) {
	            System.out.println("Invalid input!");
	        }
	}

}
