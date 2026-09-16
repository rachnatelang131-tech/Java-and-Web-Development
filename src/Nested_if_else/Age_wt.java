package Nested_if_else;

public class Age_wt {

    public void check(int age, double wt) {

        if (age > 18) {

            System.out.println("Age eligible");

            if (wt > 50) {
                System.out.println("You can donate blood");
            } 
            else {
                System.out.println("Can't donate blood due to less weight");
            }

        } 
        else {
            System.out.println("You can't donate blood");
        }
    }

    public static void main(String[] args) {

        Age_wt obj = new Age_wt();

        obj.check(20, 55);
    }
}