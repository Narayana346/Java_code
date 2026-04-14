package design_patten.creational;

import design_patten.creational.abstract_factory.Button;
import design_patten.creational.abstract_factory.GUIFactory;
import design_patten.creational.abstract_factory.MacFactory;
import design_patten.creational.abstract_factory.WindowsFactory;
import design_patten.creational.builder.User;
import design_patten.creational.factory.Circle;
import design_patten.creational.factory.Rectangle;
import design_patten.creational.factory.Shape;
import design_patten.creational.factory.ShapeFactory;
import design_patten.creational.prototype.Prototype;
import design_patten.creational.singleton.BasicSingleton;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("========================================");
        System.out.println("   CREATIONAL DESIGN PATTERNS DEMO");
        System.out.println("   Patterns: Singleton | Factory | Builder | Prototype | Abstract Factory");
        System.out.println("========================================");
        System.out.println();

        testSingleton();
        System.out.println();

        testFactory();
        System.out.println();

        testBuilder();
        System.out.println();

        testPrototype();
        System.out.println();

        testAbstractFactory();
        System.out.println();

        System.out.println("========================================");
        System.out.println("   All 5 Creational Patterns complete.");
        System.out.println("========================================");
    }

    private static void testSingleton(){
        System.out.println("--------- Testing Singleton Pattern ---------");
        BasicSingleton obj1 = BasicSingleton.getInstance();
        BasicSingleton obj2 = BasicSingleton.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1 == obj2); // true ( same instance)
        System.out.println("--------- Testing Singleton Pattern ---------");
    }

    private static void testFactory(){
        System.out.println("--------- Testing Factory Pattern ---------");
//        System.out.println(Circle.class.getSimpleName());
        Shape circle = ShapeFactory.getShape(Circle.class.getSimpleName());
        circle.draw();
//        System.out.println(Rectangle.class.getSimpleName());
        Shape rectangle = ShapeFactory.getShape(Rectangle.class.getSimpleName());
        rectangle.draw();

        System.out.println("--------- Testing Factory Pattern ---------");

    }
    private static void testBuilder(){
        System.out.println("--------- Testing Builder Pattern ---------");

        User user = User.Builder()
                .setName("Narayanamaharana")
                .setEmail("narayanamaharana@gmail.com")
                .setAddress("123 Main St, Anytown, USA")
                .setAge(30)
                .build();
        System.out.println(user);

        System.out.println("--------- Testing Builder Pattern ---------");

    }
    private static void testPrototype() throws CloneNotSupportedException {
        System.out.println("--------- Testing Prototype Pattern ---------");
        Prototype p1 = new Prototype("Original");
        Prototype p2 = (Prototype) p1.clone();
        System.out.println(p1.getName());
        System.out.println(p1.hashCode());
        System.out.println(p2.getName());
        System.out.println(p2.hashCode());
        System.out.println(p1 == p2); // false ( different objects)
        System.out.println(p1.equals(p2)); // true ( same content)
        System.out.println("--------- Testing Prototype Pattern ---------");

    }
    private static void testAbstractFactory(){
        System.out.println("--------- Testing Abstract Factory Pattern ---------");

        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        button.paint();

        factory = new MacFactory();
        button = factory.createButton();
        button.paint();

        System.out.println("--------- Testing Abstract Factory Pattern ---------");

    }
}
