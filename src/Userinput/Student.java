package Userinput;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of student.: ");
        String name = sc.next();

        System.out.println("Enter the rollno of student.: ");
        int rollno = sc.nextInt();

        System.out.println("Enter the marks of student for four sub.: ");

        int math = sc.nextInt();
        int sci = sc.nextInt();
        int geo = sc.nextInt();
        int eng = sc.nextInt();

        int total = math + sci + geo + eng;

        double percentage = (total / 400.0) * 100;

        System.out.println("Student name: " + name);
        System.out.println("Roll no: " + rollno);
        System.out.println("Total marks are.: " + total);
        System.out.println("Percentage is.: " + percentage);
    }
}