package creational.factoryMethod;

public class LoggerDemo {

    public static void main(String[] args) {
        final InfoLoggerFactory loggerFactory = new InfoLoggerFactory();
        final ILogger logger = loggerFactory.createLogger();
        logger.log("Test");
    }
}
