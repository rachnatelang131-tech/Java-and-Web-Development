package Constructor;

public class Numbercheck {

    public Numbercheck() {

        int num = 10;

        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } 
        else {
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args) {
        Numbercheck n = new Numbercheck();
    }
}