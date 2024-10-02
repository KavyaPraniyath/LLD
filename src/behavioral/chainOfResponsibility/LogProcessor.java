package behavioral.chainOfResponsibility;

public abstract class LogProcessor {

    private final LogProcessor nextLogProcessor;

    public LogProcessor(final LogProcessor logProcessor) {
        this.nextLogProcessor = logProcessor;
    }

    public void log(String logLevel, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }
    }
}
