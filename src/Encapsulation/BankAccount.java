package Encapsulation;

public class BankAccount {

    private int accountnum;
    private double balance;

    public void setaccountnum(int accountnum) {
        this.accountnum = accountnum;
    }

    public int getaccountnum() {
        return accountnum;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public double getbalance() {
        return balance;
    }
}