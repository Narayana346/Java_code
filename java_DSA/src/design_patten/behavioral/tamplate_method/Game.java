package design_patten.behavioral.tamplate_method;

public abstract class Game {
    abstract void start();

    abstract void play();

    public void run(){
        start();
        play();
    }

}
