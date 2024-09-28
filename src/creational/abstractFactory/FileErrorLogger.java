package creational.abstractFactory;

public class FileErrorLogger implements ErrorLogger{
    @Override
    public void log(String msg) {
        System.out.println("FileErrorLogger: " + msg);
    }
}
