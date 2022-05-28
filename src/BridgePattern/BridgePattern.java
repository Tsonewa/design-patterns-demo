package BridgePattern;

public class BridgePattern {

    public static void main(String[] args) {

        AmericanRestaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        ItalianRestaurant italianRestaurant = new ItalianRestaurant(new ChickenPizza());
        italianRestaurant.deliver();
    }
}
