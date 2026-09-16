package Array;

public class Numbers {

    public static void main(String[] args) {

        int num[] = {12, 23, 34, 45, 56, 67};

        int lowest = num[0];
        int highest = num[0];

        for(int i = 0; i < num.length; i++) {

            if(num[i] < lowest) {
                lowest = num[i];
            }

            if(num[i] > highest) {
                highest = num[i];
            }
        }

        System.out.println("Lowest number is " + lowest);
        System.out.println("Highest number is " + highest);

    }

}
