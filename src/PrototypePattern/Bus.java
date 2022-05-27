package PrototypePattern;

public class Bus extends Vehicle{

    private int doors;

    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

        public Bus() {};
    public int getDoors() {
        return doors;
    }

    public Bus setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}
