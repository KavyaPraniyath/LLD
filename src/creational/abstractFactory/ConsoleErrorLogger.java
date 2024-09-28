package creational.abstractFactory;

public class ConsoleErrorLogger implements ErrorLogger {
    @Override
    public void log(String msg) {
        System.out.println("ConsoleErrorLogger: " + msg);
    }
}
