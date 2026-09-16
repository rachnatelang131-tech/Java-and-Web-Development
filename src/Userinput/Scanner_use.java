package Userinput;

import java.util.*;
public class Scanner_use {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name.: ");
		String name = sc.next();
		
		System.out.println("Enter age.: ");
		int age = sc.nextInt();
		
		System.out.println();
		System.out.println(name);
		System.out.println(age);
		
		
	}
	

}
