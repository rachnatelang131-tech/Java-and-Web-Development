package HW;

public class RegularStudent extends Student {
	    RegularStudent(String n, int r, int m) {
	        super(n, r, m);
	    }

	    @Override
	    void calculateFee() {
	        System.out.println(name + " Fee = 5000");
	    }
	}



