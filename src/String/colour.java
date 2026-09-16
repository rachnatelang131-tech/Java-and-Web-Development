package String;

import java.util.Scanner;

public class colour {
	public static void main(String[] args) {
		colour c = new colour();
		c.check();
	}
	
	public void check() {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the colour.....");

		String colour  = sc.next();

		
		if (colour.equals("Blue")) {
			System.out.println("Blue is cool!");
		}
		else {
			System.out.println("Nice, Choice");
		}
		
	
	}

}
