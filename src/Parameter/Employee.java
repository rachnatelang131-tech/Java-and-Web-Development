package Parameter;

public class Employee {
	public void employee(int id, String name, double basic_salary) {
		double da = basic_salary*0.10;
		double hra = basic_salary*0.15;
		double gross_salary = basic_salary+da+hra;
		
		System.out.println(id + "," + "name" + "," + basic_salary + "," + gross_salary );
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.employee(101, "rachna", 25000);
		e.employee(102, "radha", 15000);
	} 
	

}
