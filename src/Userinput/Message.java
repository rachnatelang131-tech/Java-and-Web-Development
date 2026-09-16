package Userinput;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.print("Enter the name.: ");

        String name = sc.next();

        System.out.println("Welcome " + name);
    }
}