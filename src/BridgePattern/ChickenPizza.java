package BridgePattern;

public class ChickenPizza extends Pizza{

    @Override
    public void assemble() {
        System.out.println("Crust " + super.crust);
        System.out.println("Topping " + super.topping);
        System.out.println("Sauce " + super.sauce);
    }

    @Override
    public void qualityCheck() {
        System.out.println("Check pepperoni pizza quality");
    }
}
