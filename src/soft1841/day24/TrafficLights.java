package soft1841.day24;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TrafficLights  extends JFrame {
    private JPanel contentPane;
    private JLabel IbIimage;

    public static void main(String[] args) {
        TrafficLights frame = new TrafficLights();
        frame.setVisible(true);
    }

    //创建窗体
    public TrafficLights(){
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,125,278);
        //内容面板
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        setContentPane(contentPane);
        // 图片面板
        JPanel imagePane = new JPanel();
        imagePane.setBackground(Color.WHITE);
        imagePane.setBorder(new TitledBorder(null, "交通灯", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        contentPane.add(imagePane);
        imagePane.setLayout(new BorderLayout(0, 0));
        // 标签
        JLabel lblImage = new JLabel("");
        lblImage.setBackground(Color.WHITE);
        lblImage.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/Green.png")));
        imagePane.add(lblImage, BorderLayout.CENTER);

        Thread thread = new TurnColor(lblImage); // 创建线程类的子类之“改变颜色”的对象
        thread.start(); // 启用线程
    }
}
class TurnColor extends Thread { // 创建“改变颜色”类继承线程类
    private JLabel lblImage; // 图像标签

    public TurnColor(JLabel lblImage) { // 以图像标签为参数的构造方法，利用构造方法初始化变量
        this.lblImage = lblImage;
    }

    @Override
    public void run() { // 线程执行的任务
        while (true) { // 线程始终处于被启用状态
            try {
                Thread.sleep(5000); // 线程休眠5秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lblImage.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/Yellow.png"))); // 黄灯
            try {
                Thread.sleep(2000); // 线程休眠2秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lblImage.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/Red.png"))); // 红灯
            try {
                Thread.sleep(8000); // 线程休眠8秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lblImage.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/Green.png"))); // 绿灯
        }
    }
}
