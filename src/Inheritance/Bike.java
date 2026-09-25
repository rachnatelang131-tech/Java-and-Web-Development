package Inheritance;

class Bike extends Vehicle {
    int engineCC;

    Bike(String brand, String model, int speed, int engineCC) {
        super(brand, model, speed);
        this.engineCC = engineCC;
    }

    void displayBike() {
        displayVehicle();
        System.out.println("Engine: " + engineCC + " CC");
    }
}

