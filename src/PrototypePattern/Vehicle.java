package PrototypePattern;

public abstract class Vehicle {

    private String model;
    private String brand;

    protected Vehicle(Vehicle vehicle) {
        this.model = vehicle.model;
        this.brand = vehicle.brand;
    }

    public Vehicle() {
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public abstract Vehicle clone();
}
