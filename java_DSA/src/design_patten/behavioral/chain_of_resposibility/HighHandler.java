package design_patten.behavioral.chain_of_resposibility;

public class HighHandler extends Handler{
    @Override
    public void handle(int request) {
        if(request > 10)
            System.out.println("HighHandler handled request: " + request);
        else
            next.handle(request);
    }
}
