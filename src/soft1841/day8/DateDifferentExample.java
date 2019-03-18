package soft1841.day8;

import javax.lang.model.element.VariableElement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Function;

/**
 * 计算两个Date的差值,获取时间差，刚刚，一分钟前，一小时前
 * @zengyue
 * 19.03.18
 */
public class DateDifferentExample {
    public static void main(String[] args) {
        //分别定义起止时间
        String startTime = "2019-03-17 05:35:30";
        String stopTime ="2019-03-18 22：59：59";
//        //通过SimpleDateFormat的对象来把String类型的时间对象转化为Date类型的对象
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        //获取当前时间
//        Date date=new Date();
//        String time = format.format(date);
//        System.out.println("当前时间是：" + date);
//        java.util.Date d1;
//        Date d2;
//        long diff = 0;
//        try {
//            d1 = format.parse(startTime);
//            d2 = format.parse(stopTime);
//            //毫秒ms的差值
//            diff = ((java.util.Date) d2).getTime() - ((java.util.Date) d1).getTime();
//        }catch (ParseException e){
//            e.printStackTrace();
//        }
//        //将毫秒分别换算成秒，分，小时，天
//        long diffSeconds = diff / 1000;
//        long diffMinutes = diff /(1000 * 60);
//        long diffHours = diff /(1000 * 60 * 60);
//        long diffDays = diff /(1000 * 60 *60 *24);
//
//        System.out.println("两个时间相差：" + Math.abs(diffSeconds) + "秒");
//        System.out.println("两个时间相差： " +Math.abs(diffMinutes) + "分");
//        System.out.println("两个时间相差： " +Math.abs(diffHours) + "小时");
//        System.out.println("两个时间相差： " +Math.abs(diffDays) + "天");
        SimpleDateFormat fd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //此时打印的获取系统当前时间
        Calendar calendar = Calendar.getInstance();
        //当前系统时间
        String now = fd.format(calendar.getTime());
        System.out.println( now + "  现在时间" );
        //当前系统的时间的前十秒时间
        calendar.add(Calendar.SECOND,-10);
        String tensecondago = fd.format(calendar.getTime());
        System.out.println(tensecondago +"  十秒前");
        //当前系统的前一小时
        calendar.add(Calendar.HOUR,-1);
        String onehourago = fd.format(calendar.getTime());
        System.out.println(onehourago +"  一小时前" );
        //当前系统的前一天时间
        calendar.add(Calendar.DATE,-1);
        String onedayago = fd.format(calendar.getTime());
        System.out.println( onedayago +" 一天前" );
    }
}
