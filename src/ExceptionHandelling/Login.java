package ExceptionHandelling;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  try {
	            System.out.print("Enter username: ");
	            String user = sc.nextLine();

	            System.out.print("Enter password: ");
	            String pass = sc.nextLine();

	            if (user.isEmpty() || pass.isEmpty())
	                throw new IllegalArgumentException("Fields cannot be empty");

	            System.out.println("Login successful!");
	        }
	        catch (NullPointerException e) {
	            System.out.println("Missing input!");
	        }
	        catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
