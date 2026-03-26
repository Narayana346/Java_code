package design_patten.behavioral.visitor;

public class ConcreteElement implements Element{
    int value;
    public ConcreteElement(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
