package Abstraction;

import java.util.Scanner;

public class StaffMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. FullTimeStaff");
        System.out.println("2. PartTimeStaff");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            FullTimeStaff f = new FullTimeStaff();
            f.readdetails();
            f.showdetails();
        }
        else if (choice == 2) {
            PartTimeStaff p = new PartTimeStaff();
            p.readdetails();
            p.showdetails();
        }
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}