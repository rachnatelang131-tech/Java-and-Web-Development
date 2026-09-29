package Encapsulation;

public class Student {

    private int roll, Marks;
    private String name, address, email;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    public int getMarks() {
    	return Marks;
    }
    
    public void setMarks(int Marks) {
    	if (Marks >= 0 && Marks <= 100) {
    		this.Marks = Marks;
    	}
    	else {
    		System.out.println("Enter marks between 0-100");
    	}
    	
    }
    


public static void main(String[] args) {

    Student s = new Student();

    s.setRoll(101);
    s.setName("Rachna");
    s.setAddress("Pune");
    s.setEmail("rachna@gmail.com");
    s.setMarks(85);

    System.out.println(s.getRoll());
    System.out.println(s.getName());
    System.out.println(s.getAddress());
    System.out.println(s.getEmail());
    System.out.println(s.getMarks());
}
}