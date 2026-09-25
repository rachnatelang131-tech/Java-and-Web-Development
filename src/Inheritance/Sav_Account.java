
package Inheritance;

public class Sav_Account extends Account {

    double min_balance;
    double sav_balance;

    public void sav() {

        this.min_balance = 50000;
        this.sav_balance = 35000;

        System.out.println("Minimum balance is " + min_balance);
        System.out.println("Savings balance is " + sav_balance);
    }

    public static void main(String[] args) {

        Sav_Account s = new Sav_Account();
        Account a = new Account();

        s.sav();

        a.display();
        
    }
}
