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

public class Screen extends JPanel implements ActionListener{
	
	Timer alphaTimer = new Timer(20, this);
	BufferedImage buffImage;
	float alphaValue = 1f;
	
	public Screen() {
		
		loadBufferedImage();
		alphaTimer.start();
		
	}
	
	public void loadBufferedImage() {
		
		buffImage = null;
		try {
			buffImage = ImageIO.read(getClass().getClassLoader().getResource("temp2.png"));
		}
		catch(IOException e) {
			
		}
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alphaValue));
		
		g2d.drawImage(buffImage, 0, 0, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		alphaValue-=0.01f;
		if(alphaValue < 0) {
			alphaValue = 0;
			alphaTimer.stop();
		}
		repaint();
	}

}


