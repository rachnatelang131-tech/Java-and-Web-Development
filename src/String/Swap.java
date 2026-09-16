package String;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number....");
		int a = sc.nextInt();
		
		System.out.println("Enter the number....");
		int b = sc.nextInt();
		
		System.out.println("numbers before swap are " + a + " and " + b);
		
		int temp ;
		temp = a; 
		a = b; 
		b = temp;
		
		System.out.println("Swapped numbers are " + a + " and " + b);
		
		
	}

}
