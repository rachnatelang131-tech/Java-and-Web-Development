package HW;

public abstract class Payment {
	protected double amount;

    // Constructor
  public void  Payment(double amount) {
        this.amount = amount;
    }

    public abstract void pay();


}
