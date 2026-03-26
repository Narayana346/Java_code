package design_patten.behavioral.mediator;

public class Mediator {
    public void sendMessage(String msg , Sender sender){
        System.out.println(sender.name + " : " + msg);
    }
}
