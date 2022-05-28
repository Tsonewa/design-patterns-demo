package BridgePattern;

public abstract class Restaurant {

    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();
    abstract void addTopping();
    abstract void makeCrust();

 public void deliver(){
     makeCrust();
     addSauce();
     addTopping();
     pizza.assemble();
     pizza.qualityCheck();
     System.out.println("Order is proceeding...");

 }
}
