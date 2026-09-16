
package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Palindrome p = new Palindrome();
        p.check();
    }

    public void check() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string.....");
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        if (str.equals(sb.toString())) {
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }
    }
}
