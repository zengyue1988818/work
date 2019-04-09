package soft1841.day21;

import javax.swing.*;
import java.awt.*;

public class DrawLingFrame extends JFrame{
    public DrawLingFrame(){
        init();
        setTitle("轮播窗体");
       setSize(900,600);
       setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }


    private void init(){
        getContentPane().setBackground(new Color(0,0,0));
        DrawLineThread drawLineThread = new DrawLineThread();
       drawLineThread.setFrame(this);
        new Thread(drawLineThread).start();

    }



    public static void main(String[] args) {
                new DrawLingFrame();
    }
}
