package Conditional_statement;

import java.util.Scanner;

public class Withdrawl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account balance:");
        double balance = sc.nextDouble();

        System.out.println("Enter withdrawal amount:");
        double withdrawal = sc.nextDouble();

        if (balance > withdrawal) {
            double remainingBalance = balance - withdrawal;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: rs" + remainingBalance);
        } 
        else {
            System.out.println("Insufficient Balance");
        }
    }
}
