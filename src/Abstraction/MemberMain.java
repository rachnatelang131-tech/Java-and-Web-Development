package Abstraction;

public class MemberMain {
    public static void main(String[] args) {
        Employe e = new Employe();
        Manager m = new Manager();

        System.out.println("Enter Employee Details");
        e.readDetails();
        e.showDetails();

        System.out.println("\nEnter Manager Details");
        m.readDetails();
        m.showDetails();
    }
}