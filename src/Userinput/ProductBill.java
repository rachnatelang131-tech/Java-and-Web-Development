package Userinput;

import java.util.Scanner;

public class ProductBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the product name: ");
        String product = sc.next();

        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter the price per item: ");
        double price = sc.nextDouble();

        double total = quantity * price;

        System.out.println("Total amount for " + product + " (" 
                + quantity + " units): " + total);
    }
}