package design_patten.structural.facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
    }

    public void start(){
        cpu.start();
        memory.load();
    }
}
