package soft1841.ElevenUnit;

import java.io.File;

/**
 * 文件夹的Test文件
 * @zengyue
 * 19.03.25
 */
public class FolderTest {
    public static void main(String[] args) {
        //声明文件夹Test所在的目录
        String path = "G:Test";
        //循环获得i值，并用i命名新的文件夹
        for (int i=1;i<=10;i++){
            //根据新的目录，创建File对象
            File folder = new File(path +"\\" +i);
            //文件夹不存在
            if (!folder.exists()){
                //创建新的文件夹（包括不存在的父文件夹）
                folder.mkdirs();
            }
        }
        System.out.println("文件夹创建成功，请打开G盘查看！\n\nG盘文件及文件夹列表如下：");
        //根据路径名创建File对象
        File file = new File("G:\\");
        //获得G盘所有的文件和文件夹
        File[] files = file.listFiles();
        //遍历files数组
        for (File folder : files){
            //判断是否为文件
            if (folder.isFile())
                //输出G盘下所有的文件名称
                System.out.println(folder.getName() +"文件");
            //判断是否为文件夹
            else if (folder.isDirectory())
                //输出G盘下所有的文件夹名称
                System.out.println(folder.getName() + "文件夹");
        }
    }
}
