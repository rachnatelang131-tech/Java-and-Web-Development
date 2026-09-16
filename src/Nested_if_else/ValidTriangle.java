package Nested_if_else;

import java.util.Scanner;

public class ValidTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first angle:");
        int angle1 = sc.nextInt();

        System.out.println("Enter the second angle:");
        int angle2 = sc.nextInt();

        System.out.println("Enter the third angle:");
        int angle3 = sc.nextInt();

        int sum = angle1 + angle2 + angle3;

        if (sum == 180) {
            System.out.println("Triangle is valid");
        }
        else {
            System.out.println("Triangle is not valid");
        }
    }
}