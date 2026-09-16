package Parameter;

public class Celsius {

	public void convert(double fahrenheit) {

		double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);

		System.out.println("Temperature in Celsius = " + celsius);
	}

	public static void main(String[] args) {

		Celsius c = new Celsius();

		c.convert(98.6);

	}
}
