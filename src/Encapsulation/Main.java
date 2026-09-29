package Encapsulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.println("Enter id..");
        int id = sc.nextInt();

        System.out.println("Enter name..");
        String name = sc.next();

        System.out.println("Enter department..");
        String dept = sc.next();

        System.out.println("Enter salary..");
        double salary = sc.nextDouble();

        System.out.println("Enter bonus..");
        double bonus = sc.nextDouble();

        e.setid(id);
        e.setname(name);
        e.setdept(dept);
        e.setsalary(salary);
        e.setbonus(bonus);

        System.out.println("Id: " + e.getid());
        System.out.println("Name: " + e.getname());
        System.out.println("Department: " + e.getdept());
        System.out.println("Salary: " + e.getsalary());
        System.out.println("Bonus: " + e.getbonus());
    }
}