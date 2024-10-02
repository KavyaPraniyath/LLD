package behavioral.chainOfResponsibility;

public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String logLevel, String message) {
        if (logLevel.equals(LogLevel.INFO.name())) {
            System.out.println("INFO: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
