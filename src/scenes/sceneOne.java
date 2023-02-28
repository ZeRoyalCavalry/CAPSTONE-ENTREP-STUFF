package scenes;

import mainPackage.Game;
import mainPackage.ImageManager;
import mainPackage.TransitionClass;
import mainPackage.UserInterface;
import mainPackage.gameStory;
import mainPackage.playerStats;
import mainPackage.soundManager;
import mainPackage.storyLines;
import mainPackage.Game.ChoiceHandler;
import mainPackage.Game.KeyboardHandler;
import mainPackage.Game.MouseHandler;
import mainPackage.Game.NameHandler;

import java.awt.Color;

import mainPackage.CutsceneMaker;

public class sceneOne {
	
	Game game; UserInterface ui;
	TransitionClass sceneChanger; soundManager sm;
	playerStats player; storyLines lines; ImageManager images;
	ChoiceHandler cHandler; MouseHandler mHandler; 
	KeyboardHandler kbHandler; NameHandler nHandler;
	
	public sceneOne(Game game, UserInterface ui, TransitionClass sceneChanger, soundManager sm,
						playerStats player, storyLines lines, ImageManager imgManage, int screenWidth, int screenHeight)
	{
		this.game = game; this.ui = ui; this.sceneChanger = sceneChanger; this.sm = sm;
		this.player = player; this.lines = lines; this.images = imgManage; 
	}
	
	//First choice of the game or First Scene Transition
		public void amBedroom() {
			game.currentDialogue = "introEnd";
			game.currentQuestion = "afterBed";
			game.enableKeys = 0;
			game.questiontextTracker = 0;
			ui.choicePanel.setVisible(true);
				ui.bgPanel.add(gameStory.bgHolder);
					gameStory.bgHolder.setIcon(images.bedroomView);
					ui.bgPanel.setVisible(true);
			ui.mainTextArea.setFont(game.narrationFont);
			ui.mainTextArea.setText("");
			ui.dialogueBox.setText(null);
			game.choiceTimer.start();
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
			gameStory.bgHolder.setIcon(images.bedroomView);
			game.currentDialogue = "bedroomExit11";
			game.enableKeys = 1;
			game.diatextTracker = 7;
			ui.mainTextArea.setFont(game.narrationFont);
			game.startDialogue();
				game.nextDialogue = "gbedroomExit12";
		}
		public void bedroomStudy11() {
			gameStory.bgHolder.setIcon(images.bedroomView);
			game.diatextTracker = 8;
			game.enableKeys = 1;
			game.currentDialogue = "bedroomStudy11";
			ui.mainTextArea.setFont(game.narrationFont);
			game.startDialogue();
				game.nextDialogue = "gbedroomExit12";
		}
		public void bedroomSS11() {
			gameStory.bgHolder.setIcon(images.cityView);
			game.currentDialogue = "bedroomSS11";
			game.diatextTracker = 9;
			game.enableKeys = 1;
			ui.mainTextArea.setFont(game.narrationFont);
			game.startDialogue();
					game.nextDialogue = "scolding11";
		}
		public void bedroomSleep11() {
			ui.bgPanel.setBackground(Color.BLACK);
			game.currentDialogue = "bedroomSleep11";
			game.diatextTracker = 10;
			game.enableKeys = 1;
			ui.mainTextArea.setFont(game.narrationFont);
			game.startDialogue();
				game.nextDialogue = "scolding11";
		}

		public void goodbedroomExit12() {
				CutsceneMaker livingroomCutscene = new CutsceneMaker("momSprite.png", "livingRoom.jpg");
					sceneChanger.showDialogue();

			sm.se.setFile7(sm.doorsfx);
			sm.se.doorSFX.start();
				gameStory.pauseTime = 3000;
				gameStory.pause();
			game.currentDialogue = "gbedroomExit12";
			game.diatextTracker = 11;
			
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				gameStory.increaseCP = 1;
				gameStory.selectedRight();
					ui.mainTextArea.append(gameStory.name + "!");
					game.nextDialogue = "gbedroomExit13";
		}
		public void goodbedroomExit13() {
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "gbedroomExit13";	
			game.diatextTracker = 12;
				ui.mainTextArea.setFont(game.normalFont);
				game.startDialogue();
					game.nextDialogue = "explanation1";
		}	
		
		
		public void scolding11() {
			gameStory.bgHolder.setIcon(images.bedroomView);
			game.currentDialogue = "scolding11";
			game.diatextTracker = 13;
			ui.mainTextArea.setText("");
				gameStory.pauseTime = 8000;
				gameStory.pause();
					ui.mainTextPanel.setVisible(true);
					ui.playerStatsPanel.setVisible(true);
			game.DiaTimer.setDelay(7);
				ui.mainTextArea.setFont(game.hyperboleFont);
				game.startDialogue();
				gameStory.decreaseCP = 1;
				gameStory.selectedWrong();
					game.nextDialogue = "bbedroomExit12";
		}
		public void badbedroomExit12() {
			gameStory.bgHolder.setIcon(images.livingroomView);
			sm.se.setFile7(sm.doorsfx);
			sm.se.doorSFX.start();
			gameStory.pauseTime = 3000;
			gameStory.pause();
			game.currentDialogue = "bbedroomExit12";
			game.diatextTracker = 14;
			ui.bgPanel.setVisible(true);
				gameStory.bgHolder.setIcon(images.livingroomView);
			game.DiaTimer.setDelay(game.normalSpeed);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "bbedroomExit13";
		}
		public void badbedroomExit13() {
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "bbedroomExit13";
			game.diatextTracker = 15;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "explanation1";
		}

		public void explanation1(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "explanation1";
			game.diatextTracker = 16;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "explanation2";
		}
		public void explanation2(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "explanation2";
			game.diatextTracker = 17;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "explanation3";
		}
		public void explanation3(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "explanation3";
			game.diatextTracker = 18;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				if(playerStats.CP == playerStats.maxCP){
					game.nextDialogue = "setupFirstQuestion";	
				}
				else{
					game.nextDialogue = "bbedroomExit14";
				}
		}

		public void badbedroomExit14() {
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "bbedroomExit14";
			game.diatextTracker = 19;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "sidefirstQuestion";
		}

		public void setupFirstQuestion(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "setupFirstQuestion";
			game.diatextTracker = 20;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "preFirstQuestion";
		}

		public void sidefirstQuestion() {
			game.currentDialogue = "sidefirstQuestion";
			game.currentQuestion = "sidefirstQuestion";
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.questiontextTracker = 1;
			ui.dialoguePanel.setVisible(false);
			ui.mainTextArea.setFont(game.narrationFont);
			ui.mainTextArea.setText("");
			ui.dialogueBox.setText(null);
			game.choiceTimer.start();
				ui.choice1.setText("Happiness");
				ui.choice2.setText("Pleasure");
				ui.choice3.setText("Sleepiness");
				ui.choice4.setText("Aggressiveness");
				
				game.nextPosition1 = "sfhincorrect0";
				game.nextPosition2 = "sfpincorrect0";
				game.nextPosition3 = "sfscorrect0";
				game.nextPosition4 = "sfaincorrect0";
		}

		public void answerHappiness(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "sfhincorrect0";
			game.diatextTracker = 22;
			ui.dialoguePanel.setVisible(true);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "sfincorrect0";
		}
		public void answerPleasure(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "sfpincorrect0";
			game.diatextTracker = 23;
			ui.dialoguePanel.setVisible(true);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "sfincorrect0";
		}
		public void answerSleepiness(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "sfscorrect0";
			game.diatextTracker = 24;
			ui.dialoguePanel.setVisible(true);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "sfcorrect0";
		}
		public void answerAggressiveness(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "sfaincorrect0";
			game.diatextTracker = 25;
			ui.dialoguePanel.setVisible(true);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "sfincorrect0";
		}
		
		public void rightMelatonin() {
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "sfcorrect0";
			game.diatextTracker = 26;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1; 
			gameStory.selectedRight();
				playerStats.XP+=2;
				ui.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

				game.nextDialogue = "preFirstQuestion";
		}
		public void wrongMelatonin(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "sfincorrect0";
			game.diatextTracker = 26;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 1;
			gameStory.selectedWrong();
				game.nextDialogue = "preFirstQuestion";
		}
		
		public void preFirstQuestion(){
			game.currentDialogue = "preFirstQuestion";
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.diatextTracker = 27;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "firstQuestion";
		}

		
		//First Question but second choice
		public void firstQuestion() {
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "firstQuestion";
			game.currentQuestion = "firstQuestion";
			game.questiontextTracker = 2;
			ui.dialoguePanel.setVisible(false);
			ui.mainTextArea.setFont(game.narrationFont);
			ui.mainTextArea.setText("");
			ui.dialogueBox.setText(null);
			game.choiceTimer.start();
				ui.choice1.setText("Toothpaste");
				ui.choice2.setText("Liquid Soap");
				ui.choice3.setText("Bar Soap");
				ui.choice4.setText("Shampoo");
				
				game.nextPosition1 = "correct1";
				game.nextPosition2 = "incorrect1";
				game.nextPosition3 = "incorrect1";
				game.nextPosition4 = "incorrect1";
		}
		public void rightFirst(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "correct1";
			game.diatextTracker = 28;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			gameStory.selectedRight();
			playerStats.XP+=7;
				ui.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

				game.nextDialogue = "secondQuestion";
		}
		public void wrongFirst(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "incorrect1";
			game.diatextTracker = 29;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 1;
			gameStory.selectedWrong();
				game.nextDialogue = "secondQuestion";
		}

		//Second Question
		public void secondQuestion(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "secondQuestion";
			game.currentQuestion = "secondQuestion";
			game.questiontextTracker = 3;
			ui.dialoguePanel.setVisible(false);
			ui.mainTextArea.setFont(game.narrationFont);
			ui.mainTextArea.setText("");
			ui.dialogueBox.setText(null);
			game.choiceTimer.start();
				ui.choice1.setText("Toothpaste");
				ui.choice2.setText("Liquid Soap");
				ui.choice3.setText("Bar Soap");
				ui.choice4.setText("Shampoo");
				
				game.nextPosition1 = "incorrect2";
				game.nextPosition2 = "incorrect2";
				game.nextPosition3 = "correct2";
				game.nextPosition4 = "incorrect2";
		}
		public void rightSecond(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "correct2";
			game.diatextTracker = 30;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			gameStory.selectedRight();
				playerStats.XP+=3;
					ui.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

				game.nextDialogue = "afterQAOne";
		}
		public void wrongSecond(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "incorrect2";
			game.diatextTracker = 31;
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 1;
			gameStory.selectedWrong();
				game.nextDialogue = "afterQAOne";
		}

		public void afterQAOne(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "afterQAOne";
			game.diatextTracker = 32;
				ui.mainTextArea.setFont(game.normalFont);
				game.startDialogue();
				sm.se.setFile8(sm.brushteethsfx);
				sm.se.brushteethSFX.start();
					gameStory.pauseTime = 9000;
					gameStory.pause();
				sm.se.setFile6(sm.showersfx);
				sm.se.showerSFX.start();
					gameStory.pauseTime = 8000;
					gameStory.pause();
				game.nextDialogue = "sceneOneEnd";
		}
		public void sceneOneEnd(){
			gameStory.bgHolder.setIcon(images.livingroomView);
			game.currentDialogue = "sceneOneEnd";
			if(playerStats.CP>= 8){
				game.diatextTracker = 33;
			}
			else{
				game.diatextTracker = 34;
			}
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "exitHouse";
		}
		public void exitHouse(){
			ui.bgPanel.setBackground(Color.BLACK);
			sm.se.setFile7(sm.doorsfx);
			sm.se.doorSFX.start();
				gameStory.pauseTime = 3000;
				gameStory.pause();
			game.currentDialogue = "exitHouse";
			game.diatextTracker = 35;
			ui.mainTextArea.setFont(game.narrationFont);
			game.startDialogue();
				game.nextDialogue = "sceneTwoStart";
		}
}
