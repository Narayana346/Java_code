package design_patten.structural.bridge;

public class Remote {
    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void power(){
        device.turnOn();
    }

    public void powerOff(){
        device.turnOff();
    }


}
