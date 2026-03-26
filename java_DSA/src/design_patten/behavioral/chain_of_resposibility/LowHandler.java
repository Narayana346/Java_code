package design_patten.behavioral.chain_of_resposibility;

public class LowHandler extends Handler{
    @Override
    public void handle(int request) {
        if(request < 10)
            System.out.println("LowHandler handled request: " + request);
        else
            next.handle(request);
    }
}
