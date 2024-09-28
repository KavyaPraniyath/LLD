package creational.abstractFactory;

public class FileInfoLogger implements InfoLogger {
    @Override
    public void log(String msg) {
        System.out.println("FileInfoLogger: " + msg);
    }
}
