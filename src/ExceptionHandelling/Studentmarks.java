package ExceptionHandelling;

import java.util.Scanner;

public class Studentmarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int marks[] = new int[3];
		
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("Enter marks...");
			    marks[i] = sc.nextInt();
			}
			
			System.out.println("Enter index to display 0-2...");
			int index = sc.nextInt();
			
			System.out.println("marks.." + marks[index]);
		}
		catch  (java.util.InputMismatchException e) {
            System.out.println("Enter numeric marks only!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
        
	}

}
