package Conditional_statement;

import java.util.Scanner;

public class Overtime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total working hours:");
        int hours = sc.nextInt();

        if (hours > 8) {
            int overtimeHours = hours - 8;
            int overtimeAmount = overtimeHours * 200;

            System.out.println("Overtime Hours: " + overtimeHours);
            System.out.println("Overtime Amount: rs" + overtimeAmount);
        } 
        else {
            System.out.println("No Overtime");
        }

      
    }
}