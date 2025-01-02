package entities;

import java.time.Duration;

public class RentalService {

    private final Double pricePerHour;
    private final Double getPricePerDay;

    private final TaxService taxService;

    public RentalService(Double pricePerHour, Double getPricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.getPricePerDay = getPricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment ;
        if (hours <= 12) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = getPricePerDay * Math.ceil(hours/24);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
