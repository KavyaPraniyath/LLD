package behavioral.chainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{

    ErrorLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }

    public void log(String logLevel,String message){

        if(logLevel.equals(LogLevel.ERROR.name())) {
            System.out.println("ERROR: " + message);
        } else{

            super.log(logLevel, message);
        }

    }
}

