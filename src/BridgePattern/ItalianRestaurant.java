package BridgePattern;

public class ItalianRestaurant extends Restaurant{

    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("tomato");
    }

    @Override
    void addTopping() {
        pizza.setTopping("barbecue");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("crispy");
    }
}
