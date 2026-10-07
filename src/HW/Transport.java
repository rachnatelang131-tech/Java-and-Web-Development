package HW;

public abstract class Transport {
    String name;
    private String num;
    double baseFare;

    Transport(String n, String no, double fare) {
        name = n;
        num = no;
        baseFare = fare;
    }

    public abstract void calculateFair();
}