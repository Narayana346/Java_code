package design_patten.behavioral.visitor;

public class ConcreateVisitor implements Visitor{
    @Override
    public void visit(Element element) {
        System.out.println("Visiting element: " + ((ConcreteElement)element).getValue());
    }
}
