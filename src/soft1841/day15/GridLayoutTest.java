package soft1841.day15;
/**
 * GridLayout网格布局示例
 * @zengyue
 * 1.03.27
 */

import javax.swing.*;
import java.awt.*;

public class GridLayoutTest extends JFrame {
    //定义一个面板数组
    private JPanel[] panels;


    private GridLayoutTest(){
        init();
     setTitle("GridLayout网格布局管理器");
     //界面启动最大化
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){

        //将整个容器背景颜色设置为白色
        getContentPane().setBackground(new Color(255,255,255));
        //定义三行三列九宫格，放置9个面板
        GridLayout gridLayout = new GridLayout(3,3,50,30);
        setLayout(gridLayout);
        //创建面板数组
        panels = new JPanel[9];
        //循环创建每个面板对象
        for (int i = 0; i <9;i++){
            panels[i] = new JPanel();
            //面板上加上边框
            panels[i].setBorder(BorderFactory.createTitledBorder("面板" + (i +1)));
            //面板依次加上网络布局管理器，变成九宫格
            add(panels[i]);
        }

        //设置第一个面板背景色，其布局方式默认为flowlayout居中对齐
        panels[0].setBackground(new Color(178,223,219));
        //在第一个面板布局中加入5个按钮
        for (int i = 0; i<5;i++){
            panels[0].add(new JButton("科技"));
        }


        //设置第二个面板为Borderlayout边界布局，设置背景色
        panels[1].setLayout(new BorderLayout(20,20));
        panels[1].setBackground(new Color(0,172,193));
        //5个方向加入按钮
        panels[1].add(new JButton("北"),BorderLayout.NORTH);
        panels[1].add(new JButton("南"),BorderLayout.SOUTH);
        panels[1].add(new JButton("东"),BorderLayout.EAST);
        panels[1].add(new JButton("西"),BorderLayout.WEST);
        panels[1].add(new JButton("中"),BorderLayout.CENTER);



        //设置第三个面板为Gridlayout网格布局，设置背景色
        panels[2].setLayout(new GridLayout(3,3,10,10));
        panels[2].setBackground(new Color(77,182,172));
        //依次加入9个按钮
        for(int i = 0;i<9;i++){
            panels[2].add(new JButton(String.valueOf(i + 1)));
        }



        //设置第四个面板为BordLayout边界布局，设置背景色
        panels[3].setLayout(new BorderLayout(30,30));
        panels[3].setBackground(new Color(140, 153, 250));
        //五个方向加入文本
        panels[3].add(new JLabel("                " +
                "北京"),BorderLayout.NORTH);
        panels[3].add(new JLabel("               深圳"),BorderLayout.SOUTH);
        panels[3].add(new JLabel("上海            "),BorderLayout.EAST);
        panels[3].add(new JLabel("南京"),BorderLayout.WEST);
        panels[3].add(new JLabel("        " +
                "武汉"),BorderLayout.CENTER);



        //设置第五个面板背景色，其布局方式默认为flowlayout居中对齐
        panels[4].setLayout(new FlowLayout(30));
        panels[4].setBackground(new Color(223, 157, 160));
        //加入文本框
       panels[4].add(new JTextField("语文"));
        panels[4].add(new JTextField("数学"));
        panels[4].add(new JTextField("英语"));
        panels[4].add(new JTextField("计算机"));
        panels[4].add(new JTextField("科学"));
        panels[4].add(new JTextField("社会"));




        //设置第六个面板背景色，其布局方式默认为Gridlayout网格布局
        panels[5].setLayout(new GridLayout(3,3,10,10));
        panels[5].setBackground(new Color(182, 132, 181));
        //依次加入6个密码框
        for (int i = 0; i<6;i++){
            panels[5].add(new JPasswordField(String.valueOf(i + 1)));




            //设置第七个面板为BordLayout边界布局，设置背景色
            panels[6].setLayout(new BorderLayout(0,0));
            panels[6].setBackground(new Color(255, 243, 181));
            //加入一个文本框，一个按钮
            panels[6].add(new JTextField("英国"),BorderLayout.NORTH);
            panels[6].add(new TextField("美国"),BorderLayout.SOUTH);
            panels[6].add(new JTextField("法国"),BorderLayout.EAST);
            panels[6].add(new JTextField("新西兰"),BorderLayout.WEST);
            panels[6].add(new JTextField("中国"),BorderLayout.CENTER);}



            //设置第八个面板背景色，其布局方式默认为Gridlayout网格布局
            panels[7].setLayout(new GridLayout(3,3,10,10));
            panels[7].setBackground(new Color(182, 139, 155));
          for (int k = 0; k <4;k++){
              panels[7].add(new JRadioButton(String.valueOf(k + 1)));
          }


              //设置第九个面板背景色，其布局方式默认为flowlayout居中对齐
              panels[8].setBackground(new Color(218, 190, 223));
                  panels[8].add(new JComboBox());
              }





    public static void main(String[] args) {
        //用系统样式替代Swing默认方式，会稍微好看一点
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e){
            e.printStackTrace();
        }
        new GridLayoutTest();
    }
}
