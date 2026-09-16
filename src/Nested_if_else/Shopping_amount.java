package Nested_if_else;

import java.util.Scanner;

public class Shopping_amount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the shopping amount");
		double amount = sc.nextDouble();  // amount in dollars
		
		double twenty = (amount*20)/100;
		double ten = (amount*10)/100;
		
		if (amount > 500) {
			System.out.println("Discount is ....." + twenty);
		}
		else if (amount > 200 && amount < 500) {
			System.out.println("Discount is....." + ten);
		}
		else {
			System.out.println("No discount");
		}
		
		System.out.println("");
		
	}

}
