package entities;

public class paypalService implements OnlinePaymentService {

    @Override
    public double interest(double amount, int months) {
        return amount * 0.01 * months;
    }

    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }
}
