package Nested_if_else;

import java.util.Scanner;

public class DigitNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 999.....");
        int number = sc.nextInt();

        if (number >= 1) {
            if (number <= 9) {
                System.out.println("It is a one-digit number.");
            } else if (number <= 99) {
                System.out.println("It is a two-digit number.");
            } else if (number <= 999) {
                System.out.println("It is a three-digit number.");
            } else {
                System.out.println("Invalid number.");
            }
        } else {
            System.out.println("Invalid number.");
        }
    }
}



