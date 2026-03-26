package design_patten.behavioral.chain_of_resposibility;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next){
        this.next = next;
    }

    abstract public void handle(int request);
}
