package Array;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int evencount = 0, oddcount = 0;
		
		System.out.println("Enter the numbers...");
		
		int num[] = new int[6];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			if (num[i] %2 == 0 ) {
				evencount++;
				}
		    else {
			   oddcount++;
		    
		}
		
	}
	
	System.out.println("Even numbers..." + evencount);
	System.out.println("odd numbers..." + oddcount);



	}
}
