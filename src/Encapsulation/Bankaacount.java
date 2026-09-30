package Encapsulation;

public class Bankaacount {

    private double balance;

    public void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        Bankaacount b = new Bankaacount();

        b.deposit(10000);
        b.withdraw(3000);

        System.out.println("Balance: " + b.getBalance());
    }
}