package HW;

public class Car extends Transport {
    double distance = 75;

   public Car(String n, String no, double fare) {
        super(n, no, fare);
    }

    @Override
    public void calculateFair() {
        double fare = distance * 25;
        System.out.println("Fare for car is " + fare);
    }
}