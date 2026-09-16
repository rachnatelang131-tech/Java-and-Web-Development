package Parameter;

public class Days_hours_minutes {

    public void convert(int days) {
        int hours = days * 24;
        int minutes = hours * 60;

        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println();
    }

    public static void main(String[] args) {
        Days_hours_minutes d = new Days_hours_minutes();
        d.convert(2);
        d.convert(5);
    }
}
