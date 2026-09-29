package Encapsulation;

import java.util.Scanner;

public class Mains {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Management m = new Management();

        System.out.println("Enter id..");
        int id = sc.nextInt();

        System.out.println("Enter name..");
        String name = sc.next();

        System.out.println("Enter course..");
        String course = sc.next();

        System.out.println("Enter age..");
        int age = sc.nextInt();

        System.out.println("Enter grade..");
        String grade = sc.next();

        m.setid(id);
        m.setname(name);
        m.setcourse(course);
        m.setage(age);
        m.setgrade(grade);

        System.out.println("Id: " + m.getid());
        System.out.println("Name: " + m.getname());
        System.out.println("Course: " + m.getcourse());
        System.out.println("Age: " + m.getage());
        System.out.println("Grade: " + m.getgrade());
    }
}