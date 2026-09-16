package Parameter;

public class Student_info {

    public void student(String name, int rollno, int m1, int m2) {

        int total = m1 + m2;
        double percentage = total / 2.0;

        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollno);
        System.out.println("Marks 1    : " + m1);
        System.out.println("Marks 2    : " + m2);
        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + percentage + "%");
    }

    public static void main(String[] args) {

        Student_info s = new Student_info();
        s.student("Rachna", 101, 85, 90);

    }
}