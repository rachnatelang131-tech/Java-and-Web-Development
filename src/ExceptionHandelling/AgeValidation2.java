package ExceptionHandelling;

import java.util.Scanner;

class InvalidAgeException extends Exception {}

public class AgeValidation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age < 18)
                throw new InvalidAgeException();

            System.out.println("Eligible");
        }
        catch (InvalidAgeException e) {
            System.out.println("Age must be 18 or above");
        }
    }
}