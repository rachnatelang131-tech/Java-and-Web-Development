package Return;

public class GST {

    public void display(double price, double rate) {
        double gst = (price * rate) / 100;
        System.out.println("GST Amount: " + gst);
    }

    public static void main(String[] args) {
        GST g = new GST();
        g.display(1000, 18);
    }
}
