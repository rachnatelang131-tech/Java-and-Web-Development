package ExceptionHandelling;

class InsufficientFundsException extends Exception {}

public class Bank {
    public static void main(String[] args) {
        double balance = 1000;
        double withdrawal = 1500;

        try {
            if (balance < withdrawal)
                throw new InsufficientFundsException();

            System.out.println("Withdrawal successful");
        }
        catch (InsufficientFundsException e) {
            System.out.println("Insufficient balance!");
        }
    }
}
