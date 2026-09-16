package Methods;

public class Student {

    public void totalMarks() {
        String name = "Rachna";
        int rollNo = 25;
        int sub1 = 85;
        int sub2 = 90;

        int total = sub1 + sub2;

        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(total);
    }

    public void percentage() {
        int sub1 = 85;
        int sub2 = 90;

        int total = sub1 + sub2;
        double percentage = total / 2.0;

        System.out.println(percentage);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.totalMarks();
        obj.percentage();
    }
}