package design_patten.behavioral.observer;

public class User implements Observer{
    @Override
    public void update(String msg) {
        System.out.println("Received: "+ msg);
    }
}
