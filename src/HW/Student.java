package HW;

public class Student {
	    String name;
	    int roll;
	    private int marks;

	    Student(String name, int roll, int marks) {
	        this.name = name;
	        this.roll = roll;
	        this.marks = marks;
	    }

	    void setMarks(int marks) {
	        this.marks = marks;
	    }

	    int getMarks() {
	        return marks;
	    }

	    void calculateFee() {
	        System.out.println("Normal Fee = 5000");
	    }
	}



