package HW;

public class Train extends Transport {
    double distance = 200;
    String grade = "A";

    Train(String n, String no, double fare) {
        super(n, no, fare);
    }

    @Override
    public void calculateFair() {
        double fare = distance * 25;
        System.out.println("Fare for train is " + fare);
    }
}