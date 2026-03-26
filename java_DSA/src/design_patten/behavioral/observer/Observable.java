package design_patten.behavioral.observer;

public class Observable implements Observer{
    @Override
    public void update(String msg) {
        System.out.println("Received: "+ msg);
    }
}
