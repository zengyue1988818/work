package soft1841.day16;
/**
 * 输出机器下指定文件的类型
 * @zengyue
 * 19.04.01
 */

import java.io.File;

public class FolderTest {
    public static void main(String[] args) {
        //要遍历的路径
        String path ="G:\\JAVA";
        //获取其file对象
        File file = new File(path);
        //遍历path下的文件和目录，放在file数组中
        File[] fs = file.listFiles();
        //遍历File[]数组
        for (File f:fs){
            //若非目录（即文件），则打印
            if (!f.isDirectory()) System.out.println(f);
        }
    }
}
