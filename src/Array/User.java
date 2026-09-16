package Array;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String colours[] = new String[5];

		for( int i = 0; i < colours.length; i++) {
			System.out.println("Enter the colours" + " " + i + " " + "index");
			colours[i] = sc.next();
			
		}
	
		for(String s:colours) {
			System.out.println(s);
	}
	

}
}