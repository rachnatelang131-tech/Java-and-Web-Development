
package Constructor;

public class Marks {

    public Marks(int m1, int m2, int m3) {

        int total = m1 + m2 + m3;

        System.out.println("Total marks are..... " + total);
    }

    public static void main(String[] args) {

        Marks obj = new Marks(50, 60, 70);
    }
}
