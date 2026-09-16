package Userinput;

import java.util.Scanner;
public class Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers.:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int product = a*b*c;
		int sum = a+b+c;
		
		System.out.println("Product is.:" + product);
		System.out.println("Sum is.: " + sum);

	}

}
