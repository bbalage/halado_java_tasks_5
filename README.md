This repository contains one of the tasks for the university course Advanced Java. The original description of the task is copied to the README and can be viewed below.

## 5 Statikus fv eliminálás
Adott a következő kód:
```public class Product {
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
    public void setCurrency(String currency) {
        if (currency.equalsIgnoreCase("Euro")) {
            if (this.currency.equalsIgnoreCase("Ft")) {
                this.currency = currency;
                this.price = price / 300;
            }
        }
        if (currency.equalsIgnoreCase("Ft")) {
            if (this.currency.equalsIgnoreCase("Euro")) {
                this.currency = currency;
                this.price = price * 300;
            }
        }
    }
    public static void changeCurrency(Product[] array) {
        for(Product item: array) {
            if (item.getCurrency().equalsIgnoreCase("Euro"))
                item.setCurrency("Ft");
            else if (item.getCurrency().equalsIgnoreCase("Ft"))
                item.setCurrency("Euro");
        }
    }
    public static int comparePrice(Product p1, Product p2) {
        if (p1.price > p2.price)
            return 1;
        else if (p1.price < p2.price)
            return 2;
        else
            return 0;
    }
}
```
Ebben a kódban egyrészt statikus metódusok találhatók (és mi nem szeretjük azokat), és sérti Single responsibility elvet.
1. vezessünk be egy ProductManager osztályt, amibe át tudjuk helyezni a changeCurrency metódust. NE LEGYEN STATIKUS.
2. A comparePrice metódust implementáljuk a szokásos metodikával, hogy tudjuk 
3. Ha tudsz javíts a kód olvashatóságán. A két egymásba ágyazott elágazás nehezen értelmezhető.