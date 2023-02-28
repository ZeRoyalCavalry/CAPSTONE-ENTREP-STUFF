package mainPackage;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.Toolkit;

import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CutsceneMaker extends JPanel implements Serializable{
	
	BufferedImage spriteLoaded;
	BufferedImage bgLoaded;

	UserInterface ui;
	
	JPanel cutsceneHolder;

    Dimension gameWindowSize = Toolkit.getDefaultToolkit().getScreenSize();
        int windowWidth = (int)gameWindowSize.getWidth();
        int windowHeight = (int)gameWindowSize.getHeight();
        
        int spriteWidth = 900, spriteHeight = 1200, 
        		alignSpriteX = (int)Math.round(windowWidth/2.5), 
        		alignSpriteY = (int)Math.round(windowHeight/10);

	String selectedSprite, selectedBG;

       	public CutsceneMaker(String selectedSprite, String selectedBG) {
			this.selectedSprite = selectedSprite;
			this.selectedBG = selectedBG;
			
			try {
				spriteLoaded = null;
				bgLoaded = null;

				BufferedImage combinedImage;
			
				bgLoaded = ImageIO.read(getClass().getClassLoader().getResource(this.selectedBG));
				spriteLoaded = ImageIO.read(getClass().getClassLoader().getResource(this.selectedSprite));
				
				combinedImage = new BufferedImage(windowWidth, windowHeight, BufferedImage.TYPE_INT_ARGB);
				
				Graphics2D sprite = combinedImage.createGraphics();
				Graphics2D bg = combinedImage.createGraphics();
				
				bg.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.75f));
					bg.drawImage(bgLoaded, 0, 0, windowWidth, windowHeight, null);
				sprite.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
					sprite.drawImage(spriteLoaded, alignSpriteX, alignSpriteY, spriteWidth, spriteHeight, null);
				
				bg.dispose();
				sprite.dispose();
				
				JLabel image = new JLabel();
				UserInterface.gameWindow.add(image);
				image.setIcon(new ImageIcon(combinedImage));
			}
			catch(IOException e) {
			}
       	}
}
