package Interface;

public class Developer implements Bonus{

	@Override
	public void calculateBonus(double salary) {
		// TODO Auto-generated method stub
		double s = salary * 0.15;
		System.out.println(s);
	}
	

}
