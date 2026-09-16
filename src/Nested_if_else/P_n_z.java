package Nested_if_else;

public class P_n_z {

    public void P_n_Z(int num) {

        if (num > 0) {
            System.out.println("Positive number");
        }
        else if (num < 0) {
            System.out.println("Negative number");
        }
        else {
            System.out.println("The number is zero");
        }

    } // Method closed here

    public static void main(String[] args) {

        P_n_z obj = new P_n_z();
        obj.P_n_Z(5);

    }

}