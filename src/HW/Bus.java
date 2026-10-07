package HW;

public class Bus extends Transport {
    int noOfPassengers = 40;

   public Bus(String n, String no, double fare) {
        super(n, no, fare);
    }

    @Override
    public void calculateFair() {
        double fare = noOfPassengers * 25;
        System.out.println("Fare for bus is " + fare);
    }
}