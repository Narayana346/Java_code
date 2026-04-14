package design_patten.structural;

import design_patten.structural.adpter.Adapter;
import design_patten.structural.adpter.AdvancedPlayer;
import design_patten.structural.bridge.Remote;
import design_patten.structural.bridge.TV;
import design_patten.structural.composite.Developer;
import design_patten.structural.composite.Manger;
import design_patten.structural.decorator.Coffee;
import design_patten.structural.decorator.MilkDecorator;
import design_patten.structural.decorator.SimpleCoffee;
import design_patten.structural.facade.ComputerFacade;
import design_patten.structural.flyweight.Shape;
import design_patten.structural.flyweight.ShapeFactory;
import design_patten.structural.proxy.ProxyInternet;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   STRUCTURAL DESIGN PATTERNS DEMO");
        System.out.println("   Patterns: Adapter | Bridge | Composite | Decorator | Facade | Flyweight | Proxy");
        System.out.println("========================================");
        System.out.println();

        testAdapter();
        System.out.println();

        testBridge();
        System.out.println();

        testComposite();
        System.out.println();

        testDecorator();
        System.out.println();

        testFacade();
        System.out.println();

        testFlyweight();
        System.out.println();

        testProxy();
        System.out.println();

        System.out.println("========================================");
        System.out.println("   All 7 Structural Patterns complete.");
        System.out.println("========================================");
    }

    private static void testProxy() {
        System.out.println("--------- Testing Proxy Pattern ---------");
        ProxyInternet proxyInternet = new ProxyInternet();
        proxyInternet.connectTo("blocked.com");
        proxyInternet.connectTo("google.com");
        System.out.println("--------- Testing Proxy Pattern ---------");
    }

    private static void testFlyweight() {
        System.out.println("--------- Testing Flyweight Pattern ---------");

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("red");
        Shape shape2 = shapeFactory.getShape("blue");
        Shape shape3 = shapeFactory.getShape("black");
        shape1.draw();
        shape2.draw();
        shape3.draw();

        System.out.println("--------- Testing Flyweight Pattern ---------");
    }

    private static void testFacade() {
        System.out.println("--------- Testing Facade Pattern ---------");
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();

        System.out.println("--------- Testing Facade Pattern ---------");
    }

    private static void testDecorator() {
        System.out.println("--------- Testing Decorator Pattern ---------");
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription());

        System.out.println("--------- Testing Decorator Pattern ---------");
    }

    private static void testComposite() {
        System.out.println("--------- Testing Composite Pattern ---------");
        Manger manger = new Manger();
        Developer developer = new Developer();
        manger.addEmployee(developer);
        manger.showDetails();

        System.out.println("--------- Testing Composite Pattern ---------");
    }

    private static void testBridge() {
        System.out.println("--------- Testing Bridge Pattern ---------");
        TV tv = new TV();
        Remote remote = new Remote(tv);
        remote.power();
        remote.powerOff();

        System.out.println("--------- Testing Bridge Pattern ---------");
    }

    private static void testAdapter() {
        System.out.println("--------- Testing Adapter Pattern ---------");
        AdvancedPlayer advancedPlayer = new AdvancedPlayer();
        Adapter adapter = new Adapter(advancedPlayer);
        adapter.play("test.mp4");
        System.out.println("--------- Testing Adapter Pattern ---------");
    }
}
