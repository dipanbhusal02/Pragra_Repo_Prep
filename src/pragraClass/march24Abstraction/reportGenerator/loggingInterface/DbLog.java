package pragraClass.march24Abstraction.reportGenerator.loggingInterface;

public class DbLog implements Logger {
    @Override
    public void log() {
        System.out.println("Db Logger");
    }
}
