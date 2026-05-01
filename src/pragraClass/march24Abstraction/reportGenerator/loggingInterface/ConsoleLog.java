package pragraClass.march24Abstraction.reportGenerator.loggingInterface;

public class ConsoleLog implements Logger{
    @Override
    public void log() {
        System.out.println("Console Logger");

    }
}
