package Methods;

public class Volume {
		public void volume() {
			int l = 12;
			int b = 13;
			int h = 14;
			
		    int Volume = l*b*h; 
			System.out.println(Volume);
		}
		
		
		public static void main(String[] args) {
			Volume obj = new Volume();
			obj.volume(); 
			
		}


}
