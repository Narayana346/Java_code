package design_patten.behavioral.strategy;

public class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Pay via CreditCard");
    }
}
