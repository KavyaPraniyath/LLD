package creational.abstractFactory;

public class ConsoleLoggerFactory implements LoggerFactory {
    @Override
    public InfoLogger createInfoLogger() {
        return new ConsoleInfoLogger();
    }

    @Override
    public ErrorLogger createErrorLogger() {
        return new ConsoleErrorLogger();
    }
}
