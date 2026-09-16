package Parameter;

public class GST {

	public void gstDetails(double price, double rate) {
		double gst = (price * rate) / 100;
		System.out.println("Product Price: " + price);
		System.out.println("GST Rate: " + rate + "%");
		System.out.println("GST Amount: " + gst);
		System.out.println();
	}

	public static void main(String[] args) {
		GST g = new GST();

		g.gstDetails(1500, 18);
		g.gstDetails(850, 12);
		g.gstDetails(2500, 28);
	}
}