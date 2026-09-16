package Nested_if_else;

import java.util.Scanner;

public class Even {

    public void checkNumber(int num) {

        if (num > 0) {

            if (num % 2 == 0) {
                System.out.println("Positive Even number");
            }
            else {
                System.out.println("Positive Odd number");
            }

        }
        else if (num < 0) {
            System.out.println("Negative number");
        }
        else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        Even obj = new Even();
        obj.checkNumber(num);

        sc.close();
    }
}
