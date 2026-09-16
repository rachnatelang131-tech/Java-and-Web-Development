package Nested_if_else;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        int length = sc.nextInt();

        System.out.println("Enter the breadth:");
        int breadth = sc.nextInt();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        if (area > perimeter) {
            System.out.println("Area is greater than perimeter");
        }
        else {
            System.out.println("Area is not greater than perimeter");
        }
    }
}