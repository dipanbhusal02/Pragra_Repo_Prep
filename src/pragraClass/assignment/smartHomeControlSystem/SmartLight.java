package pragraClass.assignment.smartHomeControlSystem;

public class SmartLight extends SmartDevice implements Switchable{
    public SmartLight(int deviceID) {
        super(deviceID);
    }

    @Override
    void deviceInfo() {
        System.out.println("Device Id "+ getDeviceID());
        System.out.println("500 Watt");
    }

    @Override
    public void turnON() {
        System.out.println("Smart light turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Light turned Off");
    }
}
