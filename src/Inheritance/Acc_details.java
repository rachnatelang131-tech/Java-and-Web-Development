
package Inheritance;

public class Acc_details extends Account {

    double deposit;
    double withdrawls;

    public void details() {

        this.deposit = 1000000;
        this.withdrawls = 45000;

        System.out.println("Deposit is " + deposit);
        System.out.println("Withdrawls is " + withdrawls);
    }

    public static void main(String[] args) {

        Sav_Account s = new Sav_Account();
        Account a = new Account();
        Acc_details c = new Acc_details();

        c.details();

        a.display();
        
    }
}