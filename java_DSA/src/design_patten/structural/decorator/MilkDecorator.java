package design_patten.structural.decorator;

public class MilkDecorator implements Coffee{

    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Milk";
    }
}
