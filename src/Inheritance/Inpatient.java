package Inheritance;

public class Inpatient extends Patient {
	int roomNumber = 104;
	int days = 1;
	double charges = 10000;
	
	public void gett() {
		System.out.println("Patient room Number is " + roomNumber);
		System.out.println("Patient addmitted days are " + days);
		System.out.println("Patient Charges are " + charges);
	}
	public static void main(String[] args) {
		Inpatient i = new Inpatient();
		i.display();
		i.gett();
		
	}

}
