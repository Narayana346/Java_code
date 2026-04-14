package design_patten.behavioral;

import design_patten.behavioral.chain_of_resposibility.HighHandler;
import design_patten.behavioral.chain_of_resposibility.LowHandler;
import design_patten.behavioral.chain_of_resposibility.Handler;
import design_patten.behavioral.command.Command;
import design_patten.behavioral.command.Light;
import design_patten.behavioral.command.LightOperationCommand;
import design_patten.behavioral.command.Operation;
import design_patten.behavioral.interpreter.Expression;
import design_patten.behavioral.interpreter.Number;
import design_patten.behavioral.iterator.Iterator;
import design_patten.behavioral.mediator.Mediator;
import design_patten.behavioral.mediator.Sender;
import design_patten.behavioral.memento.Memento;
import design_patten.behavioral.memento.Originator;
import design_patten.behavioral.observer.Channel;
import design_patten.behavioral.observer.Observable;
import design_patten.behavioral.state.Context;
import design_patten.behavioral.state.OffState;
import design_patten.behavioral.state.OnState;
import design_patten.behavioral.state.State;
import design_patten.behavioral.strategy.CreditCard;
import design_patten.behavioral.strategy.Payment;
import design_patten.behavioral.strategy.PaymentContext;
import design_patten.behavioral.strategy.UPI;
import design_patten.behavioral.tamplate_method.Cricket;
import design_patten.behavioral.tamplate_method.Game;
import design_patten.behavioral.visitor.ConcreateVisitor;
import design_patten.behavioral.visitor.ConcreteElement;
import design_patten.behavioral.visitor.Element;
import design_patten.behavioral.visitor.Visitor;


public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   BEHAVIORAL DESIGN PATTERNS DEMO");
        System.out.println("   Patterns: Observer | Strategy | Command | Chain | Mediator | Memento | State | Template | Iterator | Visitor | Interpreter");
        System.out.println("========================================");
        System.out.println();

        testObserver();
        System.out.println();

        testStrategy();
        System.out.println();

        testCommand();
        System.out.println();

        testChainOfResponsibility();
        System.out.println();

        testMediator();
        System.out.println();

        testMemento();
        System.out.println();

        testState();
        System.out.println();

        testTemplateMethod();
        System.out.println();

        testIterator();
        System.out.println();

        testVisitor();
        System.out.println();

        testInterpreter();
        System.out.println();

        System.out.println("========================================");
        System.out.println("   All 11 Behavioral Patterns complete.");
        System.out.println("========================================");
    }

    private static void testInterpreter() {
        System.out.println("--------- Testing Interpreter Pattern ---------");
        Expression expression = new Number(10);
        System.out.println("Result: " + expression.interpret());

        System.out.println("--------- Testing Interpreter Pattern ---------");
    }

    private static void testVisitor() {
        System.out.println("--------- Testing Visitor Pattern ---------");
        Element element = new ConcreteElement(10);
        Visitor visitor = new ConcreateVisitor();
        element.accept(visitor);
        System.out.println("--------- Testing Visitor Pattern ---------");
    }

    private static void testIterator() {
        System.out.println("--------- Testing Iterator Pattern ---------");
        Iterator.iterate();
        System.out.println("--------- Testing Iterator Pattern ---------");
    }

    private static void testTemplateMethod() {
        System.out.println("--------- Testing Template Method Pattern ---------");
        Game game = new Cricket();
        game.run();
        System.out.println("--------- Testing Template Method Pattern ---------");
    }

    private static void testState() {
        System.out.println("--------- Testing State Pattern ---------");
        Context context = new Context();
        State onState = new OnState();
        State offState = new OffState();

        context.setState(onState);
        context.request();

        context.setState(offState);
        context.request();

        System.out.println("--------- Testing State Pattern ---------");
    }

    private static void testMemento() {
        System.out.println("--------- Testing Memento Pattern ---------");
        Originator originator = new Originator();

        originator.setState("State 1");
        Memento saved = originator.saveStateToMemento();

        originator.setState("State 2");
        originator.restoreStateFromMemento(saved);

        System.out.println("State: " + originator.getState());

        System.out.println("--------- Testing Memento Pattern ---------");
    }

    private static void testMediator() {
        System.out.println("--------- Testing Mediator Pattern ---------");
        Mediator mediator = new Mediator();
        Sender sender1 = new Sender("Sender 1", mediator);
        Sender sender2 = new Sender("Sender 2", mediator);

        sender1.send("Hello");
        sender2.send("Hi");

        System.out.println("--------- Testing Mediator Pattern ---------");
    }

    private static void testChainOfResponsibility() {
        System.out.println("--------- Testing Chain Of Responsibility Pattern ---------");
        Handler lowHandler = new LowHandler();
        Handler highHandler = new HighHandler();
        lowHandler.setNext(highHandler);

        lowHandler.handle(5);
        lowHandler.handle(15);

        System.out.println("--------- Testing Chain Of Responsibility Pattern ---------");
    }

    private static void testCommand() {
        System.out.println("--------- Testing Command Pattern ---------");
        Light light = new Light();
        Command command = new LightOperationCommand(light, Operation.ON);
        command.execute();
        ((LightOperationCommand) command).setOperation(Operation.OFF);
        command.execute();

        System.out.println("--------- Testing Command Pattern ---------");
    }

    private static void testStrategy() {
        System.out.println("--------- Testing Strategy Pattern ---------");
        Payment creditCard = new CreditCard();
        Payment upi = new UPI();
        PaymentContext context = new PaymentContext();
        context.setPayment(creditCard);
        context.executePayment();
        context.setPayment(upi);
        context.executePayment();

        System.out.println("--------- Testing Strategy Pattern ---------");
    }

    private static void testObserver() {
        System.out.println("--------- Testing Observer Pattern ---------");

        Channel channel = new Channel();
        Observable obserable1 = new Observable();
        Observable obserable2 = new Observable();
        Observable obserable3 = new Observable();
        channel.subscribe(obserable1);
        channel.subscribe(obserable2);
        channel.subscribe(obserable3);
        channel.notifyAll("Hello");
        channel.unsubscribe(obserable1);
        channel.unsubscribe(obserable2);
        channel.notifyAll("Hi");

        System.out.println("--------- Testing Observer Pattern ---------");
    }
}
