package Constructor;


public class Check_num {
	public Check_num() {
		
		int a = 13;
		
		if(a > 0) {
			System.out.println("Positive");
		}
		else if (a < 0 ) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Invalid");
		}
	}
	public static void main(String[] args) {
		Check_num obj = new Check_num();
		
	}
	}


