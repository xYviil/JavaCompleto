package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product2 {

    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufacturateDate) {
        super(name, price);
        this.manufactureDate = manufacturateDate;
    }

    public LocalDate getManufacturateDate() {
        return manufactureDate;
    }

    public void setManufacturateDate(LocalDate manufacturateDate) {
        this.manufactureDate = manufacturateDate;
    }

    @Override
    public String priceTag() {
        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
        }
}
