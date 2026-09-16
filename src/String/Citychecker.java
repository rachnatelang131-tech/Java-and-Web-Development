package String;

import java.util.Scanner;

public class Citychecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the City..");
	
		String Citychecker = sc.next();
		
		if(Citychecker.equals("Mumbai")) {
			System.out.println("You live in Mumbai");
		}
		else {
			System.out.println("You're from nowhere ");
		}
		
		
	}

}
