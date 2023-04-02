package mainPackage;

import scenes.introScene;
import scenes.sceneOnePartOne;
import scenes.sceneOnePartTwo;
import scenes.sceneOnePartEnd;
import scenes.sceneTwoPartOne;
import scenes.sceneTwoPartTwo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

import javax.swing.Timer;
import javax.swing.event.MenuKeyEvent;
//import javax.swing.event.MenuKeyListener;
import javax.swing.event.MouseInputListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import mainPackage.storyLines.dialogues;
import mainPackage.storyLines.questions;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class Game implements java.io.Serializable{

	Dimension gameWindowSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int)gameWindowSize.getWidth();
		int screenHeight = (int)gameWindowSize.getHeight();
		
	public Font narrationFont = new Font("Times New Roman", Font.ITALIC, 29), normalFont = new Font ("Yu Gothic UI", Font.PLAIN, 29),
			hyperboleFont = new Font ("Papyrus", Font.BOLD, 40);

	//Game Mechanics/Essentials
	UserInterface ui = new UserInterface();
	soundManager sm = new soundManager();
	storyLines lines = new storyLines();
	TransitionClass tc = new TransitionClass(this, ui);
	playerStats player = new playerStats(ui, this, tc);
	ImageManager imgManage = new ImageManager(this, screenWidth, screenHeight);
	CutsceneManager csmanager = new CutsceneManager(this, ui, tc, sm, player, lines, imgManage, screenWidth, screenHeight);
		
	//Scene Management
		introScene intro = new introScene(this, ui, tc, sm, player, lines, imgManage, screenWidth, screenHeight, csmanager);
		
		sceneOnePartOne homeOne = new sceneOnePartOne(this, ui, tc, sm, player, lines, imgManage, screenWidth, screenHeight, csmanager);
		sceneOnePartTwo homeTwo = new sceneOnePartTwo(this, ui, tc, sm, player, lines, imgManage, screenWidth, screenHeight, csmanager);
		sceneOnePartEnd homeEnd = new sceneOnePartEnd(this, ui, tc, sm, player, lines, imgManage, screenWidth, screenHeight, csmanager);
		sceneTwoPartOne walkOne = new sceneTwoPartOne(this, ui, tc, sm, player, lines, imgManage, screenWidth, screenHeight, csmanager);
		sceneTwoPartTwo walkTwo = new sceneTwoPartTwo(this, ui, tc, sm, player, lines, imgManage, screenWidth, screenHeight, csmanager);
		
	gameStory Story = new gameStory(this, ui, tc, sm, player, imgManage, intro, 
									homeOne, homeTwo, homeEnd, walkOne, walkTwo);
	
	//Input Handlers
	ChoiceHandler cHandler = new ChoiceHandler();
	MouseHandler mHandler = new MouseHandler();
	KeyboardHandler kbHandler = new KeyboardHandler();
	NameHandler nHandler = new NameHandler();
	AnswerHandler aHandler = new AnswerHandler();

	//Save-Load Button (VERY IMPORTANT)
	SaveLoadHandler saveloadHandler = new SaveLoadHandler();
	
		int click = 0, i = 1;
	
	public String currentDialogue, currentQuestion, nextDialogue, input, nextPosition1, nextPosition2, nextPosition3, nextPosition4;
	public static String playerName, gender, gender1, gender2, gender3, SOName, SOSprite, selected; 
	public static String playerAnswer;
	public static int numberAnswer = 0;

	public int diatextTracker = 0, questiontextTracker = 0;
	public static int enableKeys = 0;
	public int letterTracker = 0;
	public int arrayNumber;
	public static int normalSpeed = 30;
	public static int fastSpeed = 5;

	public char DiaGen[], choiceGen[], nameGen[], levelUp[];
	
	public Timer DiaTimer, choiceTimer, calculateTimer, levelUpTimer;

	public static void main(String[] args) {
		new Game();
	}
	
	public Game() {
		ui.makeUI(cHandler, mHandler, nHandler, kbHandler, saveloadHandler, aHandler, screenWidth, screenHeight, lines, this);
		 	sm.bgsMusic.setFile(sm.titleScreenMusic);
				sm.bgsMusic.playMusic();
				sm.bgsMusic.loopMusic();
				//tc.introSequence();
				//gameStory.pauseTime = 19000;
				//gameStory.pause();
		tc.showTitleScreen();
	}
	
	public class ChoiceHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
				
			String theChoice = event.getActionCommand();
			sm.se.setFile(sm.buttonsfx);
			sm.se.playButtonSFX(); // STANDARD BUTTON NOISE
			
				switch(theChoice) {
					case "start":
						textGeneration();
						ui.bgPanel.remove(ui.bgPic);
						tc.showDialogue();
						intro.intro0Game();
						//homeOne.explanation1();
						//walkOne.crushBusStopEventApproach();
						Story.startStats();
						System.out.println("GAME HAS NOW STARTED");
						sm.bgsMusic.stopMusic();
							sm.bgsMusic.ingameBGMusicSet(sm.InGameBGMusic);
							sm.bgsMusic.playInGameMusic();

						//tc.showName();
						break;
					case "restart":
					case "continue":
						textGeneration();
						ui.bgPanel.remove(ui.bgPic);
						sm.bgsMusic.stopMusic();
						tc.showDialogue();
						loadAction();
						sm.bgsMusic.ingameBGMusicSet(sm.InGameBGMusic);
						sm.bgsMusic.playInGameMusic();
						break;
					case "quit":
						tc.showTitleScreen();
						sm.bgsMusic.setFile(sm.titleScreenMusic);
						sm.bgsMusic.playMusic();
						sm.bgsMusic.loopMusic();
						break;
						
					case "dialogue":
						sm.se.setFile(sm.buttonsfx);
						sm.se.playButtonSFX();
						Story.dialogueTracker(nextDialogue);
						break;

					case "openSettings":
						ui.settingsMenu.show(UserInterface.gameWindow, ui.alignSetMenuX, ui.alignSetMenuY);
						break;
							case "exit":
								WindowEvent closeWindow = new WindowEvent(UserInterface.gameWindow, WindowEvent.WINDOW_CLOSING);
								Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
								break;

					case "male":
						selected = "HE";
						gender = "She"; 
						gender1 = "she"; 
						gender2 = "hers"; 
						gender3 = "her"; 
						SOName = "Athena Phenyl";
						SOSprite = "SOSpriteFemale.png";
						Story.dialogueTracker(nextDialogue);
						saveAction();
						break;
					case "female":
						selected = "SHE";
						gender = "He"; 
						gender1 = "he"; 
						gender2 = "his"; 
						gender3 = "him";
						SOName = "Lucius Noble";
						SOSprite = "SOSpriteMale.png";
						Story.dialogueTracker(nextDialogue);
						saveAction();
						break;					
					case "inclusive":
						selected = "THEY";
						gender = "They"; 
						gender1 = "they"; 
						gender2 = "theirs"; 
						gender3 = "them";
						SOName = "Zephyr Xen";
						int decider = (int)((Math.random()*100)+1);
							if(decider < 51){
								SOSprite = "SOSpriteFemale.png";
							}	
							else{
								SOSprite = "SOSpriteMale.png";
							}
						Story.dialogueTracker(nextDialogue);
						saveAction();
						break;

					//closeMenu saveNotes
					case "openNotes":
						tc.showNotes(); loadNotes(); break;
					case "closeNotes":
						tc.closeNotes(); break;
					case "saveNotes":
						saveNotes(); break;

					case "closeLvlUp":
						ui.LevelUpTextPanel.setVisible(false); break;
						
					case "c1":
						Story.progressTracker(nextPosition1); break;
					case "c2":
						Story.progressTracker(nextPosition2); break;
					case "c3":
						Story.progressTracker(nextPosition3); break;
					case "c4":
						Story.progressTracker(nextPosition4); break;	
			}
		}
	}

	public void textGeneration() {
		StyledDocument doc = ui.mainTextArea.getStyledDocument();

		SimpleAttributeSet questionText = new SimpleAttributeSet();
		StyleConstants.setForeground(questionText, Color.ORANGE);

		//DIALOGUE GENERATION
		DiaTimer = new Timer(normalSpeed, new ActionListener(){
			public void actionPerformed(ActionEvent ie) {
				enableKeys = 0;
				ui.dialoguePanel.setVisible(false);
				DiaGen = dialogues.diaText[diatextTracker].toCharArray();
				arrayNumber = DiaGen.length;
				
					if((letterTracker%3) == 0){
						sm.se.setFile1(sm.typesfx);
						sm.se.playTypeSFX();
					}
					
				String letterGen = ""; String space = "";
				letterGen = space + DiaGen[letterTracker]; 
				try {
					doc.insertString(doc.getLength(), letterGen, null);
				} catch (BadLocationException e) {
					e.printStackTrace();
				}
				
				letterTracker++;
				if(letterTracker == arrayNumber) {
					letterTracker = 0;
					DiaTimer.stop();
					diatextTracker++;
					ui.dialoguePanel.setVisible(true);
					ui.dialogueBox.setText(">");
					enableKeys = 1;
				}
			}
		});

		//CHOICE MOMENT ANIMATION
		choiceTimer = new Timer(normalSpeed, new ActionListener(){
			public void actionPerformed(ActionEvent c) {
				ui.dialoguePanel.setVisible(false);
				choiceGen = questions.questionText[questiontextTracker].toCharArray();
				arrayNumber = choiceGen.length;
				enableKeys = 0;
				
					if((letterTracker%2) == 0){
						sm.se.setFile1(sm.typesfx);
						sm.se.playTypeSFX();
					}
					
				String letterGen = ""; String space = "";
				letterGen = space + choiceGen[letterTracker]; 
				try {
					doc.insertString(doc.getLength(), letterGen, questionText);
				} catch (BadLocationException e) {
					e.printStackTrace();
				}
				
				letterTracker++;
				if(letterTracker == arrayNumber) {
					letterTracker = 0;
					choiceTimer.stop();
					questiontextTracker++;
					tc.showChoices();
				}
			}
		});

		//CALCULATION MOMENT ANIMATION
		calculateTimer = new Timer(normalSpeed, new ActionListener(){
			public void actionPerformed(ActionEvent cal) {
				ui.dialoguePanel.setVisible(false);
				choiceGen = questions.questionText[questiontextTracker].toCharArray();
				arrayNumber = choiceGen.length;
				enableKeys = 0;

				StyledDocument doc = ui.mainTextArea.getStyledDocument();
				
					if((letterTracker%2) == 0){
						sm.se.setFile1(sm.typesfx);
						sm.se.playTypeSFX();
					}
					
				String letterGen = ""; String space = "";
				letterGen = space + choiceGen[letterTracker]; 
				try {
					doc.insertString(doc.getLength(), letterGen, questionText);
				} catch (BadLocationException e) {
					e.printStackTrace();
				}
				
				letterTracker++;
				if(letterTracker == arrayNumber) {
					letterTracker = 0;
					calculateTimer.stop();
					questiontextTracker++;
					tc.inputAnswer();
				}
			}
		});
	}
	
	public void startDialogue(){
		Story.number++;
		gameStory.increaseCP = 0; gameStory.decreaseCP = 0;
		ui.mainTextArea.setText("");
		DiaTimer.start();
		enableKeys = 0;
		System.out.println("DIALOGUE SUCCESS: " + Story.number);
		if(tc.choicePanelRecognizer >=1 && tc.choicePanelRecognizer >= 0){
			tc.choicePanelRecognizer--;
		}
		else{
			tc.choicePanelRecognizer = 0;
		}
	}
	
	public class MouseHandler implements MouseInputListener{
		@Override
		public void mouseClicked(MouseEvent e) {	
		}
		@Override
		public void mousePressed(MouseEvent e) {
			DiaTimer.setDelay(fastSpeed);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			DiaTimer.setDelay(normalSpeed);
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
						gameStory.name = playerName;
						Story.dialogueTracker(nextDialogue);
						saveAction();
			}
		}
	}
	public class AnswerHandler implements ActionListener{
		public void actionPerformed(ActionEvent AnswerInput) {
			if(AnswerInput.getSource() == ui.submitInputBTN) {
				sm.se.setFile(sm.buttonsfx);
				sm.se.playButtonSFX(); // STANDARD BUTTON NOISE
						playerAnswer = ui.answerInput.getText();
						gameStory.playerAnswerInput = playerAnswer.trim();
						System.out.println("\nPlayer Answer is: " + gameStory.playerAnswerInput);
						Story.dialogueTracker(nextDialogue);
						ui.answerInput.setText("");
						playerAnswer = "";
				}
			} 
	}
	
	public class KeyboardHandler implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
		}
		@Override
		public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_SPACE) {
					DiaTimer.setDelay(fastSpeed);
				}
				if(enableKeys == 1) {
					if(e.getKeyCode() == 'z' || e.getKeyCode() == 'Z') {
						click++;
						sm.se.setFile(sm.buttonsfx);
						sm.se.playButtonSFX();
						DiaTimer.stop();
						ui.mainTextArea.setText("");
						Story.dialogueTracker(nextDialogue);
				}
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			if(e.getKeyCode()==MenuKeyEvent.VK_SPACE) {
				DiaTimer.setDelay(normalSpeed);
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
			dStorage.selectedGender = selected;

			dStorage.crushGender = gender;
			dStorage.crushGender1 = gender1;
			dStorage.crushGender2 = gender2;
			dStorage.crushGender3 = gender3;

			dStorage.playerCP = playerStats.CP;
			dStorage.playerXP = playerStats.XP;
			dStorage.playermaxCP = playerStats.maxCP;
			dStorage.playerLevel = playerStats.level;

			dStorage.playerNeededXP = playerStats.neededXP;

			dStorage.dialogueTracker = diatextTracker;
			dStorage.playerDialogue = currentDialogue;
			dStorage.nextStoryDialogue = nextDialogue;

			dStorage.questionTracker = questiontextTracker;
			dStorage.playerQuestion = currentQuestion;

			oos.writeObject(dStorage);
			oos.close();
			System.out.println();
			System.out.println("SAVE COMPLETE:");
			System.out.println("Player Name: " + dStorage.playerName);
			System.out.println("CP: " + dStorage.playerCP + " | " + "MAX CP: " + dStorage.playermaxCP + " | " + 
								"XP: " + dStorage.playerXP + " | " + "GENDER: " + dStorage.selectedGender + " | " +
								" | " + "SO Gender: " + dStorage.crushGender + "/" + dStorage.crushGender1 + "/" +
								dStorage.crushGender2 + "/" + dStorage.crushGender3 + " | " +
								"CURRENT LEVEL: " + dStorage.playerLevel);
			System.out.println("Current Position: " + dStorage.playerDialogue + " | " 
								+ "Dialogue Tracker Number: " + dStorage.dialogueTracker + " | "
								+ "Next Position: " + dStorage.nextStoryDialogue);
			System.out.println();
		}
		catch(Exception saveError){
			System.out.println("SAVE ERROR");
		}
	}
	public void saveNotes(){
		try{
			FileWriter fw = new FileWriter("PlayerNotes.txt");
			fw.write(ui.notesTextArea.getText());
			fw.close();
		}
		catch(IOException notesSaveError){
			System.out.println("CANNOT SAVE NOTES");
		}
	}
	public void loadAction(){
		try{
			FileInputStream fis = new FileInputStream("save.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);

			DataStorage dStorage = (DataStorage)ois.readObject();

			playerName = dStorage.playerName;
			
			selected = dStorage.selectedGender;

			gender = dStorage.crushGender;
			gender1 = dStorage.crushGender1;
			gender2 = dStorage.crushGender2;
			gender3 = dStorage.crushGender3;

			playerStats.CP = dStorage.playerCP;
			playerStats.XP = dStorage.playerXP;
			playerStats.maxCP = dStorage.playermaxCP;
			playerStats.level = dStorage.playerLevel;

			playerStats.neededXP = dStorage.playerNeededXP;

			diatextTracker = dStorage.dialogueTracker;
			currentDialogue = dStorage.playerDialogue;
			nextDialogue = dStorage.nextStoryDialogue;

			questiontextTracker = dStorage.questionTracker;
			currentQuestion = dStorage.playerQuestion;

			ois.close();
			System.out.println();
			System.out.println("LOAD COMPLETE:");
			System.out.println("Player Name: " + playerName);
			System.out.println("CP: " + playerStats.CP + " | " + "MAX CP: " + playerStats.maxCP + " | " + 
								"XP: " + playerStats.XP + " | " + "GENDER: " + selected + " | " +
								" | " + "SO Gender: " + gender + "/" + gender1 + "/" + gender2 + "/" +
								gender3 + " | " +
								"CURRENT LEVEL: " + playerStats.level);
			System.out.println("Current Position: " + currentDialogue + " | " 
								+ "Dialogue Tracker Number: " + diatextTracker 
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
	public void loadNotes(){
		try{
			BufferedReader br = new BufferedReader(new FileReader("PlayerNotes.txt"));
			ui.notesTextArea.setText("");
			String line = null;

			while((line = br.readLine())!=null){
				ui.notesTextArea.append(line + "\n");
			}
		}
		catch(IOException notesLoadError){
			System.out.println("LOAD NOTES ERROR: NO NOTES");
		}
	}
	
	public void update(){
		gameStory.name = playerName;
		UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "/" + playerStats.neededXP + "<center><html>");
		UserInterface.ChancePointsNumberLabel.setText("<html><center>" + playerStats.CP + "/" + playerStats.maxCP + "<center><html>");
		Story.dialogueTracker(currentDialogue);
	}
}
