package Inheritance;

import java.util.Scanner;

public class Student extends Person {

    public void get() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the roll no...");
        int rollno = sc.nextInt();

        System.out.println("Enter the course...");
        String course = sc.next();

        System.out.println("Enter the marks...");
        int marks = sc.nextInt();
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.get();
        s.person();
    }
}