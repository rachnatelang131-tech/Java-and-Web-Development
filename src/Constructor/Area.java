package Constructor;

public class Area {
	
	public void Area(int l, int b) {
		
		int area = l * b;
		System.out.println("Area of rectangle " + area);
	}
	
	public static void main(String[] args) {
		Area obj = new Area();
		obj.Area(5, 6);

}
}