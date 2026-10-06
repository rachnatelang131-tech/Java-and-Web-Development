package Interface;

public class Tester implements Bonus{

	@Override
	public void calculateBonus(double salary) {
		// TODO Auto-generated method stub
	    double s = salary * 0.10;
	    System.out.println(s);
	}
	public static void main(String[] args) {
		Manager m = new Manager();
	    Developer d = new Developer();
	    Tester t = new Tester();

	    m.calculateBonus(50000);
	    d.calculateBonus(50000);
	    t.calculateBonus(50000);
	}

	
	

}
