package design_patten.behavioral.state;

public class OnState implements State{
    @Override
    public void handle() {
        System.out.println("ON State");
    }
}
