package soft1841.BigWork;

/**
 * 利用swing IO 和多线程和小打卡的知识，仿制手机APP ONE
 * 19.04.22
 */

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.MenuListener;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class BigWork extends JFrame implements ActionListener {
    private JPanel bottomPanel,topPanel;
    private JCheckBoxMenuItem a1,a2;
    private JButton m1,m2,m3,m4,m5,m6;
    private CardLayout cardLayout;
    private JTextArea jlabel;
    private JPanel ovalPanel;
    private JTextArea contentArea;
    private JButton textBtn,musicBtn;
    private JTextField inputFiled;
    private JLabel timeLabel,bgLabel;
    private TimerTask clockTask;
    private Timer timer;
    private JButton chooseBtn,saveBtn,newBtn,osBtn;
    private JFileChooser fileChooser;
    private JPanel centerPanel;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public BigWork(){
        init();
        setTitle("仿制手机APP ONE");
        setSize(900,700);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init(){
        Font font = new Font("宋体",Font.BOLD,24);
        Font font1 = new Font("宋体",Font.PLAIN,12);

        //右部菜单
        m1 = new JButton("ONE STORY");
        m1.setFont(font);
        //按钮添加到窗体中
        getContentPane().add(m1);
        m2 = new JButton("FILMS");
        m2.setFont(font);
        m3 = new JButton("BE AS One");
        m3.setFont(font);
        m4 = new JButton("SOTRYS");
        m4.setFont(font);
        m5 = new JButton("QUSERIONS");
        m5.setFont(font);
        m6 = new JButton("MUSIC");
        m6.setFont(font);
        //中部按钮
        chooseBtn = new JButton("今日名句");
        chooseBtn.setFont(font1);
        saveBtn = new JButton("保存到本地");
        saveBtn.setFont(font1);
        osBtn = new JButton("另存为");
        osBtn.setFont(font1);
        newBtn = new JButton("新建");
        newBtn.setFont(font1);
        chooseBtn.addActionListener(this);
        saveBtn.addActionListener(this);
        osBtn.addActionListener(this);
        newBtn.addActionListener(this);
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        a1 = new JCheckBoxMenuItem("喜欢");
        a1.setFont(font1);
        a2 = new JCheckBoxMenuItem("收藏");
        a2.setFont(font1);

        //时钟的放置
        timeLabel = new JLabel();
        timeLabel.setFont(font1);



        //创建右部文字出现
        ovalPanel = new JPanel();
        ovalPanel.setSize(new Dimension(300,300));
        jlabel = new JTextArea();
        jlabel.setLineWrap(true);
        jlabel.setEditable(false);
        jlabel.setFont(new Font("宋体",Font.BOLD,20));
        String resultStr = null;
        File file = new File("G:\\hello.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            inputStream.read(bytes);
            resultStr = new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] chars = resultStr.toCharArray();
        final String[] s = {
                new String()
        };
        TimerTask writeWord = new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i <chars.length; i++){
                    s[0] += String.valueOf(chars[i]);
                    jlabel.setText(s[0]);
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
       };
        Timer timer = new Timer();
        timer.schedule(writeWord,0,500);



        //创建中间面板，并设置为卡片布局
        topPanel = new JPanel();
        cardLayout = new CardLayout();
        topPanel.setLayout(cardLayout);
        topPanel.setBackground(new Color(255,190, 244));


        //底部图片轮播
        bottomPanel = new JPanel();
        bgLabel = new JLabel();
        add(bgLabel);
        BigThread bt = new BigThread();
        bt.setBgLabel(bgLabel);
        new Thread(bt).start();
        new Thread().start();




        //左部按钮
        musicBtn = new JButton("今日音乐");
        Dimension dimension = new Dimension(180,30);
        musicBtn.setPreferredSize(dimension);
        musicBtn.setFont(font);
        musicBtn.addActionListener(this);
        textBtn = new JButton("今日名句");
        textBtn.setFont(font);
        setLayout(null);





        //设置位置，大小

        m1.setBounds(150,50,190,35);
        m2.setBounds(150,100,190,35);
        m3.setBounds(150,150,190,35);
        m4.setBounds(150,200,190,35);
        m5.setBounds(150,250,190,35);
        m6.setBounds(150,300,190,35);
        a1.setBounds(1335,830,100,25);
        a2.setBounds(1335,880,100,25);
        musicBtn.setBounds(168,350,160,30);
        topPanel.setBounds(530,120,800,800);
        bgLabel.setBounds(100,450,400,400);
        ovalPanel.setBounds(1580,150,450,600);
        jlabel.setBounds(1510,150,400,600);
        bottomPanel.setBounds(100,780,500,300);
        timeLabel.setBounds(1150,50,250,30);
        chooseBtn.setBounds(650,50,100,50);
        saveBtn.setBounds(800,50,100,50);
        osBtn.setBounds(950,50,100,50);
        newBtn.setBounds(1100,50,100,50);
        scrollPane.setBounds(530,120,800,800);
        textBtn.setBounds(1610,50,200,50);


        //加入空布局中
        add(m1);
        add(m2);
        add(m3);
        add(m4);
        add(m5);
        add(m6);
        add(a1);
        add(a2);
        add(musicBtn);
        add(topPanel);
        add(bgLabel);
        add(bottomPanel);
        add(ovalPanel);
        add(jlabel);
        add(timeLabel);
        add(chooseBtn);
        add(saveBtn);
        add(osBtn);
        add(newBtn);
        add(scrollPane);
        add(textBtn);





    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle =
                    BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    BigWork frame = new BigWork();
                    frame.setVisible(true);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        new BigWork();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //文档建立
        //选择文件
        if(e.getSource()==chooseBtn){
            fileChooser =new JFileChooser();
            fileChooser.setCurrentDirectory(new File("G:\\hello"));
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int result=fileChooser.showOpenDialog(null);
            if(result==JFileChooser.APPROVE_OPTION){
                File file=fileChooser.getSelectedFile();
                byte[]bytes=null;
                try{
                    InputStream inputStream = new FileInputStream(file);
                    bytes=new byte[(int)file.length()];
                    inputStream.read(bytes);inputStream.close();
                }catch(IOException ex){
                    ex.printStackTrace();
                }
                String resultStr=new String(bytes);
                textArea.setText("");
                textArea.append(resultStr);
                setTitle(file.getAbsolutePath());
            }
        }
        //新建
        if(e.getSource()==saveBtn){
            String str= textArea.getText();
            File file=new File(getTitle());
            String name= getTitle();
            if(name.equals("新建")){
                fileChooser=new JFileChooser();
                fileChooser.setCurrentDirectory(new File("G:\\hello"));
                fileChooser.setFileFilter(new FileNameExtensionFilter("txt(*.txt)","txt"));
                fileChooser.setSelectedFile(new File("新建文本文档.txt"));
                int result=fileChooser.showSaveDialog(null);
                if(result == JFileChooser.APPROVE_OPTION){
                    File file1=fileChooser.getSelectedFile();
                    try{
                        file1.createNewFile();
                        OutputStream out=new FileOutputStream(file1);
                        PrintStream printStream = new PrintStream(out);
                        printStream.print(str);
                        out.close();
                        printStream.close();
                    }catch(IOException ex){
                        ex.printStackTrace();
                    }
                    setTitle(file1.getAbsolutePath());
                }
            }else{
                try{OutputStream out = new FileOutputStream(file);
                    PrintStream printStream = new PrintStream(out);
                    printStream.print(str);
                    out.close();
                    printStream.close();
                }catch(IOException ex){
                    ex.printStackTrace();}}}
        //另存为
        if(e.getSource() == osBtn){
            fileChooser=new JFileChooser();
            fileChooser.setCurrentDirectory(new File("G:\\hello"));
            fileChooser.setFileFilter(new FileNameExtensionFilter("txt(*.txt)","txt"));
            fileChooser.setSelectedFile(new File("新建文本文档.txt"));
            int result=fileChooser.showSaveDialog(null);
            System.out.println(result);
            if(result==JFileChooser.APPROVE_OPTION){
                String str=textArea.getText();
                File file=fileChooser.getSelectedFile();
                try{
                    file.createNewFile();
                    OutputStream out=new FileOutputStream(file);
                    PrintStream printStream= new PrintStream(out);
                    printStream.print(str);out.close();
                    printStream.close();
                }catch(IOException ex){
                    ex.printStackTrace();
                }
                setTitle(file.getAbsolutePath());
            }
        }
        //新建
        if(e.getSource() == newBtn){
            textArea.setText("");
            setTitle("新建");
        }
        if (e.getSource() == a1){
            cardLayout.next(topPanel);
        }
        if (e.getSource() == a2){
            cardLayout.previous(topPanel);
        }
        //背景音乐
        if (e.getSource() == musicBtn){
            music music = new music();
            new Thread(music).start();
        }

        String filePath = chooseBtn.getText().trim();
        //创建文件
        File file = new File(filePath);
        // 使用三种方法将file中的内容读入
        InputStream in;
        try {
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            // 读入内容到字节数组
            inputStream.read(bytes);
            // 使用bytes构建一个输出字符串
            String resultStr = new String(bytes);
            contentArea.append(resultStr);
            // 追加一次回车换行
            contentArea.append("\r\n");
        } catch (IOException e1) {
            JOptionPane.showMessageDialog(null,"确认");
        }
    }



//背景音乐
class music implements  Runnable{
    @Override
    public void run() {
        URL url;
        File file = new File("G:\\Psycho (Pt. 2) - Russ.wav");
        int i = 1;
        while (i >=1){
            try {
                url = file.toURL();
                AudioClip audioClip = Applet.newAudioClip(url);
                audioClip.play();
            }catch (MalformedURLException e){
                e.printStackTrace();
            }
            try {
                Thread.sleep(10000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            i--;
        }
    }
}




//图片轮播
class BigThread implements Runnable {
    private String[] imgs ={"G:\\bigwork\\1.jpg",
            "G:\\bigwork\\2.jpg","G:\\bigwork\\3.jpg",
            "G:\\bigwork\\4.jpg","G:\\bigwork\\5.jpg",
            "G:\\bigwork\\6.jpg"};

    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }
    @Override
    public void run() {
        int i = 0;
        int len = imgs.length - 1;
        while (true){
            try{
                File file= new File(imgs[i]);
                InputStream inputStream= new FileInputStream(file);
                byte[] bytes = new byte[(int)file.length()];
                inputStream.read(bytes);
                Icon icon= new ImageIcon(bytes);
                bgLabel.setIcon(icon);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                i++;
                if(i==len){
                    i=0;
                }
            } catch(IOException e){
                System.err.println("IO异常");
            }
        }
    }
}

    //创建窗体
    public void BigFrame(){
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
                //自v黄口添加到父窗口中
                getContentPane().add(bigFrame);
            }
        });
    }
}




