package HW;

public class Account {
	int accountNumber;
    double balance;

    Account(int a, double b) {
        if (b < 0)
            throw new IllegalArgumentException();

        accountNumber = a;
        balance = b;
    }

    public static void main(String[] args) {
        try {
            Account a = new Account(101, -500);
            System.out.println("Account created");
        }
        catch (Exception e) {
            System.out.println("Negative balance not allowed");
        }
    }
}

