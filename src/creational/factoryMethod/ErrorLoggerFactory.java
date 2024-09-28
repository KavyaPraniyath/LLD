package creational.factoryMethod;

public class ErrorLoggerFactory implements LoggerFactory {
    @Override
    public ILogger createLogger() {
        return new ErrorLogger();
    }
}
