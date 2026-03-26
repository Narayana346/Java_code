package design_patten.behavioral.strategy;

public class UPI implements Payment{
    @Override
    public void pay() {
        System.out.println("Pay via UPI");
    }
}
