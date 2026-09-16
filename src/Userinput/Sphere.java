package Userinput;

import java.util.Scanner;
public class Sphere {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius.:");
		int r = sc.nextInt();
		
		double area = 4/3*3.14*r*r*r;
		System.out.println("Area of sphere is.: " + area);
		
	}

}
