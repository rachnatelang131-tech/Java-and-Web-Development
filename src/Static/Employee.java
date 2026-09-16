package Static;

public class Employee {
	int id;
	double salary;
	String name, address;
	static String companyname = "MIndscripts";
	
	public Employee(int id, double salary, String name, String address) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.address = address;
		
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(address);
		System.out.println(companyname);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(101, 150000, "rachna", "Pune");
		e.display();
	}

}
