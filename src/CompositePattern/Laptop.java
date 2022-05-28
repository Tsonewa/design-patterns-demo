package CompositePattern;

public class Laptop extends Product {

    public Laptop(String title, double price) {
        super(title, price);
    }

    @Override
    public double totalPrice() {
        return getPrice();
    }
}
