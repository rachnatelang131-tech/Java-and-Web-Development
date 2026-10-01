package Abstraction;

import java.util.Scanner;

class Doctor extends Person {
    String specialization;
    Scanner sc = new Scanner(System.in);

    void readdetails() {
        System.out.println("Enter Doctor specialization:");
        specialization = sc.nextLine();
    }

    void showdetails() {
        System.out.println("Doctor Specialization: " + specialization);
    }
}