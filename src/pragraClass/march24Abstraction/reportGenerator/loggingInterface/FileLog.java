package pragraClass.march24Abstraction.reportGenerator.loggingInterface;

public class FileLog implements Logger{
    @Override
    public void log() {
        System.out.println("File Logger");
    }
}
