package Constructor;

public class Employee {

    public Employee() {

        int basicSalary = 25000;
        int bonus = 5000;

        int totalSalary = basicSalary + bonus;

        System.out.println("Basic Salary = " + basicSalary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total Salary = " + totalSalary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
    }
}