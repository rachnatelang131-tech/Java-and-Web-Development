package Abstraction;

public class Designer extends Freelancer {
    Designer(String name, String projectName, double ratePerHour) {
        super(name, projectName, ratePerHour);
    }

    @Override
    double calculateEarnings(int hours) {
        double earnings = hours * ratePerHour;

        if (hours > 30) {
            earnings += earnings * 0.10;
        }

        return earnings;
    }
}