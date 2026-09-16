package Conditional_statement;

public class Square_rectangle {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		
		if (a == b && b == c && c == d) {
			System.out.println("This is Square");
		}
		else if (a == c && b == d) {
			System.out.println("This is rectangle");
		}
		else {
			System.out.println("Neither square nor recatngle");
		}	
	}
}
