package entities;

public class UsaInterestServices implements InterestService{

    private double interestRate;

    public UsaInterestServices(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
