package HW;

public class Students {
    static int count = 0;
    int rollNo;

    Students() {
        count++;
        rollNo = count;
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        System.out.println(s1.rollNo);
        System.out.println(s2.rollNo);
        System.out.println(s3.rollNo);
    }
}