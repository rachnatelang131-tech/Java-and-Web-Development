package HW;

public class SchoolExam {
	public static void main(String[] args) {

        Student s1 = new RegularStudent("Riya", 1, 80);
        Student s2 = new ScholarshipStudent("Asha", 2, 90);

        s1.calculateFee();
        s2.calculateFee();

        System.out.println("Marks = " + s1.getMarks());
    }

}
