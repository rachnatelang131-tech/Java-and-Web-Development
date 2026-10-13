package ExceptionHandelling;

import java.util.Scanner;

public class AverageSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of employees: ");
            int n = sc.nextInt();

            if (n <= 0)
                throw new Exception("Invalid number!");

            double total = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter salary: ");
                total += sc.nextDouble();
            }

            System.out.println("Average Salary = " + total / n);
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
