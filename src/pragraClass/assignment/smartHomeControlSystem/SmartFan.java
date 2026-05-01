package pragraClass.assignment.smartHomeControlSystem;

public class SmartFan extends SmartDevice implements Switchable{
    public SmartFan(int deviceID) {
        super(deviceID);
    }

    @Override
    void deviceInfo() {
        System.out.println("Device Id: "+ getDeviceID() );
        System.out.println("Power: 700 Watt");
    }

    @Override
    public void turnON() {
        System.out.println("Fan is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned Off");
    }

}
