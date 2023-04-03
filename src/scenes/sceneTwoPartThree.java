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

public class sceneTwoPartThree {

    Game game; UserInterface ui;
	TransitionClass sceneChanger; soundManager sm;
	playerStats player; storyLines lines; ImageManager images;
	ChoiceHandler cHandler; MouseHandler mHandler; 
	KeyboardHandler kbHandler; NameHandler nHandler;
	CutsceneMaker cutScene; CutsceneManager csm;

	public String spriteToLoad;
    String answer, finalAnswer;
	int FifthLessonCorrectItems = 0;

	public sceneTwoPartThree(Game game, UserInterface ui, TransitionClass sceneChanger, soundManager sm,
						playerStats player, storyLines lines, ImageManager imgManage, int screenWidth, int screenHeight, CutsceneManager csmanager)
	{
		this.game = game; this.ui = ui; this.sceneChanger = sceneChanger; this.sm = sm;
		this.player = player; this.lines = lines; this.images = imgManage; csm = csmanager;
	}

    public void crushConvenienceStoreSixthLesson11(){
		game.currentDialogue = "crushConvenienceStoreSixthLesson11";
		game.diatextTracker = 189;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.mainTextArea.setFont(game.narrationFont);
			game.startDialogue();
				game.nextDialogue = "crushConvenienceStoreSixthLesson12";	
    }
    public void crushConvenienceStoreSixthLesson12(){
        game.currentDialogue = "crushConvenienceStoreSixthLesson12";
		game.diatextTracker = 190;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson13";
    }
    public void crushConvenienceStoreSixthLesson13(){
        game.currentDialogue = "crushConvenienceStoreSixthLesson13";
		game.diatextTracker = 191;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson14";
    }
    public void crushConvenienceStoreSixthLesson14(){
        game.currentDialogue = "crushConvenienceStoreSixthLesson14";
		game.diatextTracker = 192;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson15";
    }
    public void crushConvenienceStoreSixthLesson15(){
        game.currentDialogue = "crushConvenienceStoreSixthLesson15";
		game.diatextTracker = 193;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson16";
    }
    public void crushConvenienceStoreSixthLesson16(){
        game.currentDialogue = "crushConvenienceStoreSixthLesson16";
		game.diatextTracker = 194;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson17";
    }
    public void crushConvenienceStoreSixthLesson17(){
        game.currentDialogue = "crushConvenienceStoreSixthLesson17";
		game.diatextTracker = 195;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLessonDisrupt";
    }

    //Some opening up 
    public void crushConvenienceStoreSixthLessonDisrupt(){
        game.currentDialogue = "crushConvenienceStoreSixthLessonDisrupt";
		game.diatextTracker = 196;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.mainTextArea.setFont(game.narrationFont);
			game.startDialogue();
				game.nextDialogue = "crushConvenienceStoreSixthLessonDisrupt1";	
    }
    public void crushConvenienceStoreSixthLessonDisrupt1(){
        game.currentDialogue = "crushConvenienceStoreSixthLessonDisrupt1";
		game.diatextTracker = 197;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLessonDisrupt2";
    }
    public void crushConvenienceStoreSixthLessonDisrupt2(){
        game.currentDialogue = "crushConvenienceStoreSixthLessonDisrupt2";
		game.diatextTracker = 198;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.mainTextArea.setFont(game.narrationFont);
			game.startDialogue();
				game.nextDialogue = "crushConvenienceStoreSixthLessonDisrupt3";	
    }
    public void crushConvenienceStoreSixthLessonDisrupt3(){
        game.currentDialogue = "crushConvenienceStoreSixthLessonDisrupt3";
		game.diatextTracker = 199;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLessonDisrupt4";
    }
    public void crushConvenienceStoreSixthLessonDisrupt4(){
        game.currentDialogue = "crushConvenienceStoreSixthLessonDisrupt4";
		game.diatextTracker = 200;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.mainTextArea.setFont(game.narrationFont);
			game.startDialogue();
				game.nextDialogue = "crushConvenienceStoreSixthLesson18";	
    }

    //Lesson continuation
    public void crushConvenienceStoreSixthLesson18(){
        game.currentDialogue = "crushConvenienceStoreSixthLesson18";
		game.diatextTracker = 201;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson19";
    }
    public void crushConvenienceStoreSixthLesson19(){
        game.currentDialogue = "crushConvenienceStoreSixthLesson19";
		game.diatextTracker = 202;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson20";
    }
    public void crushConvenienceStoreSixthLesson20(){
        game.currentDialogue = "crushConvenienceStoreSixthLesson20";
		game.diatextTracker = 203;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson21";
    }
    public void crushConvenienceStoreSixthLesson21(){
        game.currentDialogue = "crushConvenienceStoreSixthLesson21";
		game.diatextTracker = 204;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson22";
    }
    public void crushConvenienceStoreSixthLesson22(){
        game.currentDialogue = "crushConvenienceStoreSixthLesson22";
		game.diatextTracker = 205;
		csm.crushConvenienceStoreCutsceneLoad();
		ui.npcName.setText(storyLines.SOName);
		ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
			game.nextDialogue = "crushConvenienceStoreSixthLesson23";
    }
    public void crushConvenienceStoreSixthLesson23(){
        game.currentDialogue = "crushConvenienceStoreSixthLesson23";
		game.diatextTracker = 206;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.mainTextArea.setFont(game.narrationFont);
			game.startDialogue();
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion1";	
    }

    //Question Start about Lesson Six: Noble Gas Configuration
    //Question1
    public void crushConvenienceStoreSixthLessonQuestion1(){
        game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion1";
		game.currentQuestion = "crushConvenienceStoreSixthLessonQuestion1";
		game.questiontextTracker = 28;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
		game.calculateTimer.start();
			game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion1Load";
    }
    public void crushConvenienceStoreSixthLessonQuestion1Load(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion1Load";
		game.diatextTracker = 207;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
		answer = gameStory.playerAnswerInput.strip();
		finalAnswer = answer.trim();

		switch(finalAnswer){
			case "[Kr] 5s1 4d10":
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion1Right";
				break;
			default:
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion1Wrong";
				break;
		}
	}
    //Question 1 Results
	public void crushConvenienceStoreSixthLessonQuestion1Right(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion1Right";
		game.diatextTracker = 208;
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
	public void crushConvenienceStoreSixthLessonQuestion1Wrong(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion1Wrong";
		game.diatextTracker = 209;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 4;
			gameStory.selectedWrong();
				game.nextDialogue = "crushConvenienceStoreFifthLessonQuestion2";
	}

    //Question 2
    public void crushConvenienceStoreSixthLessonQuestion2(){
        game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion2";
		game.currentQuestion = "crushConvenienceStoreSixthLessonQuestion2";
		game.questiontextTracker = 29;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
		game.calculateTimer.start();
			game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion2Load";
    }
	public void crushConvenienceStoreSixthLessonQuestion2Load(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion2Load";
		game.diatextTracker = 210;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
		answer = gameStory.playerAnswerInput.strip();
		finalAnswer = answer.trim();

		switch(finalAnswer){
			case "[Xe] 6s2":
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion2Right";
				break;
			default:
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion2Wrong";
				break;
		}
	}
    //Question 2 Results
	public void crushConvenienceStoreSixthLessonQuestion2Right(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion2Right";
		game.diatextTracker = 211;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "/" + playerStats.neededXP + "<center><html>");
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion3";
	}
	public void crushConvenienceStoreSixthLessonQuestion2Wrong(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion2Wrong";
		game.diatextTracker = 212;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 4;
			gameStory.selectedWrong();
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion3";
	}

    //Question 3
    public void crushConvenienceStoreSixthLessonQuestion3(){
        game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion3";
		game.currentQuestion = "crushConvenienceStoreSixthLessonQuestion3";
		game.questiontextTracker = 30;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
		game.calculateTimer.start();
			game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion3Load";
    }
	public void crushConvenienceStoreSixthLessonQuestion3Load(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion3Load";
		game.diatextTracker = 213;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
		answer = gameStory.playerAnswerInput.strip();
		finalAnswer = answer.trim();

		switch(finalAnswer){
			case "[Kr] 5s2 4d10 5p6":
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion3Right";
				break;
			default:
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion3Wrong";
				break;
		}
	}
    //Question 3 Results
	public void crushConvenienceStoreSixthLessonQuestion3Right(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion3Right";
		game.diatextTracker = 214;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "/" + playerStats.neededXP + "<center><html>");
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion4";
	}
	public void crushConvenienceStoreSixthLessonQuestion3Wrong(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion3Wrong";
		game.diatextTracker = 215;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 4;
			gameStory.selectedWrong();
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion4";
	}

    //Question 4
    public void crushConvenienceStoreSixthLessonQuestion4(){
        game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion4";
		game.currentQuestion = "crushConvenienceStoreSixthLessonQuestion4";
		game.questiontextTracker = 31;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
		game.calculateTimer.start();
			game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion4Load";
    }
	public void crushConvenienceStoreSixthLessonQuestion4Load(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion4Load";
		game.diatextTracker = 216;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
		answer = gameStory.playerAnswerInput.strip();
		finalAnswer = answer.trim();

		switch(finalAnswer){
			case "[Ar] 4s2 3d7":
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion4Right";
				break;
			default:
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion4Wrong";
				break;
		}
	}
    //Question 4 Results
	public void crushConvenienceStoreSixthLessonQuestion4Right(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion4Right";
		game.diatextTracker = 217;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "/" + playerStats.neededXP + "<center><html>");
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion5";
	}
	public void crushConvenienceStoreSixthLessonQuestion4Wrong(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion4Wrong";
		game.diatextTracker = 218;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 4;
			gameStory.selectedWrong();
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion5";
	}

    //Question 5
    public void crushConvenienceStoreSixthLessonQuestion5(){
        game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion5";
		game.currentQuestion = "crushConvenienceStoreSixthLessonQuestion5";
		game.questiontextTracker = 32;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
		game.calculateTimer.start();
			game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion5Load";
    }
	public void crushConvenienceStoreSixthLessonQuestion5Load(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion5Load";
		game.diatextTracker = 219;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
		game.startDialogue();
		answer = gameStory.playerAnswerInput.strip();
		finalAnswer = answer.trim();

		switch(finalAnswer){
			case "[Rn] 7s2 5f4":
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion5Right";
				break;
			default:
				game.nextDialogue = "crushConvenienceStoreSixthLessonQuestion5Wrong";
				break;
		}
	}
    //Question 5 Results
	public void crushConvenienceStoreSixthLessonQuestion5Right(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion1Right";
		game.diatextTracker = 220;
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
	public void crushConvenienceStoreSixthLessonQuestion5Wrong(){
		game.currentDialogue = "crushConvenienceStoreSixthLessonQuestion1Wrong";
		game.diatextTracker = 221;
			csm.crushConvenienceStoreCutsceneLoad();
			ui.npcName.setText(storyLines.SOName);
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.decreaseCP = 4;
			gameStory.selectedWrong();
				game.nextDialogue = "";
	}
}
