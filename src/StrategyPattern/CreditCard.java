package StrategyPattern;

public class CreditCard {

    private String name;
    private String number;
    private Double balance;

    public CreditCard(String name, String number, Double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public CreditCard setName(String name) {
        this.name = name;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public CreditCard setNumber(String number) {
        this.number = number;
        return this;
    }

    public Double getBalance() {
        return balance;
    }

    public CreditCard setBalance(Double balance) {
        this.balance = balance;
        return this;
    }
}
