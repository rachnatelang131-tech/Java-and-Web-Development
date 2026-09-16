
package Nested_if_else;

import java.util.Scanner;

public class AmusementRide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age.....");
        int age = sc.nextInt();

        System.out.println("Enter your height in cm.....");
        int height = sc.nextInt();

        if (age >= 12) {
            if (height >= 120) {
                System.out.println("You are eligible for the ride.");
            } else {
                System.out.println("You are not eligible because your height is less than 120 cm.");
            }
        } else {
            System.out.println("You are not eligible because your age is less than 12.");
        }
    }
}

