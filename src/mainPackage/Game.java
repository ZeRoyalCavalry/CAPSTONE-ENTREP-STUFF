package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

import javax.swing.event.MenuKeyEvent;
//import javax.swing.event.MenuKeyListener;
import javax.swing.event.MouseInputListener;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Game implements java.io.Serializable{

	Dimension gameWindowSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int)gameWindowSize.getWidth();
		int screenHeight = (int)gameWindowSize.getHeight();

	UserInterface ui = new UserInterface();
	soundManager sm = new soundManager();
	storyLines lines = new storyLines();
	playerStats player = new playerStats();
	TransitionClass tc = new TransitionClass(ui);
	ImageManager imgManage = new ImageManager(this, screenWidth, screenHeight);
	gameStory Story = new gameStory(this, ui, tc, sm, player, imgManage);

	ChoiceHandler cHandler = new ChoiceHandler();
	MouseHandler mHandler = new MouseHandler();
	KeyboardHandler kbHandler = new KeyboardHandler();
	NameHandler nHandler = new NameHandler();

	SaveLoadHandler saveloadHandler = new SaveLoadHandler();
		
		int mouseClick = 0;
	
	String currentDialogue, currentQuestion, nextDialogue, nextPosition1, nextPosition2, nextPosition3, nextPosition4;
	static String playerName, gender; 

	public static void main(String[] args) {
		new Game();
	}
	
	public Game() {
		ui.makeUI(cHandler, mHandler, nHandler, kbHandler, saveloadHandler, screenWidth, screenHeight, lines, this);
			sm.bgsMusic.setFile(sm.titleScreenMusic);
			sm.bgsMusic.playMusic();
			sm.bgsMusic.loopMusic();
				//tc.introSequence();
				//Story.pauseTime = 19000;
				//Story.pause();
				Story.startStats();
		tc.showTitleScreen();
	}
	
	public class ChoiceHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
				
			String theChoice = event.getActionCommand();
			sm.se.setFile(sm.buttonsfx);
			sm.se.playButtonSFX(); // STANDARD BUTTON NOISE
			
				switch(theChoice) {
					case "start":
						ui.bgPanel.remove(ui.bgPic);
						tc.showDialogue();
						Story.intro0Game();
						tc.showName();
						sm.bgsMusic.stopMusic();
						saveAction();
						break;
					case "continue":
						ui.bgPanel.remove(ui.bgPic);
						sm.bgsMusic.stopMusic();
						tc.showDialogue();
						loadAction();
						break;
					case "dialogue":
						sm.se.setFile(sm.buttonsfx);
						sm.se.playButtonSFX();
						Story.dialogueTracker(nextDialogue);
						break;
					case "male":
						gender = "she";
						storyLines.subInGender = gender;
						Story.dialogueTracker(nextDialogue);
						break;
					case "female":
						gender = "he";
						storyLines.subInGender = gender;
						Story.dialogueTracker(nextDialogue);
						break;					
					case "inclusive":
						gender = "they";
						storyLines.subInGender = gender;
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
			Story.DiaTimer.setDelay(Story.fastSpeed);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			Story.DiaTimer.setDelay(Story.normalSpeed);
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
						saveAction();
					}
					else {
						Story.diatextTracker = 0;
						tc.showName();
						Story.intro0Game();
					}
			}
		}
	}
	
	public class KeyboardHandler implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
		}
		@Override
		public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==MenuKeyEvent.VK_SPACE) {
					Story.DiaTimer.setDelay(Story.fastSpeed);
				}
			if(Story.enableKeys == 1) {
				if(e.getKeyCode() == 'z' || e.getKeyCode() == 'Z') {
					ui.mainTextArea.setText("");
					sm.se.setFile(sm.buttonsfx);
					sm.se.playButtonSFX();
					Story.dialogueTracker(nextDialogue);
				}
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			if(e.getKeyCode()==MenuKeyEvent.VK_SPACE) {
				Story.DiaTimer.setDelay(Story.normalSpeed);
			}			
		}

	}

	public class SaveLoadHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent SaveOrLoad) {
			String loadSLMenu = SaveOrLoad.getActionCommand();
			sm.se.setFile(sm.buttonsfx);
			sm.se.playButtonSFX();

				switch(loadSLMenu){
					case "save":
						saveAction();
						break;
					case "load":
						loadAction();
						break;
				}	
		}
	}
	public void saveAction(){
		try{
			FileOutputStream fos = new FileOutputStream("save.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);

			DataStorage dStorage = new DataStorage();

			dStorage.playerName = playerName;

			dStorage.playerCP = player.CP;
			dStorage.playerXP = player.XP;
			dStorage.playermaxCP = player.maxCP;

			dStorage.dialogueTracker = Story.diatextTracker;
			dStorage.playerDialogue = currentDialogue;
			dStorage.nextStoryDialogue = nextDialogue;

			dStorage.questionTracker = Story.questiontextTracker;
			//dStorage.playerQuestion = currentQuestion;

			oos.writeObject(dStorage);
			oos.close();
			System.out.println();
			System.out.println("SAVE COMPLETE:");
			System.out.println("Player Name: " + dStorage.playerName);
			System.out.println("CP: " + dStorage.playerCP + " | " + "XP: " + dStorage.playerXP + " | ");
			System.out.println("Current Position: " + dStorage.playerDialogue + " | " 
								+ "Dialogue Tracker Number: " + dStorage.dialogueTracker + " | "
								+ "Next Position: " + dStorage.nextStoryDialogue);
			System.out.println();
		}
		catch(Exception saveError){
			System.out.println("SAVE ERROR");
		}
	}
	public void loadAction(){
		try{
			FileInputStream fis = new FileInputStream("save.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);

			DataStorage dStorage = (DataStorage)ois.readObject();

			playerName = dStorage.playerName;

			player.CP = dStorage.playerCP;
			player.XP = dStorage.playerXP;
			player.maxCP = dStorage.playermaxCP;

			Story.diatextTracker = dStorage.dialogueTracker;
			currentDialogue = dStorage.playerDialogue;
			nextDialogue = dStorage.nextStoryDialogue;

			Story.questiontextTracker = dStorage.questionTracker;
			//currentQuestion = dStorage.playerQuestion;

			ois.close();
			System.out.println();
			System.out.println("LOAD COMPLETE:");
			System.out.println("Player Name: " + playerName);
			System.out.println("CP: " + player.CP + " | " + "XP: " + player.XP + " | ");
			System.out.println("Current Position: " + currentDialogue + " | " 
								+ "Dialogue Tracker Number: " + Story.diatextTracker 
								+ " | " + "Next Position: " + nextDialogue);
			System.out.println();
		
			update();

		}
		catch(IOException LoadError){
			System.out.println("LOAD ERROR");
		}
		catch(ClassNotFoundException missing){
			System.out.println("MISSING FILE");
		}
	}
	
	public void update(){
		Story.name = playerName;
		ui.XPNumberLabel.setText("<html><center>" + player.XP + "<center><html>");
		ui.ChancePointsNumberLabel.setText("<html><center>" + player.CP + "<center><html>");
		Story.dialogueTracker(currentDialogue);
		Story.progressTracker(currentQuestion);
	}
}
