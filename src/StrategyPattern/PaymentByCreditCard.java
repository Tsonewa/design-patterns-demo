package StrategyPattern;

public class PaymentByCreditCard implements Payment{

    private CreditCard creditCard;

    public PaymentByCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void pay(double amount) {
        this.creditCard.setBalance(this.creditCard.getBalance() - amount);
        System.out.println("Pay " + amount + " via creditCard");
    }
}
