package behavioral.chainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }

    public void log(String logLevel, String message){

        if(logLevel.equals(LogLevel.DEBUG.name())) {
            System.out.println("DEBUG: " + message);
        } else{

            super.log(logLevel, message);
        }
    }
}


