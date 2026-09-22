package Inheritance;

public class ClientAccount extends FinancialAccount{
	String clientTier ;
	
	public void viewBalance() {
		System.out.println("AccountHolder's balance is " + balance);
		
	}
	
	public void UpdateTier(String newTier) {
		clientTier = newTier;
		 System.out.println("Client Tier is " + clientTier);
	}
	public static void main(String[] args) {
		ClientAccount c = new ClientAccount();
		c.viewBalance();
		c.printholder();
		c.UpdateTier("Gold");
		
	}

}
