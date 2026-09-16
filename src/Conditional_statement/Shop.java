package Conditional_statement;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the quantity ");
		int quantity = sc.nextInt();
		
		int total_cost = quantity * 100;
		System.out.println("Total cost is  " + total_cost );
		
		double discount = (total_cost * 10) / 100;
		System.out.println("Discount is..." + discount);
		
		double final_cost = total_cost - discount;
		
		if (total_cost > 1000) {
			System.out.println("Cost with discount is..." + final_cost );
		}
		else {
			System.out.println("No discount");
		}
	}

}
