package Constructor;

public class Temprature {

    public Temprature() {

        double celsius = 25;

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Celsius = " + celsius);
        System.out.println("Fahrenheit = " + fahrenheit);
    }

    public static void main(String[] args) {
        Temprature t = new Temprature();
    }
}