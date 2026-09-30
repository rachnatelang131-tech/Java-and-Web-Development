package Encapsulation;

public class BankAccount {

    private int accountNumber;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setAccountNumber(12345);
        b.setBalance(25000);

        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());
    }
}