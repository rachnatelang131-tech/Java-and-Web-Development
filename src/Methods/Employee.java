package Methods;

public class Employee {
	public void employee() {
		int id = 131;    // employee id
		String name = "Rachna"; // employee name
		double basic_salary = 25000.0;
		double da = 0.10*basic_salary;
		double hra = 0.15*basic_salary;
		
		double gross_salary = basic_salary + da + hra;
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(basic_salary);
		System.out.println(gross_salary);
		
	}
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.employee();
	
	}

}
