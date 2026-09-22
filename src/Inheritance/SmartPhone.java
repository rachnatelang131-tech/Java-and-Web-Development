package Inheritance;

public class SmartPhone extends Product {

    String operatingSystem = "Android";
    Double screenSize = 6.5;

    public void runApp() {
        System.out.println(productName + " is running an app on its "
                + operatingSystem + " OS.");
    }

    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();

        s.productName = "iPhone";
        s.price = 125.0;
        s.warrantyMonths = 24;

        s.displayPrice();
        System.out.println(s.checkWarranty());
        s.runApp();
    }
}
