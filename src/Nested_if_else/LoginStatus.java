
package Nested_if_else;

import java.util.Scanner;

public class LoginStatus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of login attempts.....");
        int attempts = sc.nextInt();

        System.out.println("Enter account status (active/blocked).....");
        String status = sc.next();

        if (status.equals("active")) {
            if (attempts <= 3) {
                System.out.println("User can login.");
            } else {
                System.out.println("Account should be blocked because login attempts exceeded.");
            }
        } else {
            System.out.println("Account should be blocked.");
        }
    }
}

