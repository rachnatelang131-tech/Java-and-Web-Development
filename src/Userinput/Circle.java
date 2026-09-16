package Userinput;


import java.util.Scanner;
public class Circle {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the value of radius.:" );
	
			int r = sc.nextInt();
			double area = 3.14*r*r;
			
			System.out.println("Area is.:" + area);
			
			
			
		}

	}



