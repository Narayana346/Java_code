package design_patten.behavioral.command;

public class LightOperationCommand implements Command{

    private Light light;
    private Operation operation;

    public LightOperationCommand(Light light, Operation operation){
        this.light = light;
        this.operation = operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void execute() {
        if(operation == Operation.ON)
            light.on();
        else
            light.off();
    }
}
