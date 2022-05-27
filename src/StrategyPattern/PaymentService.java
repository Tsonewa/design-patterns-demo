package StrategyPattern;

public class PaymentService {

    private Double cost;

    private Payment paymentStrategy;

    public PaymentService(Double cost, Payment paymentStrategy) {
        this.cost = cost;
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(){
        paymentStrategy.pay(this.getTotal());
    }

    private double getTotal(){
        return this.cost + 5.99;
    }
}
