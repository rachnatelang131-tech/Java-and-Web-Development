
package Constructor;

public class AddAmount {

    int amount = 50;

    // Constructor with no parameter
    public AddAmount() {
    }

    // Constructor with parameter
    public AddAmount(int add) {
        amount = amount + add;
    }

    public static void main(String[] args) {

        AddAmount a = new AddAmount(10);

        System.out.println("Final amount = $" + a.amount);
    }
}
