package StrategyPattern;

public class PaymentByPayPal implements Payment{

    private String username;
    private String password;

    public PaymentByPayPal(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public PaymentByPayPal setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public PaymentByPayPal setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " vie PayPal");
    }
}
