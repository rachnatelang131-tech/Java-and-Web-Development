package Do_While;

public class Sum {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        do {
            sum = sum + i;
            i++;

        } while (i <= 20);

        System.out.println("Sum = " + sum);
    }
}
