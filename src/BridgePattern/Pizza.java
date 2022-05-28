package BridgePattern;

public abstract class Pizza {

    protected String sauce;
    protected String topping;
    protected String crust;

    public abstract void assemble();
    public abstract void qualityCheck();

    public String getSauce() {
        return sauce;
    }

    public Pizza setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public String getTopping() {
        return topping;
    }

    public Pizza setTopping(String topping) {
        this.topping = topping;
        return this;
    }

    public String getCrust() {
        return crust;
    }

    public Pizza setCrust(String crust) {
        this.crust = crust;
        return this;
    }
}
