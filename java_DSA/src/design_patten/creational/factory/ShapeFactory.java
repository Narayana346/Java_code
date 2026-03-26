package design_patten.creational.factory;

public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if(shapeType.equals(Circle.class.getSimpleName())) return new Circle();
        if(shapeType.equals(Rectangle.class.getSimpleName())) return new Rectangle();

        return null;
    }
}
