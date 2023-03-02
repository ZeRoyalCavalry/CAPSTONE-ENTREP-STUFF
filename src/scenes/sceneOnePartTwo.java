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

public class sceneOnePartTwo {
	
	Game game; UserInterface ui;
	TransitionClass sceneChanger; soundManager sm;
	playerStats player; storyLines lines; ImageManager images;
	ChoiceHandler cHandler; MouseHandler mHandler; 
	KeyboardHandler kbHandler; NameHandler nHandler;
	CutsceneMaker cutScene;

	public sceneOnePartTwo(Game game, UserInterface ui, TransitionClass sceneChanger, soundManager sm,
						playerStats player, storyLines lines, ImageManager imgManage, int screenWidth, int screenHeight)
	{
		this.game = game; this.ui = ui; this.sceneChanger = sceneChanger; this.sm = sm;
		this.player = player; this.lines = lines; this.images = imgManage; 
	}

    //Cutscenes or Backgrounds
	public void livingRoomCutsceneLoad(){
		sceneChanger.showDialogue();
		CutsceneMaker livingRoomCutscene = new CutsceneMaker("livingRoom.jpg", "momSprite.png", 0.75f, 1.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
	}
    public void homeBathRoomCutsceneLoad(){
		sceneChanger.showDialogue();
		CutsceneMaker homeBathRoomCutscene = new CutsceneMaker("homeRestroom.png", "placeholder.png", 0.75f, 1.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
	}

    //Transition to Third Lesson
    public void thirdLessonStart1(){
        game.currentDialogue = "thirdLessonStart1";
        game.diatextTracker = 39;
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "thirdLessonStart2";
    }
    public void thirdLessonStart2(){
        game.currentDialogue = "thirdLessonStart2";
        game.diatextTracker = 40;
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "thirdLessonStart3";
    }
    public void thirdLessonStart3(){
        game.currentDialogue = "thirdLessonStart3";
        game.diatextTracker = 41;
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "thirdLessonStart4";
    }
    public void thirdLessonStart4(){
        game.currentDialogue = "thirdLessonStart4";
        game.diatextTracker = 42;
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "thirdLessonQuestion1";
    }

    //Third Lesson Part 1 Question
    public void thirdLessonQuestion1(){
        game.currentDialogue = "thirdLessonQuestion1";
		game.currentQuestion = "thirdLessonQuestion1";

			game.questiontextTracker = 11;
			livingRoomCutsceneLoad();
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
			game.calculateTimer.start();
            sceneChanger.inputAnswer();

            if(Game.playerAnswer == "65"){
                game.nextDialogue = "thirdLesson1Right";
            }
            else{
                game.nextDialogue = "thirdLesson1Wrong";
            }
    }

    //Third Lesson Part 1 Results
	public void thirdLesson1Right(){
        game.currentDialogue = "thirdLesson1Right";
        game.diatextTracker = 43;
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
		gameStory.increaseCP = 1;
		playerStats.XP+=5;
		gameStory.selectedRight();
            UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

            game.nextDialogue = "thirdLesson1Notes";
    }
    public void thirdLesson1Wrong(){
        game.currentDialogue = "thirdLesson1Wrong";
        game.diatextTracker = 44;
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        gameStory.decreaseCP = 2;
        gameStory.selectedWrong();
            game.nextDialogue = "thirdLesson1Notes";
    }
    public void thirdLesson1Notes(){
        game.currentDialogue = "thirdLesson1Notes";
        game.diatextTracker = 45;
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "thirdLessonQuestion2";
    }
}