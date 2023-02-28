package scenes;

import java.awt.Color;

import mainPackage.Game;
import mainPackage.Game.ChoiceHandler;
import mainPackage.Game.KeyboardHandler;
import mainPackage.Game.MouseHandler;
import mainPackage.Game.NameHandler;
import mainPackage.ImageManager;
import mainPackage.Screen;
import mainPackage.TransitionClass;
import mainPackage.UserInterface;
import mainPackage.fadeIn;
import mainPackage.gameStory;
import mainPackage.playerStats;
import mainPackage.soundManager;
import mainPackage.storyLines;

public class introScene {
	
	Game game; UserInterface ui;
	TransitionClass sceneChanger; soundManager sm;
	playerStats player; storyLines lines; ImageManager images;
	ChoiceHandler cHandler; MouseHandler mHandler; 
	KeyboardHandler kbHandler; NameHandler nHandler;
	
	public introScene(Game game, UserInterface ui, TransitionClass sceneChanger, soundManager sm,
						playerStats player, storyLines lines, ImageManager images, int screenWidth, int screenHeight)
	{
		this.game = game; this.ui = ui; this.sceneChanger = sceneChanger; this.sm = sm;
		this.player = player; this.lines = lines; this.images = images;
	}

	public void intro0Game() {//Get name
		sm.bgsMusic.stopMusic();
		ui.bgPanel.setBackground(Color.BLACK);
		game.currentDialogue = "intro0";
		game.diatextTracker = 0;
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
		ui.dialogueBox.setText(null);
			game.nextDialogue = "genderSelect";
	}
	public void genderSelect(){
		game.diatextTracker = 0;
		ui.bgPanel.setBackground(Color.BLACK);
		game.currentDialogue = "genderSelect";
		game.nextDialogue = "intro1";
	}
	public void intro1Game(){//A world a new
		ui.bgPanel.setBackground(Color.BLACK);
		game.currentDialogue = "intro1";
		game.diatextTracker = 1;
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
		game.nameGen = gameStory.name.toCharArray();
				game.nextDialogue = "intro2";
	}
	public void intro2Game() {//Birds chirping...
		ui.bgPanel.setBackground(Color.BLACK);
		game.currentDialogue = "intro2";
		game.diatextTracker = 2;
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			sm.se.setFile2(sm.birdsfx); 
			sm.se.playBirdSFX(); 
			game.nextDialogue = "intro3";
	}
	public void intro3Game() {//Different...
		ui.bgPanel.setBackground(Color.BLACK);
		game.currentDialogue = "intro3";
		game.diatextTracker = 3;
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue(); 
			game.nextDialogue = "intro3to4";
	}
	public void intro3to4(){//Fade In
		game.enableKeys = 1;
		sm.se.setFile4(sm.alarmclocksfx);
		sm.se.alarmclockSFX.start();
		game.currentDialogue = "intro3to4";
		ui.bgPanel.remove(gameStory.bgHolder);
		fadeIn bedroomIn = new fadeIn(ImageManager.bedroom);
		UserInterface.gameWindow.add(bedroomIn);
		UserInterface.gameWindow.setVisible(true);
		ui.dialogueBox.setText(null);
			game.nextDialogue = "intro4";
	}
	public void intro4Game() {//Bedroom
		game.currentDialogue = "intro4";
		game.diatextTracker = 4;
		fadeIn bedroomIn = new fadeIn(ImageManager.bedroom);
		bedroomIn.fadeInTimer.stop();
		UserInterface.gameWindow.remove(bedroomIn);
				ui.bgPanel.add(gameStory.bgHolder);
				gameStory.bgHolder.setIcon(images.bedroomView);
				ui.bgPanel.setVisible(true);
				game.startDialogue();
			game.nextDialogue = "intro5";
	}
	public void intro5Game() {//A new day...
		game.currentDialogue = "intro5";
		game.diatextTracker = 5;
		gameStory.bgHolder.setIcon(images.bedroomView);
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "intro5to6";
	}
	public void intro5to6(){
		game.enableKeys = 1;
		game.currentDialogue = "intro5to6";
		sm.se.setFile5(sm.outofbedsfx);
		sm.se.outofbedSFX.start();
		ui.bgPanel.remove(gameStory.bgHolder);
		Screen bedroomFadeOut = new Screen(ImageManager.bedroom);
		//ui.gameWindow.add(bedroomFadeOut);
		UserInterface.gameWindow.add(bedroomFadeOut);
			game.nextDialogue = "intro6";
	}
	public void intro6Game() {//City view
		game.currentDialogue = "intro6";
		game.diatextTracker = 6;
		Screen bedroomFadeOut = new Screen(ImageManager.bedroom);
		bedroomFadeOut.alphaTimer.stop();
		//ui.gameWindow.remove(bedroomFadeOut);
		UserInterface.gameWindow.remove(bedroomFadeOut);
		ui.mainTextArea.setFont(game.narrationFont);
			sm.se.setFile3(sm.curtainsfx);
			sm.se.curtainSFX.start();
				gameStory.pauseTime = 3000;
				gameStory.pause();
				ui.bgPanel.add(gameStory.bgHolder);
				ui.bgPanel.setVisible(true);
				gameStory.bgHolder.setIcon(images.cityView);
	
		game.startDialogue();
			game.nextDialogue = "intro6toEnd";	
	}
	public void intro6toEnd(){
		game.currentDialogue = "intro6toEnd";
		ui.bgPanel.remove(gameStory.bgHolder);
		Screen cityFadeOut = new Screen(ImageManager.city);
		//ui.gameWindow.add(bedroomFadeOut);
		UserInterface.gameWindow.add(cityFadeOut);
			game.nextDialogue = "introEnd";
	}
}
