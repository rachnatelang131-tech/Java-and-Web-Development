package Do_While;

import java.util.Scanner;

public class Interest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char choice;

        do {

            System.out.println("Enter the principal amount.....");
            int principal = sc.nextInt();

            System.out.println("Enter the rate...");
            int rate = sc.nextInt();

            System.out.println("Enter the time...");
            int time = sc.nextInt();

            // Simple Interest Formula
            int si = (principal * rate * time) / 100;

            System.out.println("Simple interest is..." + si);

            if (si < 1000) {

                System.out.println("Interest is Low");

            } else if (si >= 1000 && si < 5000) {

                System.out.println("Interest is Moderate");

            } else {

                System.out.println("Interest is High");
            }

            System.out.print("Do you want to calculate again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');
    }
}