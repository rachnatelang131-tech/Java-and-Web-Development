package String;

import java.util.Scanner;

public class language {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your favorite programming language....");
		String language = sc.next();
		
		if (language.equals("java")) {
			System.out.println("Java is powerful!");
		}
		else {
			System.out.println(language + " is also great");
		}
	}

}
