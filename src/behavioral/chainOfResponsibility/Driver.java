package behavioral.chainOfResponsibility;

public class Driver {
    public static void main(String[] args) {
        final LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogLevel.ERROR.name(), "Exception");
        logProcessor.log(LogLevel.DEBUG.name(), "Debugging");
    }
}
