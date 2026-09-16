
package Constructor;

public class PrintNumber {

    // Constructor for int

    public PrintNumber(int num) {

        System.out.println(num);

    }

    // Constructor for double

    public PrintNumber(double num) {

        System.out.println(num);

    }

    // Constructor for float

    public PrintNumber(float num) {

        System.out.println(num);

    }

    // Constructor for long

    public PrintNumber(long num) {

        System.out.println(num);

    }

    public static void main(String[] args) {

        PrintNumber p1 = new PrintNumber(10);

        PrintNumber p2 = new PrintNumber(10.5);

        PrintNumber p3 = new PrintNumber(10.5f);

        PrintNumber p4 = new PrintNumber(100000L);

    }

}

