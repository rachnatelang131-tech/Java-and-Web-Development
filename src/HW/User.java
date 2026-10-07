package HW;

public class User {
	String name;
	private Long phoneNo;
	private String Email;
	
	public User(String name, Long phoneNo, String Email ) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.Email = Email;
	}
	public void display() {
		System.out.println(name + " " + phoneNo + " " + Email );
	}
}