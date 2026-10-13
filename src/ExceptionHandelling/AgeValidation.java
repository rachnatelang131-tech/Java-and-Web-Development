package ExceptionHandelling;

import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age < 0 || age > 120)
                throw new Exception();

            System.out.println("Registration successful");
        }
        catch (Exception e) {
            System.out.println("Invalid age!");
        }
    }
}
