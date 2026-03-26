package design_patten.behavioral.tamplate_method;

public class Cricket extends Game{
    @Override
    void start() {
        System.out.println("Cricket Game Started");
    }

    @Override
    void play() {
        System.out.println("Cricket Game Played");
    }
}
