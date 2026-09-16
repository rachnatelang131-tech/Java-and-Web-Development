package Parameter;

public class Address {
		public void address(int house_no, String city, String state) {
			System.out.println("Address : House No. " + house_no + "," + city + "," +state);
		}

		public static void main(String[] args) {
			Address a = new Address();

			a.address(101, "Pune", "Maharashtra");
			a.address(202, "Mumbai", "Maharashtra");
			a.address(303, "Nagpur", "Maharashtra");
			a.address(404, "Nashik", "Maharashtra");
		}
	}


