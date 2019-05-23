package soft1841.day39;

import java.util.Calendar;

public class TimeLoggerDecorator implements Logger {
    private Logger decoratorLoger;
    public TimeLoggerDecorator(Logger decoratorLoger){
        this.decoratorLoger = decoratorLoger;
    }
    @Override
    public void log(String message){
        decoratorLoger.log(message);
        logTime();
    }
    public void logTime(){
        System.out.println(Calendar.getInstance().getTime());
    }
}
