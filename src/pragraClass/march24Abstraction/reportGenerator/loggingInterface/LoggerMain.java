package pragraClass.march24Abstraction.reportGenerator.loggingInterface;

public class LoggerMain {
    public static void main(String[] args) {
        Logger logger= new ConsoleLog();
        logger.log();
    }
}
