package Interface;

public class Manager implements Bonus{

	@Override
	public void calculateBonus(double salary) {
		// TODO Auto-generated method stub
		double  s = salary * 0.20;
		System.out.println(s);
	}
	

}
