package creational.abstractFactory;

public class ConsoleInfoLogger implements InfoLogger {
    @Override
    public void log(String msg) {
        System.out.println("ConsoleInfoLogger: " + msg);
    }
}
