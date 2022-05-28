package CompositePattern;

public class Book extends Product{

    public Book(String title, double price) {
        super(title, price);
    }

    @Override
    public double totalPrice() {
        return getPrice();
    }
}
