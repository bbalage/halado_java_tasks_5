package hu.meiit.haladojava;

public class Product {
    private String name;
    private int price;
    private String currency = "Ft";
    public Product(String name, int price, int taxPercent) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    /*If we really want this code to be better then we should use enums or go as far as a
    * a database containing the changing rules between currencies. In that case, a separate
    * class could be created for applying the changing rules. A class like CurrencyConverter.*/
    public void setCurrency(String currency) {
        if (currency.equalsIgnoreCase("Euro")) {
            changeToEuro();
        }
        if (currency.equalsIgnoreCase("Ft")) {
            changeToForint();
        }
    }

    public int comparePrice(Product p) {
        if (this.price > p.price)
            return 1;
        else if (this.price < p.price)
            return 2;
        else
            return 0;
    }

    private void changeToEuro() {
        if (this.currency.equalsIgnoreCase("Ft")) {
            this.currency = "Euro";
            this.price = price / 300;
        }
    }

    private void changeToForint() {
        if (this.currency.equalsIgnoreCase("Euro")) {
            this.currency = "Forint";
            this.price = price * 300;
        }
    }
}
