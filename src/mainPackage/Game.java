package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Game {

	UserInterface ui = new UserInterface();
	soundManager sm = new soundManager();
	ChoiceHandler cHandler = new ChoiceHandler();
	MouseHandler mHandler = new MouseHandler();
	KeyboardHandler kbHandler = new KeyboardHandler();
	NameHandler nHandler = new NameHandler();
	TransitionClass tc = new TransitionClass(ui);
	gameStory Story = new gameStory(this, ui, tc, sm);
	
	Dimension gameWindowSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int)gameWindowSize.getWidth();
		int screenHeight = (int)gameWindowSize.getHeight();
		
		int mouseClick = 0;
		int normalSpeed = 60;
		int fastSpeed = 10;
	
	String nextDialogue, nextPosition1, nextPosition2, nextPosition3, nextPosition4, playerName; 

	public static void main(String[] args) {
		new Game();
	}
	
	public Game() {
		ui.makeUI(cHandler, mHandler, nHandler, kbHandler, screenWidth, screenHeight);
		tc.showTitleScreen();
		sm.bgsMusic.setFile(sm.titleScreenMusic);
		sm.bgsMusic.playMusic();
		sm.bgsMusic.loopMusic();
	}
	
	public class ChoiceHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
				
			String theChoice = event.getActionCommand();
			sm.se.setFile(sm.buttonsfx);
			sm.se.playButtonSFX(); // STANDARD BUTTON NOISE
			
				switch(theChoice) {
					case "start":
						tc.showDialogue();
						Story.intro0Game();
						tc.showName();
						sm.bgsMusic.stopMusic();
						break;
					case "dialogue":
						sm.se.setFile(sm.buttonsfx);
						sm.se.playButtonSFX();
						Story.dialogueTracker(nextDialogue);
						break;
					case "c1":
						Story.progressTracker(nextPosition1);
						break;
					case "c2":
						Story.progressTracker(nextPosition2);
						break;
					case "c3":
						Story.progressTracker(nextPosition3);
						break;
					case "c4":
						Story.progressTracker(nextPosition4);
						break;		
			}
		}
	}
	
	public class MouseHandler implements MouseInputListener{
		@Override
		public void mouseClicked(MouseEvent e) {	
		}
		@Override
		public void mousePressed(MouseEvent e) {
			Story.DiaTimer.setDelay(fastSpeed);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			Story.DiaTimer.setDelay(normalSpeed);
		}
		@Override
		public void mouseEntered(MouseEvent e) {
		}
		@Override
		public void mouseExited(MouseEvent e) {
		}
		@Override
		public void mouseDragged(MouseEvent e) {
		}
		@Override
		public void mouseMoved(MouseEvent e) {
		}
	}
	
	public class NameHandler implements ActionListener{
		public void actionPerformed(ActionEvent in) {
			if(in.getSource() == ui.nameInputBTN) {
				sm.se.setFile(sm.buttonsfx);
				sm.se.playButtonSFX(); // STANDARD BUTTON NOISE
					playerName = ui.nameInput.getText();
					if(playerName != null) {
						Story.name = playerName;
						Story.dialogueTracker(nextDialogue);
					}
					else {
						tc.showName();
						Story.intro0Game();
					}
			}
		}
	}
	
	public class KeyboardHandler implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==MenuKeyEvent.VK_SPACE) {
				Story.DiaTimer.setDelay(fastSpeed);
			}
			if(e.getKeyCode() == 'z' || e.getKeyCode() == 'Z') {
				sm.se.setFile(sm.buttonsfx);
				sm.se.playButtonSFX();
				Story.dialogueTracker(nextDialogue);
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			if(e.getKeyCode()==MenuKeyEvent.VK_SPACE) {
				Story.DiaTimer.setDelay(normalSpeed);
			}			
		}

	}
}
