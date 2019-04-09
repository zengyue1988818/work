package soft1841.day21;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawLineThread implements Runnable {
    int x = 50;
    int y = 50;
    private JFrame frame;
    private Color[] colors = {Color.WHITE,Color.BLUE,Color.CYAN,Color.GREEN,Color.ORANGE,Color.YELLOW,
    Color.PINK,Color.green,Color.LIGHT_GRAY};

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }




    @Override
    public void run() {
        Random random = new Random();
        while (true){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            Graphics graphics = frame.getGraphics();
            graphics.setColor(colors[random.nextInt(colors.length)]);
            graphics.drawLine(x,y,600,y);
            y +=10;
            if (y >=500){
                y = 100;
            }
        }

    }
}
