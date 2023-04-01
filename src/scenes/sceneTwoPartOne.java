package scenes;

import mainPackage.Game;
import mainPackage.ImageManager;
import mainPackage.TransitionClass;
import mainPackage.UserInterface;
import mainPackage.playerStats;
import mainPackage.soundManager;
import mainPackage.storyLines;
import mainPackage.Game.ChoiceHandler;
import mainPackage.Game.KeyboardHandler;
import mainPackage.Game.MouseHandler;
import mainPackage.Game.NameHandler;

import mainPackage.CutsceneMaker;
import mainPackage.CutsceneManager;

public class sceneTwoPartOne {

    Game game; UserInterface ui;
	TransitionClass sceneChanger; soundManager sm;
	playerStats player; storyLines lines; ImageManager images;
	ChoiceHandler cHandler; MouseHandler mHandler; 
	KeyboardHandler kbHandler; NameHandler nHandler;
	CutsceneMaker cutScene; CutsceneManager csm;

    String answer;

	public sceneTwoPartOne(Game game, UserInterface ui, TransitionClass sceneChanger, soundManager sm,
						playerStats player, storyLines lines, ImageManager imgManage, int screenWidth, int screenHeight, CutsceneManager csmanager)
	{
		this.game = game; this.ui = ui; this.sceneChanger = sceneChanger; this.sm = sm;
		this.player = player; this.lines = lines; this.images = imgManage; csm = csmanager;
	}

	public void walkToSchool1(){
		game.currentDialogue = "walkToSchool1";
		game.diatextTracker = 84;
		csm.city1CutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool2";
	}
	public void walkToSchool2(){
		game.currentDialogue = "walkToSchool2";
		game.diatextTracker = 85;
		csm.city1CutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool3";
	}
	public void walkToSchool3(){
		game.currentDialogue = "walkToSchool3";
		game.diatextTracker = 86;
		csm.city1CutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool4";
	}
	public void walkToSchool4(){
		game.currentDialogue = "walkToSchool4";
		game.diatextTracker = 87;
		csm.city1CutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool5";
	}
	public void walkToSchool5(){
		game.currentDialogue = "walkToSchool5";
		game.diatextTracker = 88;
		csm.city2CutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool6";
	}
	public void walkToSchool6(){
		game.currentDialogue = "walkToSchool6";
		game.diatextTracker = 89;
		csm.city2DarkCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool7";
	}
	public void walkToSchool7(){
		game.currentDialogue = "walkToSchool7";
		game.diatextTracker = 90;
		csm.busStopLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool8";
	}
	public void walkToSchool8(){
		game.currentDialogue = "walkToSchool8";
		game.diatextTracker = 91;
		csm.busStopLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "walkToSchool9";
	}
	public void walkToSchool9(){
		game.currentDialogue = "walkToSchool9";
		game.diatextTracker = 92;
		csm.busStopLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventStarted";
	}

	public void crushBusStopEventStarted(){
		game.currentDialogue = "crushBusStopEventStarted";
		game.diatextTracker = 93;
		csm.busStopLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEvent1";
	}
	public void crushBusStopEvent1(){
		game.currentDialogue = "crushBusStopEvent1";
		game.diatextTracker = 94;
		csm.busStopLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEvent2";
	}
	public void crushBusStopEvent2(){
		game.currentDialogue = "crushBusStopEvent2";
		game.diatextTracker = 95;
		csm.busStopLoad();
		ui.npcName.setText("???");
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEvent3";
	}
	public void crushBusStopEvent3(){
		game.currentDialogue = "crushBusStopEvent3";
		game.diatextTracker = 96;
		csm.busStopLoad();
		ui.npcName.setText("???");
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEvent4";
	}
	public void crushBusStopEvent4(){
		game.currentDialogue = "crushBusStopEvent4";
		game.diatextTracker = 97;
		csm.busStopLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventApproach";
	}

	public void crushBusStopEventApproach(){
		game.currentDialogue = "crushBusStopEventApproach";
		game.diatextTracker = 98;
		csm.blackScreen();
		ui.npcName.setText(null);
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventApproach1";
	}
	public void crushBusStopEventApproach1(){
		game.currentDialogue = "crushBusStopEventApproach1";
		game.diatextTracker = 99;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventApproach2";
	}
	public void crushBusStopEventApproach2(){
		game.currentDialogue = "crushBusStopEventApproach2";
		game.diatextTracker = 100;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventApproach3";
	}
	public void crushBusStopEventApproach3(){
		game.currentDialogue = "crushBusStopEventApproach3";
		game.diatextTracker = 101;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		ui.npcName.setText(null);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk";
	}

	public void crushBusStopEventTalk(){
		game.currentDialogue = "crushBusStopEventTalk";
		game.diatextTracker = 102;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		ui.npcName.setText(null);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk1";
	}
	public void crushBusStopEventTalk1(){
		game.currentDialogue = "crushBusStopEventTalk1";
		game.diatextTracker = 103;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk2";
	}
	public void crushBusStopEventTalk2(){
		game.currentDialogue = "crushBusStopEventTalk2";
		game.diatextTracker = 104;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk3";
	}
	public void crushBusStopEventTalk3(){
		game.currentDialogue = "crushBusStopEventTalk3";
		game.diatextTracker = 105;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		ui.npcName.setText(null);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk4";
	}
	public void crushBusStopEventTalk4(){
		game.currentDialogue = "crushBusStopEventTalk4";
		game.diatextTracker = 106;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk5";
	}
	public void crushBusStopEventTalk5(){
		game.currentDialogue = "crushBusStopEventTalk5";
		game.diatextTracker = 107;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		ui.npcName.setText(null);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk6";
	}
	public void crushBusStopEventTalk6(){
		game.currentDialogue = "crushBusStopEventTalk6";
		game.diatextTracker = 108;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		ui.npcName.setText(null);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk7";
	}
	public void crushBusStopEventTalk7(){
		game.currentDialogue = "crushBusStopEventTalk7";
		game.diatextTracker = 109;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		ui.npcName.setText(null);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk8";
	}
	public void crushBusStopEventTalk8(){
		game.currentDialogue = "crushBusStopEventTalk8";
		game.diatextTracker = 110;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		ui.npcName.setText(null);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk9";
	}
	public void crushBusStopEventTalk9(){
		game.currentDialogue = "crushBusStopEventTalk9";
		game.diatextTracker = 111;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		ui.npcName.setText(null);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk10";
	}
	public void crushBusStopEventTalk10(){
		game.currentDialogue = "crushBusStopEventTalk10";
		game.diatextTracker = 112;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		ui.npcName.setText(null);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk11";
	}
	public void crushBusStopEventTalk11(){
		game.currentDialogue = "crushBusStopEventTalk11";
		game.diatextTracker = 113;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk12";
	}
	public void crushBusStopEventTalk12(){
		game.currentDialogue = "crushBusStopEventTalk12";
		game.diatextTracker = 114;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		ui.npcName.setText(null);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk13";
	}
	public void crushBusStopEventTalk13(){
		game.currentDialogue = "crushBusStopEventTalk13";
		game.diatextTracker = 115;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk14";
	}
	public void crushBusStopEventTalk14(){
		game.currentDialogue = "crushBusStopEventTalk14";
		game.diatextTracker = 116;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		ui.npcName.setText(null);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk15";
	}
	public void crushBusStopEventTalk15(){
		game.currentDialogue = "crushBusStopEventTalk15";
		game.diatextTracker = 117;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushBusStopEventTalk16";
	}
	public void crushBusStopEventTalk16(){
		game.currentDialogue = "crushBusStopEventTalk16";
		game.diatextTracker = 118;
		csm.crushBusStopCutsceneLoad();
		ui.mainTextArea.setFont(game.narrationFont);
		ui.npcName.setText(null);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreEventStart";
	}
}
