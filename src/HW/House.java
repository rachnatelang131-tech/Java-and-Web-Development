package HW;

public class House extends Building{
	String type = "Residential";

    void printType() {
        System.out.println(super.type);
        System.out.println(type);
    }

public static void main(String[] args) {
    House h = new House();
    h.printType();
}
}