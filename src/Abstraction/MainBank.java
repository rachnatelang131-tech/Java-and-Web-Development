package Abstraction;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Bank A");
        System.out.println("2. Bank B");
        System.out.println("3. Bank C");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        if (choice == 1) {
            BankA a = new BankA();
            a.getBalance();
        }
        else if (choice == 2) {
            BankB b = new BankB();
            b.getBalance();
        }
        else if (choice == 3) {
            BankC c = new BankC();
            c.getBalance();
        }
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
