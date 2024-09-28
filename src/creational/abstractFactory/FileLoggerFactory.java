package creational.abstractFactory;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public InfoLogger createInfoLogger() {
        return new FileInfoLogger();
    }

    @Override
    public ErrorLogger createErrorLogger() {
        return new FileErrorLogger();
    }
}
