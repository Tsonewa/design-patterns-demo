package BridgePattern;

public class AmericanRestaurant extends Restaurant{

    public AmericanRestaurant(Pizza pizza) {
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
