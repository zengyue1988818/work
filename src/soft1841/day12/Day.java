package soft1841.day12;
/**
 * calander时间的用法
 * @znegyue
 * 19.03.22
 */

import java.util.Calendar;
import java.util.Date;

public class Day {
    public static void main(String[] args) {
        //创建Calander对象
       Calendar c =Calendar.getInstance();
       //获取年
        int year = c.get(Calendar.YEAR);
        //获取月份，0表示一月份
        int month = c.get(Calendar.MONTH) + 1;
        //获取日期
        int day = c.get(Calendar.DAY_OF_MONTH);
        //获取小时
        int hour = c.get(Calendar.HOUR_OF_DAY);
        //获取分钟
        int minute = c.get(Calendar.MINUTE);
        //获取秒
        int second = c.get(Calendar.SECOND);
        System.out.println("当前时间：" + year+"-" +month+"-"
        +day+" " +hour+ ":"+minute+":"+second);
        //将Calander对象转换为Date对象
        Date date = c.getTime();
        //获取当前毫秒数
        Long time = c.getTimeInMillis();
        System.out.println("当前时间：" +date);
        System.out.println("当前毫秒数：" +time);
    }
}
