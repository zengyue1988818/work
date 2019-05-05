package soft1841.BigWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class BigFrame extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    BigFrame frame = new BigFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    //创建窗体
    public BigFrame(){
        setTitle("电影窗口");
        setBounds(400,500,800,600);
        //自由布局
        getContentPane().setLayout(null);
        JButton m1 = new JButton("电影频道");
        m1.setBounds(0,0,93,23);
        //按钮添加到窗体中
        getContentPane().add(m1);


        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //新建子窗口对象
                BigFrame bigFrame = new BigFrame();
                //子窗口可见
                bigFrame.setVisible(true);
                //将子窗口添加到父窗口中
                getContentPane().add(bigFrame);
            }
        });
    }
}
