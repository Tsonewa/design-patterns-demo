package PrototypePattern;

public class Car extends Vehicle {

    private String color;

    public Car() { }

    public Car(Car car) {
        super(car);
        this.color = car.color;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
