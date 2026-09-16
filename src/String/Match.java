package String;

import java.util.Scanner;

public class Match {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Password....");
		String password = sc.next();
		
		System.out.println("Enter the confirm password...");
		String Cp = sc.next();
		
		if(password.equals(Cp)) {
			System.out.println("Password matched!");
		}
		else {
			System.out.println("Passwords do not match!");
		}
	}

}
