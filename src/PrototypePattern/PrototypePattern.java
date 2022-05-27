package PrototypePattern;

public class PrototypePattern {

    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("blue");
        car.setBrand("reno");
        car.setModel("captive");

        Car clone = car.clone();

        System.out.println(clone.getColor() + " | " + clone.getBrand() + " | " + clone.getModel());
    }
}
