package Inheritance;
class Cars extends Vehicle {
    int numberOfDoors;

    Cars(String brand, String model, int speed, int numberOfDoors) {
        super(brand, model, speed);
        this.numberOfDoors = numberOfDoors;
    }

    void displayCar() {
        displayVehicle();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
	
	
	


