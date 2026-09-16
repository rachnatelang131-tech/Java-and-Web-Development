package Return;

public class Address {
	public String display() {
		int house_number = 101;
		String city = "Chennai";
		String state = "Telangana";
		
		String address = (house_number + "," + city + ","  + state);
		return address;
				
	}
	public static void main(String[] args) {
		Address a = new Address();
		System.out.println(a.display());
	}

}
