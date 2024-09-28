package creational.abstractFactory;

public class Client {
    public static void main(String[] args) {
        final LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        final InfoLogger consoleInfoLogger = consoleLoggerFactory.createInfoLogger();
        consoleInfoLogger.log("Testing ConsoleLogger");

        final LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        final ErrorLogger fileErrorLogger = fileLoggerFactory.createErrorLogger();
        fileErrorLogger.log("Testing fileLogger");

    }
}
