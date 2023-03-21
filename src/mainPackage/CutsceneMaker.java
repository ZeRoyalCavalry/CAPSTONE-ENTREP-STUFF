package mainPackage;

import java.awt.AlphaComposite;
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
	
	BufferedImage darken, bgLoaded, spriteLoaded, fgLoaded, effectLoaded;

	UserInterface ui;
	public static JLabel image = new JLabel();

    Dimension gameWindowSize = Toolkit.getDefaultToolkit().getScreenSize();
        int windowWidth = (int)gameWindowSize.getWidth();
        int windowHeight = (int)gameWindowSize.getHeight();
        
        int spriteWidth = 500, spriteHeight = 1300, 
        		alignSpriteX = (int)Math.round(windowWidth/1.78), 
        		alignSpriteY = (int)Math.round(windowHeight/12);

		float bgValue, spriteValue, fgValue, effectValue;

	String selectedSprite = null, selectedBG = null, selectedFG = null, selectedEffect = null;

       	public CutsceneMaker(String selectedBG, String selectedSprite, String selectedFG, String selectedEffect, 
								float bgValue, float spriteValue, float fgValue, float effectValue) {
			this.selectedBG = selectedBG;
			this.selectedSprite = selectedSprite;
			this.selectedFG = selectedFG;
			this.selectedEffect = selectedEffect;

			this.bgValue = bgValue;
			this.spriteValue = spriteValue;
			this.fgValue = fgValue;
			this.effectValue = effectValue;

			try {
				BufferedImage combinedImage;
			
				darken = ImageIO.read(getClass().getClassLoader().getResource("blackscreen.png"));
				bgLoaded = ImageIO.read(getClass().getClassLoader().getResource(this.selectedBG));
				spriteLoaded = ImageIO.read(getClass().getClassLoader().getResource(this.selectedSprite));
				fgLoaded = ImageIO.read(getClass().getClassLoader().getResource(this.selectedFG));
				effectLoaded = ImageIO.read(getClass().getClassLoader().getResource(this.selectedEffect));
				
				combinedImage = new BufferedImage(windowWidth, windowHeight, BufferedImage.TYPE_INT_ARGB);
				
				Graphics2D darkBG = combinedImage.createGraphics();
				Graphics2D bg = combinedImage.createGraphics();
				Graphics2D sprite = combinedImage.createGraphics();
				Graphics2D fg = combinedImage.createGraphics();
				Graphics2D effect = combinedImage.createGraphics();

				darkBG.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
					darkBG.drawImage(darken, 0, 0, windowWidth, windowHeight, null);
				bg.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.bgValue));
					bg.drawImage(bgLoaded, 0, 0, windowWidth, windowHeight, null);
				sprite.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.spriteValue));
					sprite.drawImage(spriteLoaded, alignSpriteX, alignSpriteY, spriteWidth, spriteHeight, null);
				fg.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.fgValue));
					fg.drawImage(spriteLoaded, 0, 0, windowWidth, windowHeight, null);
				effect.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.fgValue));
					effect.drawImage(effectLoaded, 0, 0, windowWidth, windowHeight, null);		

				darkBG.dispose();
				bg.dispose();
				sprite.dispose();
				fg.dispose();
				effect.dispose();
				
				image.setIcon(new ImageIcon(combinedImage));
				UserInterface.gameWindow.add(image);
			}
			catch(IOException e) {
			}
       	}
}
