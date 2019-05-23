package soft1841.day39;

public class LoggerCloud implements Logger {
    @Override
    public void log(String messsage){
        System.out.println("日志输出到云平台"+ messsage);
    }
}
