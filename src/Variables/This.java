
package Variables;

public class This {

	int sid;
	String name;
	String Address;

	public void init(int id, String name, String Address) {

		this.sid = id;
		this.name = name;
		this.Address = Address;

	}

	public void display() {
		System.out.println(sid + " " + name + " " + Address);

	}

	public static void main(String[] args) {
		
		Student s = new Student();
		s.init(56, "rachna", "latur");
		s.display();

	}

}

