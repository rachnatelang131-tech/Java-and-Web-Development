package Abstraction;

public class FreelancerMain {
    public static void main(String[] args) {
        Developer d = new Developer("Rachna", "Website", 500);
        Designer ds = new Designer("Sakshi", "UI Design", 400);

        System.out.println("Developer Name: " + d.name);
        System.out.println("Project: " + d.projectName);
        System.out.println("Weekly Earnings: " +
                d.calculateEarnings(45));

        System.out.println("Designer Name: " + ds.name);
        System.out.println("Project: " + ds.projectName);
        System.out.println("Weekly Earnings: " +
                ds.calculateEarnings(35));
    }
}