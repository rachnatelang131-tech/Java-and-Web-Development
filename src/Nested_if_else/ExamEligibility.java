
package Nested_if_else;

import java.util.Scanner;

public class ExamEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your exam marks.....");
        int marks = sc.nextInt();

        System.out.println("Enter your attendance percentage.....");
        float attendance = sc.nextFloat();

        if (attendance >= 75) {
            if (marks >= 40) {
                System.out.println("Student is eligible to appear for the exam.");
            } else {
                System.out.println("Student is not eligible because marks are less than 40.");
            }
        } else {
            System.out.println("Student is not eligible because attendance is less than 75%.");
        }
    }
}

