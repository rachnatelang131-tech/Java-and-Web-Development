package Methods;

public class InchesToMeters {

    public void convert() {
        double inches = 100;
        double meters = inches * 0.0254;

        System.out.println(meters);
    }

    public static void main(String[] args) {
        InchesToMeters obj = new InchesToMeters();
        obj.convert();
    }
}