package HW;

public class Bike extends Vehicle{

	@Override
	void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("bike is running");
	}

	public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}
