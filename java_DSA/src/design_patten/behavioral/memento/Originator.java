package design_patten.behavioral.memento;

public class Originator {
    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }
    public void restoreStateFromMemento(Memento memento) {
        state = memento.getState();
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
