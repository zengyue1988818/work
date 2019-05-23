package soft1841.day39;

public class LoggerFileSystem implements Logger {
   @Override
    public void log(String message){
        System.out.println("日志输出到" +
                "本地系统文件" +message);
    }
}
