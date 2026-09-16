package Conditional_statement;

import java.util.Scanner;

public class Company {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary......");
        int salary = sc.nextInt();

        System.out.println("Enter the year......");
        int year = sc.nextInt();

        if (year > 5) {
            double bonus = salary * 5 / 100;
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("No Bonus");
        }
    }
}