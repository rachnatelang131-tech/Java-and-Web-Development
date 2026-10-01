package Abstraction;

import java.util.Scanner;

public class FullTimeStaff extends Staff {
    String department;
    double salary;

    Scanner sc = new Scanner(System.in);

    @Override
    public void readdetails() {
        System.out.println("Enter name:");
        name = sc.nextLine();

        System.out.println("Enter address:");
        address = sc.nextLine();

        System.out.println("Enter department:");
        department = sc.nextLine();

        System.out.println("Enter salary:");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void showdetails() {
        System.out.println("Full Time Staff Details");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
