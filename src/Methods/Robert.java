package Methods;

public class Robert {

    public void marks() {

        int sub1 = 78;
        int sub2 = 45;
        int sub3 = 62;

        int total = sub1 + sub2 + sub3;
        double percentage = total / 3.0;

        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(sub3);
        System.out.println(total);
        System.out.println(percentage);
    }

    public static void main(String[] args) {

        Robert obj = new Robert();
        obj.marks();

    }

}
