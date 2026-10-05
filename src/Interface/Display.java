
package Interface;

public class Display extends Student implements Exam {

    double percent;

    @Override
    public void Parent_call() {
        percent = (m1 + m2) / 2.0;
        System.out.println("Percentage = " + percent);
    }

    public static void main(String[] args) {
        Display d = new Display();
        d.Parent_call();
        d.display();
    }
}
