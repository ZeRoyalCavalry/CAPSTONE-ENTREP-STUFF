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
	
	gameStory Story;

	public Timer alphaTimer = new Timer(18, this);
	public BufferedImage buffImage = null;
	public float alphaValue = 1f;
	public String imageName;

	public Screen(String imageName) {
		Game.enableKeys = 0;
		this.imageName = imageName;
		loadBufferedImage();
		alphaTimer.start();
		
	}
	
	public void loadBufferedImage() {
		this.buffImage = null;
		try {
			//buffImage = ImageIO.read(getClass().getClassLoader().getResource("temp2.png"));
			this.buffImage = ImageIO.read(getClass().getClassLoader().getResource(this.imageName));
		}
		catch(IOException e) {
			
		}
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alphaValue));
		
		g2d.drawImage(this.buffImage, 0, 0, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		alphaValue-=0.01f;
		if(alphaValue < 0) {
			alphaValue = 0;
			alphaTimer.stop();
			Game.enableKeys = 1;
		}
		repaint();
	}
}



