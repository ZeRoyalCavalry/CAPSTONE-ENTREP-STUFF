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
import mainPackage.CutsceneManager;

public class sceneTwoPartTwo {

    Game game; UserInterface ui;
	TransitionClass sceneChanger; soundManager sm;
	playerStats player; storyLines lines; ImageManager images;
	ChoiceHandler cHandler; MouseHandler mHandler; 
	KeyboardHandler kbHandler; NameHandler nHandler;
	CutsceneMaker cutScene; CutsceneManager csm;

	public String spriteToLoad;
    String answer, finalAnswer;
	int FifthLessonCorrectItems = 0;

	public sceneTwoPartTwo(Game game, UserInterface ui, TransitionClass sceneChanger, soundManager sm,
						playerStats player, storyLines lines, ImageManager imgManage, int screenWidth, int screenHeight, CutsceneManager csmanager)
	{
		this.game = game; this.ui = ui; this.sceneChanger = sceneChanger; this.sm = sm;
		this.player = player; this.lines = lines; this.images = imgManage; csm = csmanager;
	}
	
	public void crushConvenienceStoreEventStart(){
		game.currentDialogue = "crushConvenienceStoreEventStart";
		game.diatextTracker = 119;
		csm.city2RainCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventTalk";
	}
	public void crushConvenienceStoreEventTalk(){
		game.currentDialogue = "crushConvenienceStoreEventTalk";
		game.diatextTracker = 120;
		csm.city2RainCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventTalk1";
	}	
	public void crushConvenienceStoreEventTalk1(){
		game.currentDialogue = "crushConvenienceStoreEventTalk1";
		game.diatextTracker = 121;
		csm.city2RainCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventTalk2";
	}
	public void crushConvenienceStoreEventTalk2(){
		game.currentDialogue = "crushConvenienceStoreEventTalk2";
		game.diatextTracker = 122;
		csm.city2RainCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventTalk3";
	}
	public void crushConvenienceStoreEventTalk3(){
		game.currentDialogue = "crushConvenienceStoreEventTalk3";
		game.diatextTracker = 123;
		csm.city2RainCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventTalk4";
	}
	public void crushConvenienceStoreEventTalk4(){
		game.currentDialogue = "crushConvenienceStoreEventTalk4";
		game.diatextTracker = 124;
		csm.city2RainCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventTalk5";
	}
	public void crushConvenienceStoreEventTalk5(){
		game.currentDialogue = "crushConvenienceStoreEventTalk5";
		game.diatextTracker = 125;
		csm.city2RainCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventTalk6";
	}
	public void crushConvenienceStoreEventTalk6(){
		game.currentDialogue = "crushConvenienceStoreEventTalk6";
		game.diatextTracker = 126;
		csm.city2RainCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventTalk7";
	}
	public void crushConvenienceStoreEventTalk7(){
		game.currentDialogue = "crushConvenienceStoreEventTalk7";
		game.diatextTracker = 127;
		csm.city2RainCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventTalk8";
	}
	public void crushConvenienceStoreEventTalk8(){
		game.currentDialogue = "crushConvenienceStoreEventTalk8";
		game.diatextTracker = 128;
		csm.city2RainCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventTalkEnd";
	}
	public void crushConvenienceStoreEventTalkEnd(){
		game.currentDialogue = "crushConvenienceStoreEventTalkEnd";
		game.diatextTracker = 129;
		csm.ConvenienceStoreCutsceneLoad();
		ui.npcName.setText("Store Clerk");
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventTalkEnd1";
	}
	public void crushConvenienceStoreEventTalkEnd1(){
		game.currentDialogue = "crushConvenienceStoreEventTalkEnd1";
		game.diatextTracker = 130;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventWait";
	}

	public void crushConvenienceStoreEventWait(){
		game.currentDialogue = "crushConvenienceStoreEventWait";
		game.diatextTracker = 131;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventWait1";
	}
	public void crushConvenienceStoreEventWait1(){
		game.currentDialogue = "crushConvenienceStoreEventWait1";
		game.diatextTracker = 132;
		csm.ConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventWait2";
	}
	public void crushConvenienceStoreEventWait2(){
		game.currentDialogue = "crushConvenienceStoreEventWait2";
		game.diatextTracker = 133;
		csm.ConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventNotes";
	}

	//Trying to decipher the code
	public void crushConvenienceStoreEventNotes(){
		game.currentDialogue = "crushConvenienceStoreEventNotes";
		game.diatextTracker = 134;
		csm.ConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventNotes1";
	}
	public void crushConvenienceStoreEventNotes1(){
		game.currentDialogue = "crushConvenienceStoreEventNotes1";
		game.diatextTracker = 135;
		csm.ConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventNotes2";
	}
	public void crushConvenienceStoreEventNotes2(){
		game.currentDialogue = "crushConvenienceStoreEventWait2";
		game.diatextTracker = 136;
		csm.ConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventNotes3";
	}
	public void crushConvenienceStoreEventNotes3(){
		game.currentDialogue = "crushConvenienceStoreEventNotes3";
		game.diatextTracker = 137;
		csm.ConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventNotes4";
	}
	public void crushConvenienceStoreEventNotes4(){
		game.currentDialogue = "crushConvenienceStoreEventNotes4";
		game.diatextTracker = 138;
		csm.ConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventNotes5";
	}
	public void crushConvenienceStoreEventNotes5(){
		game.currentDialogue = "crushConvenienceStoreEventNotes5";
		game.diatextTracker = 139;
		csm.ConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStorePreFifthLessonTalk";
	}

	//Pre lesson talk
	public void crushConvenienceStorePreFifthLessonTalk(){
		game.currentDialogue = "crushConvenienceStorePreFifthLessonTalk";
		game.diatextTracker = 140;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStorePreFifthLessonTalk1";
	}
	public void crushConvenienceStorePreFifthLessonTalk1(){
		game.currentDialogue = "crushConvenienceStorePreFifthLessonTalk1";
		game.diatextTracker = 141;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStorePreFifthLessonTalk2";
	}
	public void crushConvenienceStorePreFifthLessonTalk2(){
		game.currentDialogue = "crushConvenienceStorePreFifthLessonTalk2";
		game.diatextTracker = 142;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStorePreFifthLessonTalk3";
	}
	public void crushConvenienceStorePreFifthLessonTalk3(){
		game.currentDialogue = "crushConvenienceStorePreFifthLessonTalk3";
		game.diatextTracker = 143;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStorePreFifthLessonTalk4";
	}
	public void crushConvenienceStorePreFifthLessonTalk4(){
		game.currentDialogue = "crushConvenienceStorePreFifthLessonTalk4";
		game.diatextTracker = 144;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStorePreFifthLessonTalk5";
	}
	public void crushConvenienceStorePreFifthLessonTalk5(){
		game.currentDialogue = "crushConvenienceStorePreFifthLessonTalk5";
		game.diatextTracker = 145;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStorePreFifthLessonTalk6";
	}
	public void crushConvenienceStorePreFifthLessonTalk6(){
		game.currentDialogue = "crushConvenienceStorePreFifthLessonTalk6";
		game.diatextTracker = 146;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStorePreFifthLessonTalk7";
	}
	public void crushConvenienceStorePreFifthLessonTalk7(){
		game.currentDialogue = "crushConvenienceStorePreFifthLessonTalk7";
		game.diatextTracker = 147;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStorePreFifthLessonTalk8";
	}
	public void crushConvenienceStorePreFifthLessonTalk8(){
		game.currentDialogue = "crushConvenienceStorePreFifthLessonTalk8";
		game.diatextTracker = 148;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStorePreFifthLessonTalk9";
	}
	public void crushConvenienceStorePreFifthLessonTalk9(){
		game.currentDialogue = "crushConvenienceStorePreFifthLessonTalk9";
		game.diatextTracker = 149;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStorePreFifthLessonTalk10";
	}
	public void crushConvenienceStorePreFifthLessonTalk10(){
		game.currentDialogue = "crushConvenienceStorePreFifthLessonTalk10";
		game.diatextTracker = 150;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStorePreFifthLessonTalkEnd";
	}
	public void crushConvenienceStorePreFifthLessonTalkEnd(){
		game.currentDialogue = "crushConvenienceStorePreFifthLessonTalkEnd";
		game.diatextTracker = 151;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreFifthLessonStart";
	}

	//Lesson Proper
	public void crushConvenienceStoreFifthLessonStart(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonStart";
		game.diatextTracker = 152;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreFifthLesson1";
	}
	public void crushConvenienceStoreFifthLesson1(){
		game.currentDialogue = "crushConvenienceStoreFifthLesson1";
		game.diatextTracker = 153;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreFifthLesson2";
	}
	public void crushConvenienceStoreFifthLesson2(){
		game.currentDialogue = "crushConvenienceStoreFifthLesson2";
		game.diatextTracker = 154;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreFifthLesson3";
	}
	public void crushConvenienceStoreFifthLesson3(){
		game.currentDialogue = "crushConvenienceStoreFifthLesson3";
		game.diatextTracker = 155;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreFifthLesson4";
	}
	public void crushConvenienceStoreFifthLesson4(){
		game.currentDialogue = "crushConvenienceStoreFifthLesson4";
		game.diatextTracker = 156;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreFifthLesson5";
	}
	public void crushConvenienceStoreFifthLesson5(){
		game.currentDialogue = "crushConvenienceStoreFifthLesson5";
		game.diatextTracker = 157;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreFifthLesson6";
	}
	public void crushConvenienceStoreFifthLesson6(){
		game.currentDialogue = "crushConvenienceStoreFifthLesson6";
		game.diatextTracker = 158;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreFifthLesson7";
	}
	public void crushConvenienceStoreFifthLesson7(){
		game.currentDialogue = "crushConvenienceStoreFifthLesson7";
		game.diatextTracker = 159;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreFifthLessonEnd";
	}
	public void crushConvenienceStoreFifthLessonEnd(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonEnd";
		game.diatextTracker = 160;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion1";
	}

	//Scene Two: Fifth Lesson - Electron Configuration (Long Method) Questions
	//Question 1
	public void crushConvenienceStoreFifthLessonQuestion1(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion1";
		game.currentQuestion = "crushConvenienceStoreFifthLessonQuestion1";
		game.questiontextTracker = 23;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
		game.calculateTimer.start();
			game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion1Load";
	}
	public void crushConvenienceStoreFifthLessonQuestion1Load(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion1Load";
		game.diatextTracker = 161;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
		answer = gameStory.playerAnswerInput.strip();
		finalAnswer = answer.trim();

		switch(finalAnswer){
			case "1s2 2s2 2p4":
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion1Right";
				break;
			default:
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion1Wrong";
				break;
		}
	}
	//Question 1 Results
	public void crushConvenienceStoreFifthLessonQuestion1Right(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion1Right";
		game.diatextTracker = 162;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "/" + playerStats.neededXP + "<center><html>");
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion2";
	}
	public void crushConvenienceStoreFifthLessonQuestion1Wrong(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion1Wrong";
		game.diatextTracker = 163;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 4;
			gameStory.selectedWrong();
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion2";
	}

	//Question 2
	public void crushConvenienceStoreFifthLessonQuestion2(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion2";
		game.currentQuestion = "crushConvenienceStoreFifthLessonQuestion2";
		game.questiontextTracker = 24;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
		game.calculateTimer.start();
			game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion2Load";
	}
	public void crushConvenienceStoreFifthLessonQuestion2Load(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion2Load";
		game.diatextTracker = 164;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
		answer = gameStory.playerAnswerInput.strip();
		finalAnswer = answer.trim();

		switch(finalAnswer){
			case "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p2":
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion2Right"; 
				break;
			default:
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion2Wrong";
				break;
		}
	}
	//Question 2 Results
	public void crushConvenienceStoreFifthLessonQuestion2Right(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion2Right";
		game.diatextTracker = 165;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "/" + playerStats.neededXP + "<center><html>");
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion3";
	}
	public void crushConvenienceStoreFifthLessonQuestion2Wrong(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion2Wrong";
		game.diatextTracker = 166;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 4;
			gameStory.selectedWrong();
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion3";
	}

	//Question 3
	public void crushConvenienceStoreFifthLessonQuestion3(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion3";
		game.currentQuestion = "crushConvenienceStoreFifthLessonQuestion3";
		game.questiontextTracker = 25;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
		game.calculateTimer.start();
			game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion3Load";
	}
	public void crushConvenienceStoreFifthLessonQuestion3Load(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion3Load";
		game.diatextTracker = 167;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
		answer = gameStory.playerAnswerInput.strip();
		finalAnswer = answer.trim();

		switch(finalAnswer){
			case "1s2 2s2 2p6 3s2 3p4":
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion3Right"; 
				break;
			default:
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion3Wrong";
				break;
		}
	}
	//Question 3 Results
	public void crushConvenienceStoreFifthLessonQuestion3Right(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion3Right";
		game.diatextTracker = 168;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "/" + playerStats.neededXP + "<center><html>");
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion4";
	}
	public void crushConvenienceStoreFifthLessonQuestion3Wrong(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion3Wrong";
		game.diatextTracker = 169;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 4;
			gameStory.selectedWrong();
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion4";
	}

	//Question 4
	public void crushConvenienceStoreFifthLessonQuestion4(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion4";
		game.currentQuestion = "crushConvenienceStoreFifthLessonQuestion4";
		game.questiontextTracker = 26;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
		game.calculateTimer.start();
			game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion4Load";
	}
	public void crushConvenienceStoreFifthLessonQuestion4Load(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion4Load";
		game.diatextTracker = 170;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
		answer = gameStory.playerAnswerInput.strip();
		finalAnswer = answer.trim();

		switch(finalAnswer){
			case "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6":
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion4Right"; 
				break;
			default:
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion4Wrong";
				break;
		}
	}
	//Question 4 Results
	public void crushConvenienceStoreFifthLessonQuestion4Right(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion4Right";
		game.diatextTracker = 171;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "/" + playerStats.neededXP + "<center><html>");
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion5";
	}
	public void crushConvenienceStoreFifthLessonQuestion4Wrong(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion4Wrong";
		game.diatextTracker = 172;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 4;
			gameStory.selectedWrong();
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion5";
	}

	//Question 5
	public void crushConvenienceStoreFifthLessonQuestion5(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion5";
		game.currentQuestion = "crushConvenienceStoreFifthLessonQuestion5";
		game.questiontextTracker = 27;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
		game.calculateTimer.start();
			game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion5Load";
	}
	public void crushConvenienceStoreFifthLessonQuestion5Load(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion5Load";
		game.diatextTracker = 173;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
		answer = gameStory.playerAnswerInput.strip();
		finalAnswer = answer.trim();

		switch(finalAnswer){
			case "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p6 6s2 4f14 5d10 6p6":
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion5Right"; 
				break;
			default:
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion5Wrong";
				break;
		}
	}
	//Question 5 Results
	public void crushConvenienceStoreFifthLessonQuestion5Right(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion5Right";
		game.diatextTracker = 174;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "/" + playerStats.neededXP + "<center><html>");
				game.nextDialogue = "";
	}
	public void crushConvenienceStoreFifthLessonQuestion5Wrong(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestion5Wrong";
		game.diatextTracker = 175;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 4;
			gameStory.selectedWrong();
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestionsEnd";
	}
	public void crushConvenienceStoreFifthLessonQuestionsEnd(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonQuestionsEnd";
		game.diatextTracker = 176;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
				game.nextDialogue = "crushConvenienceStoreFifthLessonBreak";
	}
	public void crushConvenienceStoreFifthLessonBreak(){
		game.currentDialogue = "crushConvenienceStoreFifthLessonBreak";
		game.diatextTracker = 177;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.mainTextArea.setFont(game.narrationFont);
			game.startDialogue();
				game.nextDialogue = "crushConvenienceStoreSixthLessonStart";
	}

	public void crushConvenienceStoreSixthLessonStart(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonStart";
		game.diatextTracker = 178;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson1";
	}
	public void crushConvenienceStoreSixthLesson1(){
		game.currentDialogue = "crushConvenienceStoreSixthLesson1";
		game.diatextTracker = 179;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson2";
	}
	public void crushConvenienceStoreSixthLesson2(){
		game.currentDialogue = "crushConvenienceStoreSixthLesson2";
		game.diatextTracker = 180;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson3";
	}
	public void crushConvenienceStoreSixthLesson3(){
		game.currentDialogue = "crushConvenienceStoreSixthLesson3";
		game.diatextTracker = 181;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson4";
	}
	public void crushConvenienceStoreSixthLesson4(){
		game.currentDialogue = "crushConvenienceStoreSixthLesson4";
		game.diatextTracker = 182;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson5";
	}
	public void crushConvenienceStoreSixthLesson5(){
		game.currentDialogue = "crushConvenienceStoreSixthLesson5";
		game.diatextTracker = 183;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson6";
	}
	public void crushConvenienceStoreSixthLesson6(){
		game.currentDialogue = "crushConvenienceStoreSixthLesson6";
		game.diatextTracker = 184;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson7";
	}
	public void crushConvenienceStoreSixthLesson7(){
		game.currentDialogue = "crushConvenienceStoreSixthLesson7";
		game.diatextTracker = 185;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson8";
	}
	public void crushConvenienceStoreSixthLesson8(){
		game.currentDialogue = "crushConvenienceStoreSixthLesson8";
		game.diatextTracker = 186;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson9";
	}
	public void crushConvenienceStoreSixthLesson9(){
		game.currentDialogue = "crushConvenienceStoreSixthLesson9";
		game.diatextTracker = 187;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.mainTextArea.setFont(game.narrationFont);
			game.startDialogue();
				game.nextDialogue = "crushConvenienceStoreSixthLesson10";	
	}
	public void crushConvenienceStoreSixthLesson10(){
		game.currentDialogue = "crushConvenienceStoreSixthLesson10";
		game.diatextTracker = 188;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson11";
	}
}