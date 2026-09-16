package Return;

public class Welcome {      // non parameterized method
	
	public String display() {
		
		return "Welcome";
	}
	public static void main(String[] args) {
		
		Welcome w = new Welcome();
		System.out.println(w.display());
	}	
	}


