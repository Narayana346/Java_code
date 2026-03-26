package design_patten.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer){
        observers.add(observer);
    }
    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }
    public void notifyAll(String msg){
        for(Observer observer : observers){
            observer.update(msg);
        }
    }
}
