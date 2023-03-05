package mainPackage;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class fadeIn extends JPanel implements ActionListener {

    public Timer fadeInTimer = new Timer(18, this);
    public BufferedImage fadeInImage;
    public float fadeInValue = 0.01f;
    public String bgImage;


    public fadeIn(String bgImage){
        Game.enableKeys = 0;
        this.bgImage = bgImage;
        loadFadeImage();
        fadeInTimer.start();
    }
    
    public void loadFadeImage(){
        this.fadeInImage = null;
        try{
            this.fadeInImage = ImageIO.read(getClass().getClassLoader().getResource(this.bgImage));
        }
        catch(IOException fiE){
        }
    }
    public void paint(Graphics g2){
        super.paint(g2);
        Graphics2D fadeinG2D = (Graphics2D)g2;

        fadeinG2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, fadeInValue));
        fadeinG2D.drawImage(this.fadeInImage, 0, 0, null);
    }

    @Override
    public void actionPerformed(ActionEvent fadeinEvent) {
        fadeInValue = fadeInValue + 0.01f;
        if(fadeInValue > 1){
            fadeInValue = 1;
            fadeInTimer.stop();
            Game.enableKeys = 1;
        }
        repaint();
    }
    
}
