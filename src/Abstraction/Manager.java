package Abstraction;

public class Manager extends Member {
    String department;

    @Override
   public void readDetails() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter phone number:");
        phone = sc.nextLine();
        System.out.println("Enter address:");
        address = sc.nextLine();
        System.out.println("Enter salary:");
        salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter department:");
        department = sc.nextLine();
    }

    @Override
    public void showDetails() {
        System.out.println("\nManager Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        printSalary();
    }
}
