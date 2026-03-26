package design_patten.behavioral.state;

public class OffState implements State{
    @Override
    public void handle() {
        System.out.println("OFF State");
    }
}
