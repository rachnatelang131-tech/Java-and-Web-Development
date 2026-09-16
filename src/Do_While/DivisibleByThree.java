package Do_While;

public class DivisibleByThree {
    public static void main(String[] args) {

        int i = 1;

        do {
            if (i % 3 == 0) {
                System.out.println(i);
            }

            i++;

        } while (i <= 30);
    }
}
