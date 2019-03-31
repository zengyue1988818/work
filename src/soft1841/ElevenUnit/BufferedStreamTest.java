package soft1841.ElevenUnit;

import java.io.*;

/**
 * 字节为单位进行输入输出
 * @zengyue
 * 19.03.27
 */
public class BufferedStreamTest {
    public static void main(String[] args) {
        //定义字符串数组
        String content[] = {"你不喜欢我，","我一点都不介意。","因为我活着不是为了取悦你！"};
        //创建文件对象
        File file = new File("wordtest.txt");
        ///创建FileOutputStream对象
        FileOutputStream fileOutputStream = null;
        //创建BufferedOutputStream对象
        BufferedOutputStream bufferedOutputStream = null;
        //创建FileInputStream对象
        FileInputStream fileInputStream = null;
        //创建BufferInputStream对象
        BufferedInputStream bufferedInputStream = null;
        try {
            //实例化FileOutputStream对象
            fileOutputStream = new FileOutputStream(file);
            //实例化BufferedOutputStream对象
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //创建可以容纳1024个字节数的缓冲区
            byte[] bContent = new byte[1024];
            //循环遍历数组
            for (int k = 0; k < content.length; k++){
               //将遍历到的数组内容转换为字节数组
                bContent = content[k].getBytes();
                //将字节数组内容写入文件
                bufferedOutputStream.write(bContent);
            }
            System.out.println("写入成功！ \n");
            //处理异常
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                //将BufferedOutputStream流关闭
                bufferedOutputStream.close();
                //将fileOutputStream流关闭
                fileOutputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        try {
            //实例化FileInputStream对象
            fileInputStream = new FileInputStream(file);
            //实例化BufferedInputStream对象
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            //创建byte数组，用来储存读取到的内容
            byte[] bContent = new byte[1024];
            //从文件中读取信息，并存入字节数组中
            int len = bufferedInputStream.read(bContent);
            //输出文件数据
            System.out.println("文件中的信息是：" + new String(bContent,0,len));
            //处理异常
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                //将流关闭
                bufferedInputStream.close();
                fileInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
