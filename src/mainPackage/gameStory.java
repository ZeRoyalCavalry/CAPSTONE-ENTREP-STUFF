package mainPackage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

import mainPackage.storyLines.dialogues;
import mainPackage.storyLines.questions;

import java.io.*;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class gameStory{
	
	Game game;
	UserInterface ui;
	TransitionClass sceneChanger;
	soundManager sm;
	storyLines lines;
	
	Font narrationFont = new Font("Times New Roman", Font.ITALIC, 35);
	Font normalFont = new Font ("Calibri", Font.PLAIN, 35);
	Font hyperboleFont = new Font ("Papyrus", Font.BOLD, 45);
	
		int diatextTracker = 0;
		int choicetextTracker = 0;
		int letterTracker = 0;
		int arrayNumber;
		int pauseTime = 0;
		int normalSpeed = 40;
		int fastSpeed = 10;
		char DiaGen[], choiceGen[], nameGen[];
		String name;
		
		JLabel bgHolder = new JLabel();
			ImageIcon bedroomView = new ImageIcon(getClass().getClassLoader().getResource("temp2.png"));
			ImageIcon cityView = new ImageIcon(getClass().getClassLoader().getResource("temp3.jpg"));
			ImageIcon bayRouteView = new ImageIcon(getClass().getClassLoader().getResource("temp4.png"));

	public gameStory(Game g, UserInterface UI, TransitionClass sc, soundManager SM) {
		
		game = g; ui = UI; sceneChanger = sc; sm = SM;
	}
	
	public void pause() {
		try {
			Thread.sleep(pauseTime);
		}
		catch(Exception e) {
			
		}
	}
	
	//INTRO GENERATION
	Timer DiaTimer = new Timer(normalSpeed, new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent ie) {
			ui.dialoguePanel.setVisible(false);
			DiaGen = dialogues.diaText[diatextTracker].toCharArray();
			arrayNumber = DiaGen.length;
			
				if((letterTracker%3) == 0){
					sm.se.setFile1(sm.typesfx);
					sm.se.playTypeSFX();
				}
				
			String letterGen = "";
			String space = "";
		
			letterGen = space + DiaGen[letterTracker]; 
			ui.mainTextArea.append(letterGen);
			
			letterTracker++;
			if(letterTracker == arrayNumber) {
				letterTracker = 0;
				DiaTimer.stop();
				diatextTracker++;
				ui.dialoguePanel.setVisible(true);
			}
		}
	});

	//DECISION MOMENT ANIMATION
	Timer choiceTimer = new Timer(normalSpeed, new ActionListener(){
		public void actionPerformed(ActionEvent c) {
			ui.dialoguePanel.setVisible(false);
			choiceGen = questions.choiceText[choicetextTracker].toCharArray();
			arrayNumber = choiceGen.length;
			
				if((letterTracker%2) == 0){
					sm.se.setFile1(sm.typesfx);
					sm.se.playTypeSFX();
				}
				
			String letterGen = "";
			String space = "";
			
			letterGen = space + choiceGen[letterTracker]; 
			ui.mainTextArea.append(letterGen);
			
			letterTracker++;
			if(letterTracker == arrayNumber) {
				letterTracker = 0;
				choiceTimer.stop();
				choicetextTracker++;
				sceneChanger.showChoices();
			}
		}
	});
	//For simple dialogue moments
	
	public void dialogueTracker(String nextDialogue) {
		switch(nextDialogue){
		case "intro0": intro0Game(); break; 
		case "intro1": sceneChanger.showDialogue(); intro1Game(); break;
		case "intro2": intro2Game(); break;
		case "intro3": intro3Game(); break;
		case "intro4": intro4Game(); break;
		case "intro5": intro5Game(); break;
		case "intro6": intro6Game(); break;
		case "introEnd": amBedroom(); break;
			
			case "gbedroomExit12": goodbedroomExit12(); break;
			case "gbedroomExit13": goodbedroomExit13(); break;
			case "gbedroomExit14": goodbedroomExit14(); break;
		
			case "scolding11": scolding11(); break;
				case "bbedroomExit12": badbedroomExit12(); break;
				case "bbedroomExit13": badbedroomExit13(); break;
				case "bbedroomExit14": badbedroomExit14(); break;  
					case "sidefirstQuestion": sidefirstQuestion(); break;
				
		case "firstQuestion": firstQuestion(); break;
			
		default: intro0Game();
		}
	}
	
	//For choice making moments
	public void progressTracker(String nextMove) {
		switch(nextMove) {
			case "bedroomExit11": bedroomExit11(); sceneChanger.showDialogue(); break;
			case "bedroomStudy11": bedroomStudy11(); sceneChanger.showDialogue(); break;		
			case "bedroomSS11": bedroomSS11(); sceneChanger.showDialogue(); ui.bgPanel.setVisible(true); bgHolder.setIcon(cityView); break;		
			case "bedroomSleep11": bedroomSleep11(); sceneChanger.showDialogue(); break;	
				
			case "correct1": break;
			case "incorrect1": break;
		}
	}
	//Mostly Dialogue
	public void intro0Game() {//Get name
		ui.mainTextArea.setFont(normalFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(null);
		DiaTimer.start();
			game.nextDialogue = "intro1";
	}
	public void intro1Game(){//A world a new
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		DiaTimer.start();
		ui.dialogueBox.setText(">");
		nameGen = name.toCharArray();
				game.nextDialogue = "intro2";
	}
	public void intro2Game() {//Birds chirping...
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
			sm.se.setFile2(sm.birdsfx); 
			sm.se.playBirdSFX(); 
		DiaTimer.start();
			game.nextDialogue = "intro3";
	}
	public void intro3Game() {//Different...
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		DiaTimer.start();
			game.nextDialogue = "intro4";
	}
	public void intro4Game() {//Bedroom
		ui.bgPanel.setVisible(true);
			ui.bgPanel.remove(ui.bgPic);
				ui.bgPanel.add(bgHolder);
				bgHolder.setIcon(bedroomView);
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");	
		DiaTimer.start();
			game.nextDialogue = "intro5";
	}
	public void intro5Game() {//A new day...
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		DiaTimer.start();
			game.nextDialogue = "intro6";
	}
	public void intro6Game() {//City view
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
			ui.bgPanel.setVisible(false);
			sm.se.setFile3(sm.curtainsfx);
			sm.se.curtainSFX.start();
			
				pauseTime = 3000;
				pause();
				ui.bgPanel.setVisible(true);
				bgHolder.setIcon(cityView);
				
		DiaTimer.start();
			game.nextDialogue = "introEnd";	
	}

	//First choice of the game or First Scene Transition
	public void amBedroom() {
		ui.choicePanel.setVisible(true);
			bgHolder.setIcon(bedroomView);
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(null);
		choiceTimer.start();
		ui.dialoguePanel.setVisible(false);
			ui.choice1.setText("Exit the room");
			ui.choice2.setText("Study");
			ui.choice3.setText("Continue sightseeing");
			ui.choice4.setText("Go back to bed");
			
			game.nextPosition1 = "bedroomExit11";
			game.nextPosition2 = "bedroomStudy11";
			game.nextPosition3 = "bedroomSS11";
			game.nextPosition4 = "bedroomSleep11";
	}
	//Second Scene Transition
	public void bedroomExit11() {
		diatextTracker = 7;
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(">");
		DiaTimer.start();
			game.nextDialogue = "gbedroomExit12";
	}
	public void bedroomStudy11() {
		diatextTracker = 8;
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(">");
		DiaTimer.start();
			game.nextDialogue = "gbedroomExit12";
	}
	public void bedroomSS11() {
		diatextTracker = 9;
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(">");
		DiaTimer.start();
			game.nextDialogue = "scolding11";
	}
	public void bedroomSleep11() {
		diatextTracker = 10;
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(">");
		DiaTimer.start();
			game.nextDialogue = "scolding11";
	}

	
	public void goodbedroomExit12() {
		ui.bgPanel.setVisible(false);
		try {
			diatextTracker = 11;
			Thread.sleep(1500);
			ui.mainTextArea.setFont(normalFont);
			ui.mainTextArea.setText("");
			DiaTimer.start();	
				ui.mainTextArea.append(name + "!");
				game.nextDialogue = "gbedroomExit13";
		}
		catch(Exception e) {
			ui.mainTextArea.setText("Uh-oh, something went wrong!");
			intro0Game();
		}
	}
	public void goodbedroomExit13() {
		try {
			Thread.sleep(750);
			ui.mainTextArea.setFont(normalFont);
			ui.mainTextArea.setText("");
			DiaTimer.start();
				game.nextDialogue = "gbedroomExit14";
		}
		catch(Exception e) {
			ui.mainTextArea.setText("Uh-oh, something went wrong!");
			intro0Game();
		}
	}
	public void goodbedroomExit14() {
		diatextTracker = 16;
		ui.mainTextArea.setFont(normalFont);
		ui.mainTextArea.setText("");
		DiaTimer.start();
			game.nextDialogue = "firstQuestion";
	}
	
	
	public void scolding11() {
		diatextTracker = 13;
		ui.mainTextArea.setText("");
			pauseTime = 8000;
			this.pause();
		DiaTimer.setDelay(20);
			ui.mainTextArea.setFont(hyperboleFont);
			ui.mainTextArea.setText("");
			DiaTimer.start();
				game.nextDialogue = "bbedroomExit12";
	}
	public void badbedroomExit12() {
		ui.bgPanel.setVisible(false);
		DiaTimer.setDelay(60);
		ui.mainTextArea.setFont(normalFont);
		ui.mainTextArea.setText("");
		DiaTimer.start();
		ui.dialogueBox.setText(">");
			game.nextDialogue = "bbedroomExit13";
	}
	public void badbedroomExit13() {
		ui.mainTextArea.setFont(normalFont);
		ui.mainTextArea.setText("");
		DiaTimer.start();
		ui.dialogueBox.setText(">");
			game.nextDialogue = "bbedroomExit14";
	}
	public void badbedroomExit14() {
		ui.mainTextArea.setFont(normalFont);
		ui.mainTextArea.setText("");
		DiaTimer.start();
		ui.dialogueBox.setText(">");
			game.nextDialogue = "sidefirstQuestion";
	}

	
	public void sidefirstQuestion() {
		ui.dialoguePanel.setVisible(false);
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(null);
		choiceTimer.start();
			ui.choice1.setText("Happiness");
			ui.choice2.setText("Pleasure");
			ui.choice3.setText("Sleepiness");
			ui.choice4.setText("Aggressiveness");
			
			game.nextPosition1 = "incorrect0";
			game.nextPosition2 = "incorrect0";
			game.nextPosition3 = "correct0";
			game.nextPosition4 = "incorrect0";
	}
	
	public void Happiness() {
		
	}
	public void Pleasure() {
		
	}
	public void Sleepiness() {
		
	}
	public void Aggressiveness() {
		
	}
	
	//First Question but second choice
	public void firstQuestion() {
		choicetextTracker = 2;
		ui.dialoguePanel.setVisible(false);
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(null);
		choiceTimer.start();
			ui.choice1.setText("Toothpaste");
			ui.choice2.setText("Liquid Soap");
			ui.choice3.setText("Bar Soap");
			ui.choice4.setText("Shampoo");
			
			game.nextPosition1 = "correct1";
			game.nextPosition2 = "incorrect1";
			game.nextPosition3 = "incorrect1";
			game.nextPosition4 = "incorrect1";
	}
}

