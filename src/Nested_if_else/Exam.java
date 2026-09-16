package Nested_if_else;

import java.util.Scanner;

public class Exam {

    public void check(double attendance, int marks) {

        if (attendance >= 75) {

            System.out.println("Attendance criteria satisfied.");

            if (marks >= 40) {
                System.out.println("You are eligible for the exam.");
            } 
            else {
                System.out.println("You are not eligible due to low internal marks.");
            }

        } 
        else {
            System.out.println("You are not eligible due to low attendance.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter internal marks: ");
        int marks = sc.nextInt();

        Exam obj = new Exam();

        obj.check(attendance, marks);

        sc.close();
    }
}