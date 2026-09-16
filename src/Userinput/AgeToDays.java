package Userinput;

import java.util.Scanner;

public class AgeToDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age in years: ");
        int age = sc.nextInt();

        int days = age * 365;

        System.out.println("Your age in days is: " + days);
    }
}