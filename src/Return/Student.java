package Return;

public class Student {

    public double display() {
        int math = 75;
        int sci = 85;
        int eng = 75;
        int geo = 95;

        double percentage = (math + sci + eng + geo) * 100.0 / 400;

        return percentage;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.display());
    }
}
