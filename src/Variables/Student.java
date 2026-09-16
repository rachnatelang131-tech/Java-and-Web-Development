
package Variables;

public class Student {

	int sid;

	String name;

	String Address;

	public void init(int id, String n, String add) {

		sid = id;

		name = n;

		Address = add;

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