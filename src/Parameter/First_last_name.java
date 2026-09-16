package Parameter;

public class First_last_name {	
		public void name(String first_name, String last_name) {
			System.out.println("Full Name : " + first_name + " " + last_name);
		}
		
		public static void main(String[] args) {
			First_last_name n = new First_last_name();
			n.name("Rachna", "Telang");
			n.name("Saee", "kale");
			n.name("Ruchika", "Gupta");
			n.name("Aryan", "Sinha");
		}

	}

