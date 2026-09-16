package firstprogram;

public class Employee_salary {
	public static void main(String[] args) {
		int emp_id=101;
		String emp_name="Rachna";
		double basic_salary=50000;
		
		double da=basic_salary*0.10;
		double hra=basic_salary*0.15;
		
		
		double gross_salary=basic_salary*da*hra;
		
		System.out.println(emp_id);
		System.out.println(emp_name);
		System.out.println(basic_salary);
		System.out.println(da);
		System.out.println(hra);
		System.out.println(gross_salary);
	}

}
