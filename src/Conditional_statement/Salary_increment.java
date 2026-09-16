package Conditional_statement;

import java.util.Scanner;

public class Salary_increment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter performance rating:");
        double rating = sc.nextDouble();

        if (rating > 8) {
            double increment = salary * 10 / 100;
            double finalSalary = salary + increment;

            System.out.println("Increment Amount: ₹" + increment);
            System.out.println("Final Salary: ₹" + finalSalary);
        } 
        else {
            System.out.println("No increment");
            System.out.println("Final Salary: ₹" + salary);
        }

     
    }
}