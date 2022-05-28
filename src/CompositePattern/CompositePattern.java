package CompositePattern;

public class CompositePattern {
    public static void main(String[] args) {

        CompositeBox compositeBox = new CompositeBox(new Laptop("Laptop",1000.00), new Book("Book", 10.20));
        System.out.println(compositeBox.totalPrice());
    }
}
