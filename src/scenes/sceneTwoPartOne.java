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

public class sceneTwoPartOne {

    Game game; UserInterface ui;
	TransitionClass sceneChanger; soundManager sm;
	playerStats player; storyLines lines; ImageManager images;
	ChoiceHandler cHandler; MouseHandler mHandler; 
	KeyboardHandler kbHandler; NameHandler nHandler;
	CutsceneMaker cutScene;

    String answer;

	public sceneTwoPartOne(Game game, UserInterface ui, TransitionClass sceneChanger, soundManager sm,
						playerStats player, storyLines lines, ImageManager imgManage, int screenWidth, int screenHeight)
	{
		this.game = game; this.ui = ui; this.sceneChanger = sceneChanger; this.sm = sm;
		this.player = player; this.lines = lines; this.images = imgManage; 
	}

	public void city2CutsceneLoad(){
		ui.npcName.setText(null);
		sceneChanger.showDialogue();
		CutsceneMaker city2Cutscene = new CutsceneMaker("city2.jpg", "placeholder.png", "placeholder.png", 
                                                            "placeholder.png", 1.0f, 0.0f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
            player.checkLevel();
	}
	public void city2DarkCutsceneLoad(){
		ui.npcName.setText(null);
		sceneChanger.showDialogue();
		CutsceneMaker city2DarkCutscene = new CutsceneMaker("city2.jpg", "placeholder.png", "placeholder.png", 
															"placeholder.png", 1.0f, 0.0f, 0.35f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
	}
	public void busStopLoad(){
		ui.npcName.setText(null);
		sceneChanger.showDialogue();
		CutsceneMaker busStopCutscene = new CutsceneMaker("busstop.png", "placeholder.png", "placeholder.png", 
															"buncee_raineffect.gif", 1.0f, 0.0f, 0.75f, 1.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
	}
	public void crushBusStopCutsceneLoad(){
        ui.npcName.setText("Crush");
		sceneChanger.showDialogue();
		CutsceneMaker crushBusStopCutscene = new CutsceneMaker("busstop.png", "nickaBondSprite.png", "placeholder.png", 
                                                            "buncee_raineffect.gif", 1.0f, 1.0f, 0.0f, 1.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
            player.checkLevel();
	}

	public void walkToSchool1(){
		game.currentDialogue = "walkToSchool1";
		game.diatextTracker = 84;
		city2CutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool2";
	}
	public void walkToSchool2(){
		game.currentDialogue = "walkToSchool2";
		game.diatextTracker = 85;
		city2CutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool3";
	}
	public void walkToSchool3(){
		game.currentDialogue = "walkToSchool3";
		game.diatextTracker = 86;
		city2CutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool4";
	}
	public void walkToSchool4(){
		game.currentDialogue = "walkToSchool4";
		game.diatextTracker = 87;
		city2CutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool5";
	}
	public void walkToSchool5(){
		game.currentDialogue = "walkToSchool5";
		game.diatextTracker = 88;
		city2CutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool6";
	}
	public void walkToSchool6(){
		game.currentDialogue = "walkToSchool6";
		game.diatextTracker = 89;
		city2DarkCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool7";
	}
	public void walkToSchool7(){
		game.currentDialogue = "walkToSchool7";
		game.diatextTracker = 90;
		busStopLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool8";
	}
	public void walkToSchool8(){
		game.currentDialogue = "walkToSchool8";
		game.diatextTracker = 91;
		busStopLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool9";
	}
	public void walkToSchool9(){
		game.currentDialogue = "walkToSchool9";
		game.diatextTracker = 92;
		busStopLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "doInspectCommotion";
	}

	public void doInspectCommotion(){
		game.currentDialogue = "doInspectCommotion";
		game.currentQuestion = "doInspectCommotion";
		game.questiontextTracker = 23;
		busStopLoad();
		ui.npcName.setText(null);
		ui.dialogueBox.setText(null);
		ui.dialoguePanel.setVisible(false);
		ui.mainTextArea.setFont(game.narrationFont);
		ui.mainTextArea.setText("");
		game.choiceTimer.start();
			ui.choice1.setText("Inspect commotion");
			ui.choice2.setText("Mind your own business");
			ui.choicePanel.remove(ui.choice3);
			ui.choicePanel.remove(ui.choice4);
		
			game.nextPosition1 = "crushBusStopEventStarted";
			game.nextPosition2 = "crushBusStopEventIgnored";
	}

	public void crushBusStopEventStarted(){
		game.currentDialogue = "crushBusStopEventStarted";
		game.diatextTracker = 93;
		busStopLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEvent1";
	}

	public void crushBusStopEvent1(){
		game.currentDialogue = "crushBusStopEvent1";
		game.diatextTracker = 94;
		busStopLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEvent2";
	}
	public void crushBusStopEvent2(){
		ui.npcName.setText("???");
		game.currentDialogue = "crushBusStopEvent2";
		game.diatextTracker = 95;
		busStopLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEvent3";
	}
	public void crushBusStopEvent3(){
		game.currentDialogue = "crushBusStopEvent3";
		game.diatextTracker = 96;
		busStopLoad();
		ui.npcName.setText("???");
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEvent4";
	}
	public void crushBusStopEvent4(){
		game.currentDialogue = "crushBusStopEvent4";
		game.diatextTracker = 97;
		busStopLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopDecision";
	}

	public void crushBusStopDecision(){
		game.currentDialogue = "crushBusStopDecision";
		game.currentQuestion = "crushBusStopDecision";
		game.questiontextTracker = 24;
		busStopLoad();
		ui.npcName.setText(null);
		ui.dialogueBox.setText(null);
		ui.dialoguePanel.setVisible(false);
		ui.mainTextArea.setFont(game.narrationFont);
		ui.mainTextArea.setText("");
		game.choiceTimer.start();
			ui.choice1.setText("Approach " + Game.gender3);
			ui.choice2.setText("Mind your own business");
			ui.choicePanel.remove(ui.choice3);
			ui.choicePanel.remove(ui.choice4);
		
			game.nextPosition1 = "crushBusStopEventApproach";
			game.nextPosition2 = "crushBusStopEventIgnored";
	}

	public void crushBusStopEventApproach(){
		game.currentDialogue = "crushBusStopEventApproach";
		game.diatextTracker = 98;
		crushBusStopCutsceneLoad();
		ui.npcName.setText(null);
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventApproach1";
	}
	public void crushBusStopEventApproach1(){
		game.currentDialogue = "crushBusStopEventApproach1";
		game.diatextTracker = 99;
		crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventApproach2";
	}
	public void crushBusStopEventApproach2(){
		game.currentDialogue = "crushBusStopEventApproach2";
		game.diatextTracker = 100;
		crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopDecision1";
	}
	
	public void crushBusStopDecision1(){
		game.currentDialogue = "crushBusStopDecision1";
		game.currentQuestion = "crushBusStopDecision1";
		game.questiontextTracker = 25;
		crushBusStopCutsceneLoad();
		ui.dialogueBox.setText(null);
		ui.dialoguePanel.setVisible(false);
		ui.mainTextArea.setFont(game.normalFont);
		ui.mainTextArea.setText("");
		game.choiceTimer.start();
			ui.choice1.setText("I was just watching you.");
			ui.choice2.setText("I was just passing by!");
			ui.choice3.setText("I heard a noise and followed it here.");
			ui.choice4.setText("...");
		
			game.nextPosition1 = "crushBusStopEventWatching";
			game.nextPosition2 = "crushBusStopEventPassing";
			game.nextPosition3 = "crushBusStopEventInspecting";
			game.nextPosition4 = "crushBusStopEventSilenced";
	}

	public void crushBusStopEventWatching(){
		game.currentDialogue = "crushBusStopEventWatching";
		game.diatextTracker = 101;
		crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopDecision2";
	}

	public void crushBusStopEventPassing(){
		game.currentDialogue = "crushBusStopEventPassing";
		game.diatextTracker = 102;
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopDecision2";
	}

	public void crushBusStopEventInspecting(){
		game.currentDialogue = "crushBusStopEventInspecting";
		game.diatextTracker = 103;
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopDecision2";
	}
	public void crushBusStopEventSilenced(){
		game.currentDialogue = "crushBusStopEventSilenced";
		game.diatextTracker = 104;
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopDecision2";
	}

	public void crushBusStopDecision2(){
		game.currentDialogue = "crushBusStopDecision2";
		game.currentQuestion = "crushBusStopDecision2";
		game.questiontextTracker = 26;
		busStopLoad();
		ui.npcName.setText(null);
		ui.dialogueBox.setText(null);
		ui.dialoguePanel.setVisible(false);
		ui.mainTextArea.setFont(game.narrationFont);
		ui.mainTextArea.setText("");
		game.choiceTimer.start();
			ui.choice1.setText("No! It's not what it seems!");
			ui.choice2.setText("What if I was stalking you?");
			ui.choice3.setText("Your noise made me curious!");
			ui.choice4.setText("...");
		
			game.nextPosition1 = "crushBusStopEventExplainGood";
			game.nextPosition2 = "crushBusStopEventExplainBad";
			game.nextPosition3 = "crushBusStopEventExplainNeutral";
			game.nextPosition4 = "crushBusStopEventExplainSilence";
	}

	public void crushBusStopEventExplainGood(){
		game.currentDialogue = "crushBusStopEventExplainGood";
		game.diatextTracker = 105;
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventExplainGood1";
	}
	public void crushBusStopEventExplainBad(){
		game.currentDialogue = "crushBusStopEventExplainBad";
	}
	public void crushBusStopEventExplainNeutral(){
		game.currentDialogue = "crushBusStopEventExplainNeutral";
	}
	public void crushBusStopEventExplainSilence(){
		game.currentDialogue = "crushBusStopEventExplainSilence";
	}

	public void crushBusStopDecision3(){

	}
}
