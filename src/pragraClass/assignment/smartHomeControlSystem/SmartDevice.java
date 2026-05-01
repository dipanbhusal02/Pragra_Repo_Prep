package pragraClass.assignment.smartHomeControlSystem;

public abstract class SmartDevice {
    private int deviceID;

    public SmartDevice(int deviceID) {
        this.deviceID = deviceID;
    }

   abstract void deviceInfo();

    public int getDeviceID() {
        return deviceID;
    }
}
