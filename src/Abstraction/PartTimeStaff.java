package Abstraction;

import java.util.Scanner;


public class PartTimeStaff extends Staff {
    int hours;
    double ratePerHour;

    Scanner sc = new Scanner(System.in);

    @Override
    void readdetails() {
        System.out.println("Enter name:");
        name = sc.nextLine();

        System.out.println("Enter address:");
        address = sc.nextLine();

        System.out.println("Enter number of hours:");
        hours = sc.nextInt();

        System.out.println("Enter rate per hour:");
        ratePerHour = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    void showdetails() {
        System.out.println("Part Time Staff Details");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Number of Hours: " + hours);
        System.out.println("Rate Per Hour: " + ratePerHour);
        System.out.println("Total Salary: " + (hours * ratePerHour));
    }
}