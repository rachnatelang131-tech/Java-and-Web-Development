package Encapsulation;

import java.util.Scanner;

public class mainss {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount b = new BankAccount();

        System.out.println("Enter account number..");
        int accountnum = sc.nextInt();

        System.out.println("Enter balance..");
        double balance = sc.nextDouble();

        b.setaccountnum(accountnum);
        b.setbalance(balance);

        System.out.println("Account Number: " + b.getaccountnum());
        System.out.println("Balance: " + b.getbalance());
    }
}