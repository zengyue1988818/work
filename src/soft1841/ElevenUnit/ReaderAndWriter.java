package soft1841.ElevenUnit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * FileWriter类型
 * @zengyue
 * 19.03.25
 */
public class ReaderAndWriter {
    public static void main(String[] args) {
        //设置无限循环，实现控制台的多次输入
        while (true){
            try {
                //在当前目录下创建名为”word.txt"的文本文件
                File file = new File("word.txt");
                if (!file.exists()){
                    //如果文件不存在时，创建新的文件
                    file.createNewFile();
                }
                System.out.println("请输入要执行的操作号：（1.写入文件；2.读取文件");
                //控制台输入
                Scanner scanner = new Scanner(System.in);
                //获得“要执行的操作序号”
                int choice = scanner.nextInt();
                //以"操作序号”为关键字的多分枝语句
                switch (choice){
                    //控制台输入1
                    case 1:
                        System.out.println("请输入要写入的文件的内容：");
                        //获取控制台上要写入的文件的内容
                        String tempstr = scanner.next();
                        //声明字符输出流
                        FileWriter fw = null;
                        try {
                            //创建可扩展的字符输出流，向文件中写入新数据时不覆盖已存在的数据
                            fw = new FileWriter(file,true);
                            //把控制台上的文本内容写入到“word.txt”中
                            fw.write(tempstr + "\r\n");
                        }catch (IOException e){
                            e.printStackTrace();
                        }finally {
                            //关闭字符输出流
                            fw.close();
                        }
                        System.out.println("上述内容已写入到文本文件中！");
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
