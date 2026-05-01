package pragraClass.assignment.smartHomeControlSystem;

public class Main {
    public static void main(String[] args) {
        SmartFan smartFan = new SmartFan(44470);
        SmartLight smartLight = new SmartLight(77740);

        smartFan.turnON();
        smartLight.turnOff();
    }
}
