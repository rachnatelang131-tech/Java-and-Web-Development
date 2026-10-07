package HW;

public class ScholarshipStudent extends Student {
    ScholarshipStudent(String n, int r, int m) {
        super(n, r, m);
    }

    @Override
    void calculateFee() {
        System.out.println(name + " Fee = 2500");
    }
}


