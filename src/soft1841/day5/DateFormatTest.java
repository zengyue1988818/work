package soft1841.day5;
/**
 * 日期格式
 * @zengyue
 * 19.03.14
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) {
        //创建日期
        Date date = new Date();
        //创建不同的日期格式
        DateFormat dateFormat1 = DateFormat.getInstance();
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE");
        DateFormat df3 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒 EE", Locale.CHINA);
        DateFormat df4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE",Locale.US);
        DateFormat df5 = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat df6 = new SimpleDateFormat("yyyy年MM月dd日");
        //将日期按照不同的格式进行输出
        System.out.println("------------将日期按照不同格式进行输出------------------------");
        System.out.println("按照java默认的日期格式：" +dateFormat1.format(date));
        System.out.println("按照java默认的日期格式：" +dateFormat1.format(date));
        System.out.println("按照指定格式 yyyy-MM-dd hh:mm:ss EE,系统默认区域：" +dateFormat2.format(date));
        System.out.println("按照指定格式 yyyy年MM月dd日 hh时mm分ss秒 EE，区域为中国：" +df3.format(date));
        System.out.println("按照指定格式 yyyy-MM-dd hh:mm:ss EE,区域为美国："+df4.format(date));
        System.out.println("按照指定格式 yyyy-MM-dd:" +df5.format(date));
        System.out.println("按照指定格式 yyyy年MM月dd日："+df6.format(date));
    }
}
