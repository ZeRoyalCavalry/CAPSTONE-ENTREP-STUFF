package mainPackage;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.Toolkit;

import java.io.Serializable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CutsceneMaker implements Serializable{
	
	BufferedImage spriteLoaded;
	BufferedImage bgLoaded;
	BufferedImage darken;

	UserInterface ui;
	public static JLabel image = new JLabel();

    Dimension gameWindowSize = Toolkit.getDefaultToolkit().getScreenSize();
        int windowWidth = (int)gameWindowSize.getWidth();
        int windowHeight = (int)gameWindowSize.getHeight();
        
        int spriteWidth = 900, spriteHeight = 1200, 
        		alignSpriteX = (int)Math.round(windowWidth/2.5), 
        		alignSpriteY = (int)Math.round(windowHeight/10);

		float bgValue, spriteValue;

	String selectedSprite = null, selectedBG = null;

       	public CutsceneMaker(String selectedBG, String selectedSprite, float bgValue, float spriteValue) {
			this.selectedBG = selectedBG;
			this.selectedSprite = selectedSprite;
			this.bgValue = bgValue;
			this.spriteValue = spriteValue;

			try {
				BufferedImage combinedImage;
			
				darken = ImageIO.read(getClass().getClassLoader().getResource("blackscreen.png"));
				bgLoaded = ImageIO.read(getClass().getClassLoader().getResource(this.selectedBG));
				spriteLoaded = ImageIO.read(getClass().getClassLoader().getResource(this.selectedSprite));
				
				combinedImage = new BufferedImage(windowWidth, windowHeight, BufferedImage.TYPE_INT_ARGB);
				
				Graphics2D darkBG = combinedImage.createGraphics();
				Graphics2D bg = combinedImage.createGraphics();
				Graphics2D sprite = combinedImage.createGraphics();

				darkBG.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
					darkBG.drawImage(darken, 0, 0, windowWidth, windowHeight, null);
				bg.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.bgValue));
					bg.drawImage(bgLoaded, 0, 0, windowWidth, windowHeight, null);
				sprite.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.spriteValue));
					sprite.drawImage(spriteLoaded, alignSpriteX, alignSpriteY, spriteWidth, spriteHeight, null);

				darkBG.dispose();
				bg.dispose();
				sprite.dispose();
				
				image.setIcon(new ImageIcon(combinedImage));
				UserInterface.gameWindow.add(image);
			}
			catch(IOException e) {
			}
       	}
}
