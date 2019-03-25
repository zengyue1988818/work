package soft1841.ElevenUnit;
/**
 * FileTest类，判断test.txt是否存在
 * @zengyue
 * 19.03.25
 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        //创建文件对象
        File file = new File("test.txt");
        //文件不存在（第一次运行时，执行的语句块）
        if (!file.exists()){
            System.out.println("未在指定目录下找到文件名为“test”的文本文件，正在创建。。。");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //创建该文件
            System.out.println("文件创建成功！");
        }else {
            //文件存在（程序第二次运行时，执行的语句块）
            System.out.println("找到文件名为test的文本文件！");
            //该文本文件时一个标准文件而且该文件可读
            if (file.isFile() && file.canRead()){
                System.out.println("文件可读，正在读取文件信息...");
                //获取文件名
                String fileName = file.getName();
                //获取该文件的绝对路径
                String filePath = file.getAbsolutePath();
                //获取该文件是否被隐藏
                boolean hidden = file.isHidden();
                //获取该文件的字节数
                long len = file.length();
                //获取该文件最后的修改时间
                long tempTime = file.lastModified();
                //创建SimpleDateFormat 对象，指定目标格式
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                //使用文件最后修改时间创建Date对象
                Date date = new Date(tempTime);
                //格式化文件最后的修改时间
                String time = simpleDateFormat.format(date);
                //输出文件名
                System.out.println("文件名：" +fileName);
                //输出文件的绝对路径
                System.out.println("文件的绝对路径：" +filePath);
                //输出文件是否被隐藏
                System.out.println("文件是否被隐藏：" +hidden);
                //输出该文件的字节数
                System.out.println("文件中的字节数：" +len);
                //输出该文件的最后修改时间
                System.out.println("文件的最后修改时间：" +time);
                //查看该文件信息后，删除文件
                file.delete();
                System.out.println("这个文件的使命结束了！已经被删除了。");
            }else {
                System.out.println("文件不可读！");
            }
        }
    }
}
