package design_patten.behavioral.strategy;

public class PaymentContext {
    Payment payment;

    public PaymentContext(){}

    public PaymentContext(Payment payment){
        this.payment = payment;
    }

    public void executePayment(){
        payment.pay();
    }
    public void setPayment(Payment payment){
        this.payment = payment;
    }

    public Payment getPayment(){
        return payment;
    }
}
