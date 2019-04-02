package soft1841.day18;

import java.io.*;

/**
 * 带缓冲的输入输出流
 */
public class BufferedTest {
    public static void main(String[] args) {
        //定义字符串数组
        String content[] ={"你不喜欢我.","我一点也不介意.","因为我活下来.","不是为了取悦你！"};
        //创建文件对象
        File file = new File("word.txt");
        try {
            //创建FileWriter类对象
            FileWriter fileWriter = new FileWriter(file);
            //创建BufferedWriter对象
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //循环遍历数组
            for ( int k = 0; k < content.length; k++){
                //将字符串数组中元素写入到磁盘文件中
                bufferedWriter.write(content[k]);
                //将数组中的单个元素以单行的形式写入文件
                bufferedWriter.newLine();
            }
            //将bufferedWriter流关闭
            bufferedWriter.close();
            //将Filewriter流关闭
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader(file);
            //创建Buffetedreader类对象
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //创建字符串对象
           String s = null;
           //声明int类型变量
            int i = 0;
            //如果·文件的·文本行数不为null,则进入循环
            while ((s = bufferedReader.readLine()) != null){
                //将变量做自增运算
                i++;
                //输出文件数据
                System.out.println("第" + i + "行：" + s);
            }
            bufferedReader.close();
            fileReader.close();
        }catch ( IOException e){
            e.printStackTrace();
        }
    }
}
