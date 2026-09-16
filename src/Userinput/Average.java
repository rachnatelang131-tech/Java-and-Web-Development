package Userinput;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the five numbers.:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		double e = sc.nextDouble();
		
		double total = a+b+c+d+e;
		double avg = total/5;
		
		System.out.println("Average is.:" + avg);
		
		
		
	}

}
