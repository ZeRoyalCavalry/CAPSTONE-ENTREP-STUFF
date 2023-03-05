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

import mainPackage.CutsceneMaker;

public class sceneOnePartOne {
	
	Game game; UserInterface ui;
	TransitionClass sceneChanger; soundManager sm;
	playerStats player; storyLines lines; ImageManager images;
	ChoiceHandler cHandler; MouseHandler mHandler; 
	KeyboardHandler kbHandler; NameHandler nHandler;
	CutsceneMaker cutScene;

	public sceneOnePartOne(Game game, UserInterface ui, TransitionClass sceneChanger, soundManager sm,
						playerStats player, storyLines lines, ImageManager imgManage, int screenWidth, int screenHeight)
	{
		this.game = game; this.ui = ui; this.sceneChanger = sceneChanger; this.sm = sm;
		this.player = player; this.lines = lines; this.images = imgManage; 
	}

	//Cutscenes or Backgrounds
	public void livingRoomCutsceneLoad(){
		ui.npcName.setText("Mom");
		sceneChanger.showDialogue();
		CutsceneMaker livingRoomCutscene = new CutsceneMaker("livingRoom.jpg", "momSprite.png", 0.75f, 1.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
	}
	
	public void goodbedroomExit12() {
		sm.se.setFile7(sm.doorsfx);
		sm.se.doorSFX.start();
			gameStory.pauseTime = 3000;
			gameStory.pause();
		game.currentDialogue = "gbedroomExit12";
		game.diatextTracker = 11;
		livingRoomCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			gameStory.increaseCP = 1;
			gameStory.selectedRight();
				ui.mainTextArea.append(gameStory.name + "!");
				game.nextDialogue = "gbedroomExit13";
	}
		public void goodbedroomExit13() {
			game.currentDialogue = "gbedroomExit13";	
			game.diatextTracker = 12;
			livingRoomCutsceneLoad();
				ui.mainTextArea.setFont(game.normalFont);
				game.startDialogue();
					game.nextDialogue = "explanation1";
		}	
		
		//Picked bad
		public void scolding11() {
			livingRoomCutsceneLoad();
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
			sm.se.setFile7(sm.doorsfx);
			sm.se.doorSFX.start();
			gameStory.pauseTime = 3000;
			gameStory.pause();
			game.currentDialogue = "bbedroomExit12";
			game.diatextTracker = 14;
			livingRoomCutsceneLoad();
			game.DiaTimer.setDelay(game.normalSpeed);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "bbedroomExit13";
		}
		public void badbedroomExit13() {
			game.currentDialogue = "bbedroomExit13";
			game.diatextTracker = 15;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "explanation1";
		}

		//Explanation
		public void explanation1(){
			game.currentDialogue = "explanation1";
			game.diatextTracker = 16;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "explanation2";
		}
		public void explanation2(){
			game.currentDialogue = "explanation2";
			game.diatextTracker = 17;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "explanation3";
		}
		public void explanation3(){
			game.currentDialogue = "explanation3";
			game.diatextTracker = 18;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "firstLessonStart1";
		}

		//Transition to First Lesson
		public void firstLessonStart1() {
			game.currentDialogue = "firstLessonStart1";
			game.diatextTracker = 19;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "firstLessonStart2";
		}
		public void firstLessonStart2(){
			game.currentDialogue = "firstLessonStart2";
			game.diatextTracker = 20;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "firstLessonQuestion";
		}

		//First Lesson Question
		public void firstLessonQuestion() {
			game.currentDialogue = "firstLessonQuestion";
			game.currentQuestion = "firstLessonQuestion";
			game.questiontextTracker = 1;
			livingRoomCutsceneLoad();
			ui.dialoguePanel.setVisible(false);
			ui.mainTextArea.setFont(game.narrationFont);
			ui.mainTextArea.setText("");
			ui.dialogueBox.setText(null);
			game.choiceTimer.start();
				ui.choice1.setText("It interacts with energy");
				ui.choice2.setText("It undergoes chemical change");
				ui.choice3.setText("It interacts with celestial bodies");
				ui.choice4.setText("None of the above");
				
				game.nextPosition1 = "firstLessonWrong";
				game.nextPosition2 = "firstLessonRight";
				game.nextPosition3 = "firstLessonWrong";
				game.nextPosition4 = "firstLessonWrong";
		}

		//First Lesson Result
		public void firstLessonRight(){
			game.currentDialogue = "firstLessonRight";
			game.diatextTracker = 21;
			livingRoomCutsceneLoad();
			ui.dialoguePanel.setVisible(true);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=1;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");
				game.nextDialogue = "firstLessonNotes";
		}
		public void firstLessonWrong(){
			game.currentDialogue = "firstLessonWrong";
			game.diatextTracker = 22;
			livingRoomCutsceneLoad();
			ui.dialoguePanel.setVisible(true);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 1;
			gameStory.selectedWrong();
				game.nextDialogue = "firstLessonNotes";
		}
		public void firstLessonNotes(){
			game.currentDialogue = "firstLessonNotes";
			game.diatextTracker = 23;
			livingRoomCutsceneLoad();
			ui.dialoguePanel.setVisible(true);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "secondLessonStart1";
		}

		//Transition to Second Lesson
		public void secondLessonStart1(){
			game.currentDialogue = "secondLessonStart1";
			game.diatextTracker = 24;
			livingRoomCutsceneLoad();
			ui.dialoguePanel.setVisible(true);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "secondLessonStart2";
		}
		public void secondLessonStart2(){
			game.currentDialogue = "secondLessonStart2";
			game.diatextTracker = 25;
			livingRoomCutsceneLoad();
			ui.dialoguePanel.setVisible(true);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			game.nextDialogue = "secondLessonStart3";
		}
		public void secondLessonStart3(){
			game.currentDialogue = "secondLessonStart3";
			game.diatextTracker = 26;
			livingRoomCutsceneLoad();
			ui.dialoguePanel.setVisible(true);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "secondLessonQuestion1";
		}

		////Second Lesson Part 1 Question
		public void secondLessonQuestion1() {
			game.currentDialogue = "secondLessonQuestion1";
			game.currentQuestion = "secondLessonQuestion1";

			game.questiontextTracker = 2;
			livingRoomCutsceneLoad();
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
			game.choiceTimer.start();

					ui.choice1.setText("Proton");
					ui.choice2.setText("Electron");
					ui.choice3.setText("Neutron");
					ui.choice4.setText("Cauldron");
				
					game.nextPosition1 = "secondLesson1Right";
					game.nextPosition2 = "secondLesson1Wrong";
					game.nextPosition3 = "secondLesson1Wrong";
					game.nextPosition4 = "secondLesson1Wrong";
		}

		//Second Lesson Part 1 Results
		public void secondLesson1Right(){
			game.currentDialogue = "secondLesson1Right";
			game.diatextTracker = 27;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=1;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

				game.nextDialogue = "secondLesson1Notes";
		}
		public void secondLesson1Wrong(){
			game.currentDialogue = "secondLesson1Wrong";
			game.diatextTracker = 28;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 1;
			gameStory.selectedWrong();
				game.nextDialogue = "secondLesson1Notes";
		}
		public void secondLesson1Notes(){
			game.currentDialogue = "secondLesson1Wrong";
			game.diatextTracker = 29;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "secondLessonQuestion2";
		}

		////Second Lesson Part 2 Question
		public void secondLessonQuestion2() {
			game.currentDialogue = "secondLessonQuestion2";
			game.currentQuestion = "secondLessonQuestion2";

			game.questiontextTracker = 3;
			livingRoomCutsceneLoad();
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
			game.choiceTimer.start();

					ui.choice1.setText("Neutron");
					ui.choice2.setText("Proton");
					ui.choice3.setText("Electron");
					ui.choice4.setText("Wonton");
				
					game.nextPosition1 = "secondLesson2Wrong";
					game.nextPosition2 = "secondLesson2Wrong";
					game.nextPosition3 = "secondLesson2Right";
					game.nextPosition4 = "secondLesson2Wrong";
		}

		//Second Lesson Part 2 Results
		public void secondLesson2Right(){
			game.currentDialogue = "secondLesson1Right";
			game.diatextTracker = 30;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=1;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

				game.nextDialogue = "secondLesson2Notes";
		}
		public void secondLesson2Wrong(){
			game.currentDialogue = "secondLesson1Wrong";
			game.diatextTracker = 31;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 1;
			gameStory.selectedWrong();
				game.nextDialogue = "secondLesson2Notes";
		}
		public void secondLesson2Notes(){
			game.currentDialogue = "secondLesson1Wrong";
			game.diatextTracker = 32;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "secondLessonQuestion3";
		}

		////Second Lesson Part 3 Question
		public void secondLessonQuestion3() {
			game.currentDialogue = "secondLessonQuestion3";
			game.currentQuestion = "secondLessonQuestion3";
		
				game.questiontextTracker = 4;
				livingRoomCutsceneLoad();
					ui.dialoguePanel.setVisible(false);
					ui.mainTextArea.setFont(game.narrationFont);
					ui.mainTextArea.setText("");
					ui.dialogueBox.setText(null);
				game.choiceTimer.start();

						ui.choice1.setText("Electron");
						ui.choice2.setText("Turon");
						ui.choice3.setText("Proton");
						ui.choice4.setText("Neutron");
						
						game.nextPosition1 = "secondLesson3Wrong";
						game.nextPosition2 = "secondLesson3Wrong";
						game.nextPosition3 = "secondLesson3Wrong";
						game.nextPosition4 = "secondLesson3Right";
		}

		//Second Lesson Part 3 Results
		public void secondLesson3Right(){
			game.currentDialogue = "secondLesson3Right";
			game.diatextTracker = 33;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=1;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

				game.nextDialogue = "secondLesson3Notes";
		}
		public void secondLesson3Wrong(){
			game.currentDialogue = "secondLesson3Wrong";
			game.diatextTracker = 34;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 1;
			gameStory.selectedWrong();
				game.nextDialogue = "secondLesson3Notes";
		}
		public void secondLesson3Notes(){
			game.currentDialogue = "secondLesson3Notes";
			game.diatextTracker = 35;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();

				game.nextDialogue = "secondLessonReviewStart";
		}

		//Second Lesson Review Transition
		public void secondLessonReviewStart(){
			game.currentDialogue = "secondLessonReviewStart";
			game.diatextTracker = 36;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();

				game.nextDialogue = "secondLessonReview1";
		}

		//Second Lesson Review Question 1
		public void secondLessonReview1() {
			game.currentDialogue = "secondLessonReview1";
			game.currentQuestion = "secondLessonReview1";
		
				game.questiontextTracker = 5;
				livingRoomCutsceneLoad();
					ui.dialoguePanel.setVisible(false);
					ui.mainTextArea.setFont(game.narrationFont);
					ui.mainTextArea.setText("");
					ui.dialogueBox.setText(null);
				game.choiceTimer.start();

						ui.choice1.setText("Neutron");
						ui.choice2.setText("Proton");
						ui.choice3.setText("Electron");
						ui.choice4.setText("Nutrition");
						
						game.nextPosition1 = "secondLessonReview1Right";
						game.nextPosition2 = "secondLessonReview1Wrong";
						game.nextPosition3 = "secondLessonReview1Wrong";
						game.nextPosition4 = "secondLessonReview1Wrong";
		}

		public void secondLessonReview1Right(){
			game.currentDialogue = "secondLessonReview1Right";
			game.diatextTracker = 37;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=1;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

				game.nextDialogue = "secondLessonReview2";
		}
		public void secondLessonReview1Wrong(){
			game.currentDialogue = "secondLessonReview1Wrong";
			game.diatextTracker = 38;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			gameStory.decreaseCP = 2;
			gameStory.selectedWrong();
			game.startDialogue();

				game.nextDialogue = "secondLessonReview1";
		}

		//Second Lesson Review Question 2
		public void secondLessonReview2() {
			game.currentDialogue = "secondLessonReview2";
			game.currentQuestion = "secondLessonReview2";
		
				game.questiontextTracker = 6;
				livingRoomCutsceneLoad();
					ui.dialoguePanel.setVisible(false);
					ui.mainTextArea.setFont(game.narrationFont);
					ui.mainTextArea.setText("");
					ui.dialogueBox.setText(null);
				game.choiceTimer.start();

						ui.choice1.setText("Voltron");
						ui.choice2.setText("Electron");
						ui.choice3.setText("Neutron");
						ui.choice4.setText("Proton");
						
						game.nextPosition1 = "secondLessonReview2Wrong";
						game.nextPosition2 = "secondLessonReview2Wrong";
						game.nextPosition3 = "secondLessonReview2Wrong";
						game.nextPosition4 = "secondLessonReview2Right";
		}
		public void secondLessonReview2Right(){
			game.currentDialogue = "secondLessonReview2Right";
			game.diatextTracker = 37;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=1;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

				game.nextDialogue = "secondLessonReview3";
		}
		public void secondLessonReview2Wrong(){
			game.currentDialogue = "secondLessonReview2Wrong";
			game.diatextTracker = 38;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			gameStory.decreaseCP = 2;
			gameStory.selectedWrong();
			game.startDialogue();

				game.nextDialogue = "secondLessonReview2";
		}

		//Second Lesson Review Question 3
		public void secondLessonReview3() {
			game.currentDialogue = "secondLessonReview3";
			game.currentQuestion = "secondLessonReview3";
		
				game.questiontextTracker = 7;
				livingRoomCutsceneLoad();
					ui.dialoguePanel.setVisible(false);
					ui.mainTextArea.setFont(game.narrationFont);
					ui.mainTextArea.setText("");
					ui.dialogueBox.setText(null);
				game.choiceTimer.start();

						ui.choice1.setText("Neutron");
						ui.choice2.setText("Electron");
						ui.choice3.setText("Orion");
						ui.choice4.setText("Proton");
						
						game.nextPosition1 = "secondLessonReview3Wrong";
						game.nextPosition2 = "secondLessonReview3Right";
						game.nextPosition3 = "secondLessonReview3Wrong";
						game.nextPosition4 = "secondLessonReview3Wrong";
		}
		public void secondLessonReview3Right(){
			game.currentDialogue = "secondLessonReview3Right";
			game.diatextTracker = 37;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=1;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

				game.nextDialogue = "secondLessonReview4";
		}
		public void secondLessonReview3Wrong(){
			game.currentDialogue = "secondLessonReview3Wrong";
			game.diatextTracker = 38;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			gameStory.decreaseCP = 2;
			gameStory.selectedWrong();
			game.startDialogue();

				game.nextDialogue = "secondLessonReview3";
		}

		//Second Lesson Review Question 4
		public void secondLessonReview4() {
			game.currentDialogue = "secondLessonReview4";
			game.currentQuestion = "secondLessonReview4";
		
				game.questiontextTracker = 8;
				livingRoomCutsceneLoad();
					ui.dialoguePanel.setVisible(false);
					ui.mainTextArea.setFont(game.narrationFont);
					ui.mainTextArea.setText("");
					ui.dialogueBox.setText(null);
				game.choiceTimer.start();

						ui.choice1.setText("Proton");
						ui.choice2.setText("Electron");
						ui.choice3.setText("Neutron");
						ui.choice4.setText("Xenon");
						
						game.nextPosition1 = "secondLessonReview4Wrong";
						game.nextPosition2 = "secondLessonReview4Wrong";
						game.nextPosition3 = "secondLessonReview4Right";
						game.nextPosition4 = "secondLessonReview4Wrong";
		}
		public void secondLessonReview4Right(){
			game.currentDialogue = "secondLessonReview4Right";
			game.diatextTracker = 37;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=1;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

				game.nextDialogue = "secondLessonReview5";
		}
		public void secondLessonReview4Wrong(){
			game.currentDialogue = "secondLessonReview4Wrong";
			game.diatextTracker = 38;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			gameStory.decreaseCP = 2;
			gameStory.selectedWrong();
			game.startDialogue();

				game.nextDialogue = "secondLessonReview4";
		}

		//Second Lesson Review Question 5
		public void secondLessonReview5() {
			game.currentDialogue = "secondLessonReview5";
			game.currentQuestion = "secondLessonReview5";
		
				game.questiontextTracker = 9;
				livingRoomCutsceneLoad();
					ui.dialoguePanel.setVisible(false);
					ui.mainTextArea.setFont(game.narrationFont);
					ui.mainTextArea.setText("");
					ui.dialogueBox.setText(null);
				game.choiceTimer.start();

						ui.choice1.setText("Mitochondrion");
						ui.choice2.setText("Electron");
						ui.choice3.setText("Proton");
						ui.choice4.setText("Neutron");
						
						game.nextPosition1 = "secondLessonReview5Wrong";
						game.nextPosition2 = "secondLessonReview5Right";
						game.nextPosition3 = "secondLessonReview5Wrong";
						game.nextPosition4 = "secondLessonReview5Wrong";
		}
		public void secondLessonReview5Right(){
			game.currentDialogue = "secondLessonReview5Right";
			game.diatextTracker = 37;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=1;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

				game.nextDialogue = "secondLessonReview6";
		}
		public void secondLessonReview5Wrong(){
			game.currentDialogue = "secondLessonReview5Wrong";
			game.diatextTracker = 38;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			gameStory.decreaseCP = 2;
			gameStory.selectedWrong();
			game.startDialogue();

				game.nextDialogue = "secondLessonReview5";
		}

		//Second Lesson Review Question 6
		public void secondLessonReview6() {
			game.currentDialogue = "secondLessonReview6";
			game.currentQuestion = "secondLessonReview6";
		
				game.questiontextTracker = 10;
				livingRoomCutsceneLoad();
					ui.dialoguePanel.setVisible(false);
					ui.mainTextArea.setFont(game.narrationFont);
					ui.mainTextArea.setText("");
					ui.dialogueBox.setText(null);
				game.choiceTimer.start();

						ui.choice1.setText("Proton");
						ui.choice2.setText("Electron");
						ui.choice3.setText("Iron");
						ui.choice4.setText("Neutron");
						
						game.nextPosition1 = "secondLessonReview6Right";
						game.nextPosition2 = "secondLessonReview6Wrong";
						game.nextPosition3 = "secondLessonReview6Wrong";
						game.nextPosition4 = "secondLessonReview6Wrong";
		}
		public void secondLessonReview6Right(){
			game.currentDialogue = "secondLessonReview6Right";
			game.diatextTracker = 37;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=1;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

				game.nextDialogue = "thirdLessonStart1";
		}
		public void secondLessonReview6Wrong(){
			game.currentDialogue = "secondLessonReview6Wrong";
			game.diatextTracker = 38;
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			gameStory.decreaseCP = 2;
			gameStory.selectedWrong();
			game.startDialogue();

				game.nextDialogue = "secondLessonReview6";
		}
		//SECOND LESSON REVIEW END
}
