package creational.abstractFactory;

public interface LoggerFactory {
    InfoLogger createInfoLogger();

    ErrorLogger createErrorLogger();
}
