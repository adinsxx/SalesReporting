package edu.wctc.salesreporting;

public class Sale {
    String customers;
    String country;
    double amount;
    double tax;
    double shipping;

    public Sale(String customers, String country, double amount, double tax) {
        this.customers = customers;
        this.country = country;
        this.amount = amount;
        this.tax = tax;

    }

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }
}
