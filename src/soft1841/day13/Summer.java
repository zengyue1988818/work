package soft1841.day13;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;

/**
 * Summer 的流式布局
 * @zengyue
 * 19.03.25
 */
        public class Summer extends JFrame {
            public Summer(){
                setTitle("标题");
                Container container = getContentPane();
                //按照右对齐排列
                setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        container.add(new JLabel("下面四句诗，那一句是描写夏天的？"));
        container.add(new JButton("A.秋风萧瑟天气凉，树木摇荡露为霜。"));
        container.add(new JButton("B.白雪纷纷何所以，撒盐空中差可拟。"));
        container.add(new JButton("C.接天莲叶无穷碧，映日荷花别样红。"));
        container.add(new JButton("D.竹外桃花三两枝，春江水暖鸭先知。"));
        //设置组件大小宽度，高度
        setSize(300,250);
        //设置窗体关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //设置组件为可见，true为可见，false为不可见
        setVisible(true);
        //设置不可调节大小
        setResizable(false);
    }
     //在主方法中调用CreateJFrame()方法
    public static void main(String[] args) {
        new  Summer();
    }
}
