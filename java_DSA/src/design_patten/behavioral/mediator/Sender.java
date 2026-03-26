package design_patten.behavioral.mediator;

public class Sender {
    String name;
    Mediator mediator;

    public Sender(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String msg) {
        mediator.sendMessage(msg,this);
    }
}
