package Parameter;

public class Inches_to_meter {

    public void convert(double inches) {

        double meters = inches * 0.0254;

        System.out.println("Inches : " + inches);
        System.out.println("Meters : " + meters);
    }

    public static void main(String[] args) {

        Inches_to_meter i = new Inches_to_meter();
        i.convert(100);
        i.convert(50);

    }
}
