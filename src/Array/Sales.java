package Array;

import java.util.Scanner;

public class Sales {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sale[] = new int[7];
		int sum = 0;
		
		for (int i = 0; i < sale.length; i++) {
			System.out.println("Enter the sales according to week days start from monday" + " " + i + " " + "index");
		    sale [i] = sc.nextInt();
		}
		
		for (int p:sale) {
			System.out.println(p);
			sum = sum + p;
		}
		System.out.println("sum is" + sum);
		System.out.println("avg is " + (sum/sale.length));
	
	}

}
