package Userinput;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the house number: ");
        int hs = sc.nextInt();

        System.out.print("Enter the street name: ");
        String sn = sc.next();

        System.out.print("Enter the city: ");
        String city = sc.next();

        System.out.println("The address is: " + hs + ", " + sn + ", " + city);

    }
}