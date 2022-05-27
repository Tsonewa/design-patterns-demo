package StrategyPattern;

public class StrategyPattern {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("mastercard", "12548569858455", 100.00);

      PaymentService payment = new PaymentService(10.00, new PaymentByCreditCard(creditCard));
      payment.processOrder();

        System.out.println(creditCard.getBalance());

        PaymentService paypalPayment = new PaymentService(10.00, new PaymentByPayPal("username", "password"));
        paypalPayment.processOrder();

    }
}
