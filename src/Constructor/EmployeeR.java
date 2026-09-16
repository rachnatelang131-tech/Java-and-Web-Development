package Constructor;

public class EmployeeR{

	public EmployeeR(String name, int salary) {
		System.out.println("Employee name: " + name + " Salary: " + salary);
	}
	
	public static void main(String[] args) {
		EmployeeR e = new EmployeeR("Roy", 70000);
	}
}
