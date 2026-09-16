
package Constructor;

public class Simple_interest {

    public Simple_interest(int principal, int rate, int time) {

        System.out.println("Principal is " + principal);
        System.out.println("Rate is " + rate);
        System.out.println("Time is " + time);

        int si = principal * rate * time / 100;

        System.out.println("Simple interest is " + si);
    }

    public static void main(String[] args) {

        Simple_interest obj = new Simple_interest(10000, 2, 10);

    }
}

