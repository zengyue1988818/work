package soft1841.day4;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * 屏幕上两点之间的距离
 * @zengyue
 * 19.03.13
 */
public class Distance {
    public static void main(String[] args) throws IOException {
        //指定图片大小和类型
        BufferedImage bufferedImage = new BufferedImage(1024, 768, BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics g = bufferedImage.getGraphics();
        //获取字体
        Font font = new Font("微软雅黑", Font.BOLD, 20);
        g.setFont(font);
        //绘制一个粉色矩形
        g.setColor(Color.PINK);
        g.fillRect(0, 0, 1024, 768);
        //生成两个随机点
        Random random = new Random();
        int x1 = random.nextInt(1024);
        int y1 = random.nextInt(768);
        int x2 = random.nextInt(1024);
        int y2 = random.nextInt(768);
        //控制台输出两点
        System.out.println("点1:(" + x1 + "," + y1 + ") 点2:(" + x2 + "," + y2 + ")");
        //计算两点距离
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        //十进制格式，保留两位小数
        DecimalFormat df = new DecimalFormat("#.00");
        String string = df.format(distance);
        //控制台输出距离
        System.out.println("两点距离为：" + string);
        //更改画笔颜色
        g.setColor(Color.BLACK);
        //绘制线段
        g.drawLine(x1, y1, x2, y2);
        //写上线段长度
        g.drawString(string,(x1+x2)/2,(y1+y2)/2);
        //输出图片,并指定文件路径
        File file = new File("G:/distance.jpg");
        //获取输出流
        OutputStream outputStream = new FileOutputStream(file);
        //将图片从缓冲区通过字节写到文件
        ImageIO.write(bufferedImage, "jpg", outputStream);
        //关闭输出流
        outputStream.close();
    }
}