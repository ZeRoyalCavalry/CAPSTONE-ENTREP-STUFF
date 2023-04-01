package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class arcScreen extends JPanel implements ActionListener{

    public Timer arcTextTimer = new Timer(15, this);
    Dimension gameWindowSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int)gameWindowSize.getWidth();
        int screenHeight = (int)gameWindowSize.getHeight();
        int textPositionY = screenHeight;
        int textPositionX;
        Graphics2D g2d;

    public String arcText;

    public arcScreen(String arcText){
        Game.enableKeys = 0;
        this.arcText = arcText;
        arcTextTimer.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g2d = (Graphics2D)g;

        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 90));
        g2d.setColor(Color.BLACK);
        //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        int y = textPositionY;

        for(String line : arcText.split("\n")){
            int textLength = (int)g2d.getFontMetrics().getStringBounds(line, g2d).getWidth();
            textPositionX = ((getWidth()/2) - (textLength/2));
            g2d.drawString(line, textPositionX, y);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(textPositionY);
        if(textPositionY <= 420){
            Game.enableKeys = 1;
            arcTextTimer.stop();
        }
        textPositionY-=3;
        repaint();
    }
}
