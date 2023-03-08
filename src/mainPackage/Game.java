package mainPackage;

import scenes.introScene;
import scenes.sceneOnePartOne;
import scenes.sceneOnePartTwo;
import scenes.sceneOnePartEnd;

import scenes.sceneTwoPartOne;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

import javax.swing.Timer;
import javax.swing.event.MenuKeyEvent;
//import javax.swing.event.MenuKeyListener;
import javax.swing.event.MouseInputListener;

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
	playerStats player = new playerStats(ui, this);
	TransitionClass tc = new TransitionClass(ui);
	ImageManager imgManage = new ImageManager(this, screenWidth, screenHeight);
		
	//Scene Management
		introScene intro = new introScene(this, ui, tc, sm, player, lines, imgManage, screenWidth, screenHeight);
		
		sceneOnePartOne homeOne = new sceneOnePartOne(this, ui, tc, sm, player, lines, imgManage, screenWidth, screenHeight);
		sceneOnePartTwo homeTwo = new sceneOnePartTwo(this, ui, tc, sm, player, lines, imgManage, screenWidth, screenHeight);
		sceneOnePartEnd homeEnd = new sceneOnePartEnd(this, ui, tc, sm, player, lines, imgManage, screenWidth, screenHeight);
		
	gameStory Story = new gameStory(this, ui, tc, sm, player, imgManage, intro, 
									homeOne, homeTwo, homeEnd);
	
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
	public static String playerName, gender, selected; 
	public static String[] playerAnswer = new String[100];
	public static int numberAnswer = 0;

	public int diatextTracker = 0, questiontextTracker = 0;
	public static int enableKeys = 0;
	public int letterTracker = 0;
	public int arrayNumber;
	public int normalSpeed = 30;
	public int fastSpeed = 5;

	public char DiaGen[], choiceGen[], nameGen[], levelUp[];
	
	public Timer DiaTimer, choiceTimer, calculateTimer, levelUpTimer;

	public static void main(String[] args) {
		new Game();
	}
	
	public Game() {
		ui.makeUI(cHandler, mHandler, nHandler, kbHandler, saveloadHandler, aHandler, screenWidth, screenHeight, lines, this);
		 	//sm.bgsMusic.setFile(sm.titleScreenMusic);
		//sm.bgsMusic.playMusic();
		//sm.bgsMusic.loopMusic();
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
						Story.startStats();
						//Story.goodbedroomExit12();
						//sm.bgsMusic.stopMusic();
						tc.showName();
						saveAction();
						break;
					case "continue":
						textGeneration();
						ui.bgPanel.remove(ui.bgPic);
						//sm.bgsMusic.stopMusic();
						tc.showDialogue();
						loadAction();
						break;
						
					case "dialogue":
						sm.se.setFile(sm.buttonsfx);
						sm.se.playButtonSFX();
						Story.dialogueTracker(nextDialogue);
						break;
						
					case "male":
						selected = "HE";
						gender = "she";
						storyLines.subInGender = gender;
						Story.dialogueTracker(nextDialogue);
						saveAction();
						break;
					case "female":
						selected = "SHE";
						gender = "he";
						storyLines.subInGender = gender;
						Story.dialogueTracker(nextDialogue);
						saveAction();
						break;					
					case "inclusive":
						selected = "THEY";
						gender = "they";
						storyLines.subInGender = gender;
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
		//INTRO GENERATION
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
				ui.mainTextArea.append(letterGen);
				
				letterTracker++;
				if(letterTracker == arrayNumber) {
					letterTracker = 0;
					DiaTimer.stop();
					diatextTracker++;
					ui.dialoguePanel.setVisible(true);
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
				ui.mainTextArea.append(letterGen);
				
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
				
					if((letterTracker%2) == 0){
						sm.se.setFile1(sm.typesfx);
						sm.se.playTypeSFX();
					}
					
				String letterGen = ""; String space = "";
				
				letterGen = space + choiceGen[letterTracker]; 
				ui.mainTextArea.append(letterGen);
				
				letterTracker++;
				if(letterTracker == arrayNumber) {
					letterTracker = 0;
					calculateTimer.stop();
					questiontextTracker++;
					tc.inputAnswer();
				}
			}
		});

		levelUpTimer = new Timer(normalSpeed, new ActionListener(){
			public void actionPerformed(ActionEvent cal) {
				ui.dialoguePanel.setVisible(false);
				String levelUpMessage = "YOU LEVELED UP!!!";
				levelUp = levelUpMessage.toCharArray();
				arrayNumber = levelUp.length;
				enableKeys = 0;
				
					if((letterTracker%2) == 0){
						sm.se.setFile1(sm.typesfx);
						sm.se.playTypeSFX();
					}
					
				String letterGen = ""; String space = "";
				
				letterGen = space + levelUp[letterTracker]; 
				ui.mainTextArea.append(letterGen);
				
				letterTracker++;
				if(letterTracker == arrayNumber) {
					letterTracker = 0;
					levelUpTimer.stop();
				}
			}
		});
	}
	
	public void startDialogue(){
		Story.number++;
		gameStory.increaseCP = 0; gameStory.decreaseCP = 0;
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(">");
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
					if(playerName == null) {
						Story.dialogueTracker("intro0");
						diatextTracker = 0;
						tc.showName();
						intro.intro0Game();
					}
					else {
						gameStory.name = playerName;
						Story.dialogueTracker(nextDialogue);
						saveAction();
					}
			}
		}
	}
	public class AnswerHandler implements ActionListener{
		public void actionPerformed(ActionEvent AnswerInput) {
			if(AnswerInput.getSource() == ui.submitInputBTN) {
				sm.se.setFile(sm.buttonsfx);
				sm.se.playButtonSFX(); // STANDARD BUTTON NOISE
						playerAnswer[i] = ui.answerInput.getText();
						gameStory.playerAnswerInput[i] = playerAnswer[i] + "";
						System.out.println("\nPlayer Answer is: " + gameStory.playerAnswerInput[i]);
						Story.dialogueTracker(nextDialogue);
						ui.answerInput.setText("");
						i++;
						playerAnswer[i] = "";
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

				if(e.getKeyCode() == KeyEvent.VK_F11){
					ui.device.setFullScreenWindow(UserInterface.gameWindow);
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

			dStorage.playerCP = playerStats.CP;
			dStorage.playerXP = playerStats.XP;
			dStorage.playermaxCP = playerStats.maxCP;

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
			System.out.println("CP: " + dStorage.playerCP + " | " + "XP: " + dStorage.playerXP + " | " + "GENDER: " + dStorage.selectedGender + " | ");
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
			playerStats.CP = dStorage.playerCP;
			playerStats.XP = dStorage.playerXP;
			playerStats.maxCP = dStorage.playermaxCP;

			diatextTracker = dStorage.dialogueTracker;
			currentDialogue = dStorage.playerDialogue;
			nextDialogue = dStorage.nextStoryDialogue;

			questiontextTracker = dStorage.questionTracker;
			currentQuestion = dStorage.playerQuestion;

			ois.close();
			System.out.println();
			System.out.println("LOAD COMPLETE:");
			System.out.println("Player Name: " + playerName);
			System.out.println("CP: " + playerStats.CP + " | " + "XP: " + playerStats.XP + " | " + "GENDER: " + selected + " | ");
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
			System.out.println("LOAD NOTES ERROR");
		}
	}
	
	public void update(){
		gameStory.name = playerName;
		UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");
		UserInterface.ChancePointsNumberLabel.setText("<html><center>" + playerStats.CP + "/" + playerStats.maxCP + "<center><html>");
		Story.dialogueTracker(currentDialogue);
	}
}
