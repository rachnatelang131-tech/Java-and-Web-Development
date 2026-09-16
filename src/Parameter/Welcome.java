package Parameter;

public class Welcome {

	public void msg(String name, String city) {
		System.out.println("Welcome " + name + " from " + city);
	}

	public static void main(String[] args) {
		Welcome a = new Welcome();

		a.msg("Riya", "Mumbai");
		a.msg("Arjun", "Bengaluru");
		a.msg("Sneha", "Hyderabad");
	}
}
