package Abstraction;

import java.util.Scanner;  

	class Engineer extends Person {
	    String specialization;
	    Scanner sc = new Scanner(System.in);

	    void readdetails() {
	        System.out.println("Enter Engineer specialization:");
	        specialization = sc.nextLine();
	    }

	    void showdetails() {
	        System.out.println("Engineer Specialization: " + specialization);
	    }
	
	 public static void main(String[] args) {
	        Engineer e = new Engineer();
	        Doctor d = new Doctor();

	        e.readdetails();
	        d.readdetails();

	        e.showdetails();
	        d.showdetails();
	    }
	 }
	 
