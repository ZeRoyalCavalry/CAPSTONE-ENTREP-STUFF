package scenes;

import mainPackage.Game;
import mainPackage.ImageManager;
import mainPackage.TransitionClass;
import mainPackage.UserInterface;
import mainPackage.fadeIn;
import mainPackage.gameStory;
import mainPackage.playerStats;
import mainPackage.soundManager;
import mainPackage.storyLines;
import mainPackage.Game.ChoiceHandler;
import mainPackage.Game.KeyboardHandler;
import mainPackage.Game.MouseHandler;
import mainPackage.Game.NameHandler;

import mainPackage.CutsceneMaker;

public class sceneOnePartEnd {
	
	Game game; UserInterface ui;
	TransitionClass sceneChanger; soundManager sm;
	playerStats player; storyLines lines; ImageManager images;
	ChoiceHandler cHandler; MouseHandler mHandler; 
	KeyboardHandler kbHandler; NameHandler nHandler;
	CutsceneMaker cutScene;

    String answer;

	public sceneOnePartEnd(Game game, UserInterface ui, TransitionClass sceneChanger, soundManager sm,
						playerStats player, storyLines lines, ImageManager imgManage, int screenWidth, int screenHeight)
	{
		this.game = game; this.ui = ui; this.sceneChanger = sceneChanger; this.sm = sm;
		this.player = player; this.lines = lines; this.images = imgManage; 
	}

	String motherSprite = "momSprite.png";

	public void livingRoomCutsceneLoad(){
		sceneChanger.showDialogue();
		ui.npcName.setText("Mom");
		CutsceneMaker livingRoomCutscene = new CutsceneMaker("livingRoom.jpg", motherSprite, "placeholder.png", 
												"placeholder.png", 0.75f, 1.0f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
	}
    public void homeBathRoomCutsceneLoad(){
		sceneChanger.showDialogue();
		ui.npcName.setText("Mom");
		CutsceneMaker homeBathRoomCutscene = new CutsceneMaker("homeRestroom.png", "placeholder.png", "placeholder.png", "placeholder.png", 
																1.0f, 0.0f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
	}
	public void blackScreen(){
		sceneChanger.showDialogue();
		ui.npcName.setText(null);
		CutsceneMaker blackScreen = new CutsceneMaker("blackscreen.png", "placeholder.png", "placeholder.png", "placeholder.png", 
														1.0f, 0.0f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
	}

	//End of Scene/Episode Transition
	public void endStart1(){
		game.currentDialogue = "endStart1";
		game.diatextTracker = 73;
		motherSprite = "momSpriteTeaching.png";
		livingRoomCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "endStart2";
	}
	public void endStart2(){
		game.currentDialogue = "endStart2";
		game.diatextTracker = 74;
		blackScreen();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "endStart2to3";
	}
	public void endStart2to3(){
		game.currentDialogue = "endStart2to3";
		sm.se.setFile7(sm.doorsfx);
		sm.se.doorSFX.start();
		ui.bgPanel.remove(CutsceneMaker.image);
		ui.bgPanel.setVisible(false);
		fadeIn bathroomFadeIn = new fadeIn(ImageManager.homeCR);
		UserInterface.gameWindow.add(bathroomFadeIn);
		UserInterface.gameWindow.setVisible(true);
			game.nextDialogue = "endStart3";
	}
	public void endStart3(){
		game.currentDialogue = "endStart3";
		game.diatextTracker = 75;
		homeBathRoomCutsceneLoad();
		ui.npcName.setText(null);
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "endQuestion1";
	}

	//End Question 1
	public void endQuestion1(){
		game.currentDialogue = "endQuestion1";
		game.currentQuestion = "endQuestion1";
		game.questiontextTracker = 21;
		homeBathRoomCutsceneLoad();
		ui.npcName.setText(null);
		ui.dialogueBox.setText(null);
		ui.dialoguePanel.setVisible(false);
		ui.mainTextArea.setFont(game.narrationFont);
		ui.mainTextArea.setText("");
		game.choiceTimer.start();
			ui.choice1.setText("Toothpaste");
			ui.choice2.setText("Liquid Soap");
			ui.choice3.setText("Bar Soap");
			ui.choice4.setText("Shampoo");
		
			game.nextPosition1 = "endQuestion1Right";
			game.nextPosition2 = "endQuestion1Wrong";
			game.nextPosition3 = "endQuestion1Wrong";
			game.nextPosition4 = "endQuestion1Wrong";
	}

	//Results for End Question 1
	public void endQuestion1Right(){
		game.currentDialogue = "endQuestion1Right";
		game.diatextTracker = 76;
		homeBathRoomCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
				gameStory.increaseCP = 1;
				playerStats.XP+=5;
				gameStory.selectedRight();
			UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

			game.nextDialogue = "endQuestion2";
	}
	public void endQuestion1Wrong(){
		game.currentDialogue = "endQuestion1Wrong";
		game.diatextTracker = 77;
		homeBathRoomCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
				gameStory.decreaseCP = 1;
				gameStory.selectedWrong();
			UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

			game.nextDialogue = "endQuestion2";
	}

	//End Question 2
	public void endQuestion2(){
		game.currentDialogue = "endQuestion2";
		game.currentQuestion = "endQuestion2";
		game.questiontextTracker = 22;
		homeBathRoomCutsceneLoad();
		ui.npcName.setText(null);
		ui.dialogueBox.setText(null);
		ui.dialoguePanel.setVisible(false);
		ui.mainTextArea.setFont(game.narrationFont);
		ui.mainTextArea.setText("");
		game.choiceTimer.start();
			ui.choice1.setText("Toothpaste");
			ui.choice2.setText("Liquid Soap");
			ui.choice3.setText("Bar Soap");
			ui.choice4.setText("Shampoo");
		
			game.nextPosition1 = "endQuestion2Wrong";
			game.nextPosition2 = "endQuestion2Wrong";
			game.nextPosition3 = "endQuestion2Right";
			game.nextPosition4 = "endQuestion2Wrong";
	}

	//Results for End Question 2
	public void endQuestion2Right(){
		game.currentDialogue = "endQuestion2Right";
		game.diatextTracker = 78;
		homeBathRoomCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
				gameStory.increaseCP = 1;
				playerStats.XP+=3;
				gameStory.selectedRight();
			UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

			game.nextDialogue = "sceneOneEnds1";
	}
	public void endQuestion2Wrong(){
		game.currentDialogue = "endQuestion2Wrong";
		game.diatextTracker = 79;
		homeBathRoomCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
				gameStory.decreaseCP = 1;
				gameStory.selectedWrong();
			UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

			game.nextDialogue = "sceneOneEnds1";
	}

	//Actual End
	public void sceneOneEnds1(){
		game.currentDialogue = "sceneOneEnds1";
		game.diatextTracker = 80;
		homeBathRoomCutsceneLoad();
		ui.npcName.setText(null);
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "sceneOneEnds2";
	}
	public void sceneOneEnds2(){
		sm.se.setFile8(sm.brushteethsfx);
		sm.se.brushteethSFX.start();
			gameStory.pauseTime = 9000;
			gameStory.pause();
		sm.se.setFile6(sm.showersfx);
		sm.se.showerSFX.start();
			gameStory.pauseTime = 8000;
			gameStory.pause();
		game.currentDialogue = "sceneOneEnds2";
		if(playerStats.CP>= 8){
			game.diatextTracker = 81;
			motherSprite = "momSpriteTeaching.png";
		}
		else{
			game.diatextTracker = 82;
			motherSprite = "MomSpriteTalking.png";
		}
		livingRoomCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "sceneOneEndEnd";
	}
	public void sceneOneEndEnd(){
		game.currentDialogue = "sceneOneEndEnd";
		game.diatextTracker = 83;
		ui.mainTextArea.setFont(game.narrationFont);
		blackScreen();
		game.startDialogue();
			sm.se.setFile7(sm.doorsfx);
			sm.se.doorSFX.start();
	}
}
