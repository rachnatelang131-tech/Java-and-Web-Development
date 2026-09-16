package String;

import java.util.Scanner;

public class Username {
	public static void main(String[] args) {
		Username u = new Username();
		u.admin();
	}
	
	public void admin() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the username");

		String username = sc.next();

		if (username.equals("Admin")) {
			System.out.println("Welcome, Admin !!");
		}
		else {
			System.out.println("Invalid user");
		}
	}

}
