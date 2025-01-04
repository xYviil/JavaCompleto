package entities;


public class BrazilInterestServices implements InterestService{

    private double interestRate;

    public BrazilInterestServices(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
