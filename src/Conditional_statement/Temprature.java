package Conditional_statement;

import java.util.Scanner;

public class Temprature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature:");
        double temperature = sc.nextDouble();

        if (temperature > 37) {
            System.out.println("Fever");
        } 
        else {
            System.out.println("Normal");
        }   
    }
}
