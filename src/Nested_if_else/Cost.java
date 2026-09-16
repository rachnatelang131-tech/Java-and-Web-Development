package Nested_if_else;

import java.util.Scanner;

public class Cost {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the cost_price...");
		int cost_price = sc.nextInt();
		
		System.out.println("Enter the Selling_price...");
		int Selling_price = sc.nextInt();
		
		int profit = Selling_price - cost_price;
		System.out.println("Profit made...." + profit);
		
		if (Selling_price > cost_price) {
			System.out.println("He made profit ");
		}
		else {
			System.out.println("He made loss");
		}
	}

}
