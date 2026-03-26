package design_patten.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
