package Kiosk;

public class Product extends Menu {
    private int price; //가격

    public Product(String name, int price, String description) {
        super(name, description);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
