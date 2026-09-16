package Methods;

public class Expression {

    public void calculate() {

        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

        System.out.println(result);
    }

    public static void main(String[] args) {
        Expression obj = new Expression();
        obj.calculate();
    }
}