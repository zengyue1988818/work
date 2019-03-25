package soft1841.ElevenUnit;

/**
 * FileStreamTest类应用
 * @zengyue
 * 19.03.25
 */
import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) throws IOException {
        //创建文件对象
        File file = new File("word.txt");
        //捕获异常
        try {
            //创建FileOutputStream对象，用来向文件中写入数据
            FileOutputStream out = new FileOutputStream(file);
            //定义字符串，用来储存要写入的文件内容
            String content = "你见过洛杉矶凌晨四点的样子吗？";
            //创建Byte类型的数组，将要写入文件的内容转换为字节数组
            byte buy[] = content.getBytes();
            //将数组中的信息写入到文件中
            out.write(buy);
            //将流关闭
            out.close();
            //catch语句处理异常
        }catch (IOException e){
            //输出异常信息
            e.printStackTrace();
        }
        try {
            //创建FileInputStream 对象，用来读取文件内容
            FileInputStream in = new FileInputStream(file);
            //创建byte数组，用来储存读取到的内容
            byte byt[] = new byte[1024];
            //从文中读取信息，并存入字节数组中
            int len = in.read(byt);
            //将文件的信息输出
            System.out.println("文件中的信息是：" + new String(byt,0,len));
            //关闭流
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
