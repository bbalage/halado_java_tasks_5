package hu.meiit.haladojava;

public class ProductManager {

    public void changeCurrency(Product[] array) {
        for(Product item: array) {
            if (item.getCurrency().equalsIgnoreCase("Euro"))
                item.setCurrency("Ft");
            else if (item.getCurrency().equalsIgnoreCase("Ft"))
                item.setCurrency("Euro");
        }
    }
}
