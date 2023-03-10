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

    String answer;

	public sceneOnePartTwo(Game game, UserInterface ui, TransitionClass sceneChanger, soundManager sm,
						playerStats player, storyLines lines, ImageManager imgManage, int screenWidth, int screenHeight)
	{
		this.game = game; this.ui = ui; this.sceneChanger = sceneChanger; this.sm = sm;
		this.player = player; this.lines = lines; this.images = imgManage; 
	}

    String motherSprite = "momSprite.png";
    //Cutscenes or Backgrounds
	public void livingRoomCutsceneLoad(){
        ui.npcName.setText("Mom");
		sceneChanger.showDialogue();
		CutsceneMaker livingRoomCutscene = new CutsceneMaker("livingRoom.jpg", motherSprite, "placeholder.png", 
                                                            "placeholder.png", 0.75f, 1.0f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
            player.checkLevel();
	}

    //Transition to Third Lesson
    public void thirdLessonStart1(){
        game.currentDialogue = "thirdLessonStart1";
        game.diatextTracker = 39;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "thirdLessonStart2";
    }
    public void thirdLessonStart2(){
        game.currentDialogue = "thirdLessonStart2";
        game.diatextTracker = 40;
        motherSprite = "momSpriteTeaching.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "thirdLessonStart3";
    }
    public void thirdLessonStart3(){
        game.currentDialogue = "thirdLessonStart3";
        game.diatextTracker = 41;
        motherSprite = "momSprite.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "thirdLessonStart4";
    }
    public void thirdLessonStart4(){
        game.currentDialogue = "thirdLessonStart4";
        game.diatextTracker = 42;
        motherSprite = "MomSpriteTalking.png";
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
            motherSprite = "momSprite.png";
			livingRoomCutsceneLoad();
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
			game.calculateTimer.start();
            sceneChanger.inputAnswer();

            game.nextDialogue = "thirdLessonAnswer1Load";
    }
    public void thirdLessonAnswer1Load(){
        game.currentDialogue = "thirdLessonAnswer1Load";
        game.diatextTracker = 43;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        answer = gameStory.playerAnswerInput[1];

        switch(answer){
            case "65":
                game.nextDialogue = "thirdLesson1Right";
                break;
            default:
                game.nextDialogue = "thirdLesson1Wrong";
                break;
        }
    }

    //Third Lesson Part 1 Results
	public void thirdLesson1Right(){
        game.currentDialogue = "thirdLesson1Right";
        game.diatextTracker = 44;
        motherSprite = "momSpriteHappy.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
		gameStory.increaseCP = 1;
		playerStats.XP+=3;
		gameStory.selectedRight();
            UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

            game.nextDialogue = "thirdLesson1Notes";
    }
    public void thirdLesson1Wrong(){
        game.currentDialogue = "thirdLesson1Wrong";
        game.diatextTracker = 45;
        motherSprite = "momSpriteSad.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        gameStory.decreaseCP = 2;
        gameStory.selectedWrong();
            game.nextDialogue = "thirdLesson1Notes";
    }
    //Third Lesson Part 1 Notes
    public void thirdLesson1Notes(){
        game.currentDialogue = "thirdLesson1Notes";
        game.diatextTracker = 46;
        motherSprite = "momSpriteTeaching.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "thirdLessonQuestion2";
    }

    //Third Lesson Part 2 Question
    public void thirdLessonQuestion2(){
        game.currentDialogue = "thirdLessonQuestion2";
		game.currentQuestion = "thirdLessonQuestion2";

			game.questiontextTracker = 12;
            motherSprite = "momSprite.png";
			livingRoomCutsceneLoad();
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
			game.calculateTimer.start();
            sceneChanger.inputAnswer();

            game.nextDialogue = "thirdLessonAnswer2Load";
    }
    public void thirdLessonAnswer2Load(){
        game.currentDialogue = "thirdLessonAnswer2Load";
        game.diatextTracker = 47;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        answer = gameStory.playerAnswerInput[2];

        switch(answer){
            case "118":
                game.nextDialogue = "thirdLesson2Right";
                break;
            default:
                game.nextDialogue = "thirdLesson2Wrong";
                break;
        }
    }
    
    //Third Lesson Part 2 Results
	public void thirdLesson2Right(){
        game.currentDialogue = "thirdLesson2Right";
        game.diatextTracker = 48;
        motherSprite = "momSpriteHappy.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
		gameStory.increaseCP = 1;
		playerStats.XP+=3;
		gameStory.selectedRight();
            UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

            game.nextDialogue = "thirdLesson2Notes";
    }
    public void thirdLesson2Wrong(){
        game.currentDialogue = "thirdLesson2Wrong";
        game.diatextTracker = 49;
        motherSprite = "momSpriteSad.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        gameStory.decreaseCP = 2;
        gameStory.selectedWrong();
            game.nextDialogue = "thirdLesson2Notes";
    }
    //Third Lesson Part 2 Notes
    public void thirdLesson2Notes(){
        game.currentDialogue = "thirdLesson2Notes";
        game.diatextTracker = 50;
        motherSprite = "momSpriteTeaching.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "fourthLessonStart1";
    }

    //Transition to Fourth Lesson
    public void fourthLessonStart1(){
        game.currentDialogue = "fourthLessonStart1";
        game.diatextTracker = 51;
        motherSprite = "momSprite.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "fourthLessonStart2";
    }
    public void fourthLessonStart2(){
        game.currentDialogue = "fourthLessonStart2";
        game.diatextTracker = 52;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "fourthLessonStart3";
    }
    public void fourthLessonStart3(){
        game.currentDialogue = "fourthLessonStart3";
        game.diatextTracker = 53;
        motherSprite = "momSpriteTeaching.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "fourthLessonStart4";
    }
    public void fourthLessonStart4(){
        game.currentDialogue = "fourthLessonStart4";
        game.diatextTracker = 54;
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "fourthLessonQuestion1";
    }

    //Fourth Lesson Part 1 Question 1
    public void fourthLessonQuestion1(){
        game.currentDialogue = "fourthLessonQuestion1";
		game.currentQuestion = "fourthLessonQuestion1";

			game.questiontextTracker = 13;
            motherSprite = "momSprite.png";
			livingRoomCutsceneLoad();
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
			game.calculateTimer.start();
            sceneChanger.inputAnswer();

            game.nextDialogue = "fourthLessonAnswer1Load";
    }
    public void fourthLessonAnswer1Load(){
        game.currentDialogue = "fourthLessonAnswer1Load";
        game.diatextTracker = 55;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        answer = gameStory.playerAnswerInput[3];

        switch(answer){
            case "207":
                game.nextDialogue = "fourthLesson1Right";
                break;
            default:
                game.nextDialogue = "fourthLesson1Wrong";
                break;
        }
    }

    //Fourth Lesson Part 1 Results
	public void fourthLesson1Right(){
        game.currentDialogue = "fourthLesson1Right";
        game.diatextTracker = 56;
        motherSprite = "momSpriteHappy.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
		gameStory.increaseCP = 1;
		playerStats.XP+=3;
		gameStory.selectedRight();
            UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

            game.nextDialogue = "fourthLessonQuestion2";
    }
    public void fourthLesson1Wrong(){
        game.currentDialogue = "fourthLesson1Wrong";
        game.diatextTracker = 57;
        motherSprite = "momSpriteSad.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        gameStory.decreaseCP = 2;
        gameStory.selectedWrong();
            game.nextDialogue = "fourthLessonQuestion2";
    }


    //Fourth Lesson Part 1 Question 2
    public void fourthLessonQuestion2(){
        game.currentDialogue = "fourthLessonQuestion2";
		game.currentQuestion = "fourthLessonQuestion2";

			game.questiontextTracker = 14;
            motherSprite = "momSprite.png";
			livingRoomCutsceneLoad();
				ui.dialoguePanel.setVisible(false);
				ui.mainTextArea.setFont(game.narrationFont);
				ui.mainTextArea.setText("");
				ui.dialogueBox.setText(null);
			game.calculateTimer.start();
            sceneChanger.inputAnswer();

            game.nextDialogue = "fourthLessonAnswer2Load";
    }
    public void fourthLessonAnswer2Load(){
        game.currentDialogue = "fourthLessonAnswer2Load";
        game.diatextTracker = 58;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        answer = gameStory.playerAnswerInput[4];

        switch(answer){
            case "195":
                game.nextDialogue = "fourthLesson2Right";
                break;
            default:
                game.nextDialogue = "fourthLesson2Wrong";
                break;
        }
    }

    //Fourth Lesson Part 1 Results
	public void fourthLesson2Right(){
        game.currentDialogue = "fourthLesson2Right";
        game.diatextTracker = 59;
        motherSprite = "momSpriteHappy.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
		gameStory.increaseCP = 1;
		playerStats.XP+=3;
		gameStory.selectedRight();
            UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

            game.nextDialogue = "fourthLesson2Notes1";
    }
    public void fourthLesson2Wrong(){
        game.currentDialogue = "fourthLesson2Wrong";
        game.diatextTracker = 60;
        motherSprite = "momSpriteSad.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        gameStory.decreaseCP = 2;
        gameStory.selectedWrong();
            game.nextDialogue = "fourthLesson2Notes1";
    }
    //Fourth Lesson Part 1 Notes
    public void fourthLesson2Notes1(){
        game.currentDialogue = "fourthLesson2Notes1";
        game.diatextTracker = 61;
        motherSprite = "momSprite.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "fourthLesson2Notes2";
    }
    public void fourthLesson2Notes2(){
        game.currentDialogue = "fourthLesson2Notes2";
        game.diatextTracker = 62;
        motherSprite = "momSpriteTeaching.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "fourthLesson2Notes3";
    }
    public void fourthLesson2Notes3(){
        game.currentDialogue = "fourthLesson2Notes3";
        game.diatextTracker = 63;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "fourthLesson2Notes4";
    }
    public void fourthLesson2Notes4(){
        game.currentDialogue = "fourthLesson2Notes";
        game.diatextTracker = 64;
        motherSprite = "momSpriteTeaching.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "ThirdFourthLessonReviewStart";
    }

    //Transition to Reviewing of Third and Fourth Lesson Concepts
    public void ThirdFourthLessonReviewStart(){
        game.currentDialogue = "ThirdFourthLessonReviewStart";
        game.diatextTracker = 65;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
            game.nextDialogue = "ThirdFourthLessonReview1";
    }

    //Start of review
    //Question 1
    public void ThirdFourthLessonReview1(){
        game.currentDialogue = "ThirdFourthLessonReview1";
        game.currentQuestion = "ThirdFourthLessonReview1";

        game.questiontextTracker = 15;
        motherSprite = "momSprite.png";
        livingRoomCutsceneLoad();
            ui.dialoguePanel.setVisible(false);
            ui.mainTextArea.setFont(game.narrationFont);
            ui.mainTextArea.setText("");
            ui.dialogueBox.setText(null);
        game.calculateTimer.start();
        sceneChanger.inputAnswer();

            game.nextDialogue = "ThirdFourthLessonReview1Load";
    }
    public void ThirdFourthLessonReview1Load(){
        game.currentDialogue = "ThirdFourthLessonReview1Load";
        game.diatextTracker = 66;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        answer = gameStory.playerAnswerInput[5];

        switch(answer){
            case "58":
                game.nextDialogue = "ThirdFourthLessonReview1Right";
                break;
            default:
                game.nextDialogue = "ThirdFourthLessonReview1Wrong";
                break;
        }
    }

    //Results for Review 1
    public void ThirdFourthLessonReview1Right(){
        game.currentDialogue = "ThirdFourthLessonReview1Right";
        game.diatextTracker = (1+(int)(Math.random()*(69-66))+66);
            motherSprite = "momSpriteHappy.png";
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

                game.nextDialogue = "ThirdFourthLessonReview2";

    }
    public void ThirdFourthLessonReview1Wrong(){
        answer = null;
        game.currentDialogue = "ThirdFourthLessonReview1Wrong";
        game.diatextTracker = (1+(int)(Math.random()*(72-69))+69);
            motherSprite = "momSpriteSad.png";
			livingRoomCutsceneLoad();
            ui.mainTextArea.setFont(game.normalFont);
            gameStory.decreaseCP = 2;
            gameStory.selectedWrong();
            game.startDialogue();

                game.nextDialogue = "ThirdFourthLessonReview1";
    }

     //Question 2
    public void ThirdFourthLessonReview2(){
        game.currentDialogue = "ThirdFourthLessonReview2";
        game.currentQuestion = "ThirdFourthLessonReview2";

        game.questiontextTracker = 16;
        motherSprite = "momSprite.png";
        livingRoomCutsceneLoad();
            ui.dialoguePanel.setVisible(false);
            ui.mainTextArea.setFont(game.narrationFont);
            ui.mainTextArea.setText("");
            ui.dialogueBox.setText(null);
        game.calculateTimer.start();
        sceneChanger.inputAnswer();

            game.nextDialogue = "ThirdFourthLessonReview2Load";
    }
    public void ThirdFourthLessonReview2Load(){
        game.currentDialogue = "ThirdFourthLessonReview2Load";
        game.diatextTracker = 66;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        answer = gameStory.playerAnswerInput[6];

        switch(answer){
            case "16":
                game.nextDialogue = "ThirdFourthLessonReview2Right";
                break;
            default:
                game.nextDialogue = "ThirdFourthLessonReview2Wrong";
                break;
        }
    }

    //Results for Review 2
    public void ThirdFourthLessonReview2Right(){
        game.currentDialogue = "ThirdFourthLessonReview2Right";
        game.diatextTracker = (1+(int)(Math.random()*(69-66))+66);
            motherSprite = "momSpriteHappy.png";
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

                game.nextDialogue = "ThirdFourthLessonReview3";

    }
    public void ThirdFourthLessonReview2Wrong(){
        game.currentDialogue = "ThirdFourthLessonReview2Wrong";
        game.diatextTracker = (1+(int)(Math.random()*(72-69))+69);
            motherSprite = "momSpriteSad.png";
			livingRoomCutsceneLoad();
            ui.mainTextArea.setFont(game.normalFont);
            gameStory.decreaseCP = 2;
            gameStory.selectedWrong();
            game.startDialogue();

                game.nextDialogue = "ThirdFourthLessonReview2";
    }

    //Question 3
    public void ThirdFourthLessonReview3(){
        game.currentDialogue = "ThirdFourthLessonReview3";
        game.currentQuestion = "ThirdFourthLessonReview3";
    
        game.questiontextTracker = 17;
        motherSprite = "momSprite.png";
         livingRoomCutsceneLoad();
            ui.dialoguePanel.setVisible(false);
            ui.mainTextArea.setFont(game.narrationFont);
            ui.mainTextArea.setText("");
            ui.dialogueBox.setText(null);
        game.calculateTimer.start();
        sceneChanger.inputAnswer();
    
            game.nextDialogue = "ThirdFourthLessonReview3Load";
    }
    public void ThirdFourthLessonReview3Load(){
        game.currentDialogue = "ThirdFourthLessonReview3Load";
        game.diatextTracker = 66;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        answer = gameStory.playerAnswerInput[7];
    
        switch(answer){
            case "36":
                game.nextDialogue = "ThirdFourthLessonReview3Right";
                break;
             default:
                game.nextDialogue = "ThirdFourthLessonReview3Wrong";
                break;
        }
    }

    //Results for Review 3
    public void ThirdFourthLessonReview3Right(){
        game.currentDialogue = "ThirdFourthLessonReview3Right";
        game.diatextTracker = (1+(int)(Math.random()*(69-66))+66);
            motherSprite = "momSpriteHappy.png";
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

                game.nextDialogue = "ThirdFourthLessonReview4";

    }
    public void ThirdFourthLessonReview3Wrong(){
        game.currentDialogue = "ThirdFourthLessonReview3Wrong";
        game.diatextTracker = (1+(int)(Math.random()*(72-69))+69);
            motherSprite = "momSpriteSad.png";
			livingRoomCutsceneLoad();
            ui.mainTextArea.setFont(game.normalFont);
            gameStory.decreaseCP = 2;
            gameStory.selectedWrong();
            game.startDialogue();

                game.nextDialogue = "ThirdFourthLessonReview3";
    }

    //Question 4
    public void ThirdFourthLessonReview4(){
        game.currentDialogue = "ThirdFourthLessonReview4";
        game.currentQuestion = "ThirdFourthLessonReview4";
    
        game.questiontextTracker = 18;
        motherSprite = "momSprite.png";
         livingRoomCutsceneLoad();
            ui.dialoguePanel.setVisible(false);
            ui.mainTextArea.setFont(game.narrationFont);
            ui.mainTextArea.setText("");
            ui.dialogueBox.setText(null);
        game.calculateTimer.start();
        sceneChanger.inputAnswer();
    
            game.nextDialogue = "ThirdFourthLessonReview4Load";
    }
    public void ThirdFourthLessonReview4Load(){
        game.currentDialogue = "ThirdFourthLessonReview4Load";
        game.diatextTracker = 66;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        answer = gameStory.playerAnswerInput[8];
    
        switch(answer){
            case "7":
                game.nextDialogue = "ThirdFourthLessonReview4Right";
                break;
             default:
                game.nextDialogue = "ThirdFourthLessonReview4Wrong";
                break;
        }
    }

    //Results for Review 4
    public void ThirdFourthLessonReview4Right(){
        game.currentDialogue = "ThirdFourthLessonReview4Right";
        game.diatextTracker = (1+(int)(Math.random()*(69-66))+66);
            motherSprite = "momSpriteHappy.png";
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

                game.nextDialogue = "ThirdFourthLessonReview5";

    }
    public void ThirdFourthLessonReview4Wrong(){
        game.currentDialogue = "ThirdFourthLessonReview4Wrong";
        game.diatextTracker = (1+(int)(Math.random()*(72-69))+69);
            motherSprite = "momSpriteSad.png";
			livingRoomCutsceneLoad();
            ui.mainTextArea.setFont(game.normalFont);
            gameStory.decreaseCP = 2;
            gameStory.selectedWrong();
            game.startDialogue();

                game.nextDialogue = "ThirdFourthLessonReview4";
    }

    //Question 5
    public void ThirdFourthLessonReview5(){
        game.currentDialogue = "ThirdFourthLessonReview5";
        game.currentQuestion = "ThirdFourthLessonReview5";
    
        game.questiontextTracker = 19;
        motherSprite = "momSprite.png";
         livingRoomCutsceneLoad();
            ui.dialoguePanel.setVisible(false);
            ui.mainTextArea.setFont(game.narrationFont);
            ui.mainTextArea.setText("");
            ui.dialogueBox.setText(null);
        game.calculateTimer.start();
        sceneChanger.inputAnswer();
    
            game.nextDialogue = "ThirdFourthLessonReview5Load";
    }
    public void ThirdFourthLessonReview5Load(){
        game.currentDialogue = "ThirdFourthLessonReview5Load";
        game.diatextTracker = 66;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        answer = gameStory.playerAnswerInput[9];
    
        switch(answer){
            case "74":
                game.nextDialogue = "ThirdFourthLessonReview5Right";
                break;
             default:
                game.nextDialogue = "ThirdFourthLessonReview5Wrong";
                break;
        }
    }

    //Results for Review 5
    public void ThirdFourthLessonReview5Right(){
        game.currentDialogue = "ThirdFourthLessonReview5Right";
        game.diatextTracker = (1+(int)(Math.random()*(69-66))+66);
            motherSprite = "momSpriteHappy.png";
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

                game.nextDialogue = "ThirdFourthLessonReview6";

    }
    public void ThirdFourthLessonReview5Wrong(){
        game.currentDialogue = "ThirdFourthLessonReview5Wrong";
        game.diatextTracker = (1+(int)(Math.random()*(72-69))+69);
            motherSprite = "momSpriteSad.png";
			livingRoomCutsceneLoad();
            ui.mainTextArea.setFont(game.normalFont);
            gameStory.decreaseCP = 2;
            gameStory.selectedWrong();
            game.startDialogue();

                game.nextDialogue = "ThirdFourthLessonReview5";
    }

    //Question 6
    public void ThirdFourthLessonReview6(){
        game.currentDialogue = "ThirdFourthLessonReview6";
        game.currentQuestion = "ThirdFourthLessonReview6";
    
        game.questiontextTracker = 20;
        motherSprite = "momSprite.png";
         livingRoomCutsceneLoad();
            ui.dialoguePanel.setVisible(false);
            ui.mainTextArea.setFont(game.narrationFont);
            ui.mainTextArea.setText("");
            ui.dialogueBox.setText(null);
        game.calculateTimer.start();
        sceneChanger.inputAnswer();
    
            game.nextDialogue = "ThirdFourthLessonReview6Load";
    }
    public void ThirdFourthLessonReview6Load(){
        game.currentDialogue = "ThirdFourthLessonReview6Load";
        game.diatextTracker = 66;
        motherSprite = "MomSpriteTalking.png";
        livingRoomCutsceneLoad();
        ui.mainTextArea.setFont(game.normalFont);
        game.startDialogue();
        answer = gameStory.playerAnswerInput[10];
    
        switch(answer){
            case "49":
                game.nextDialogue = "ThirdFourthLessonReview6Right";
                break;
             default:
                game.nextDialogue = "ThirdFourthLessonReview6Wrong";
                break;
        }
    }

    //Results for Review 6
    public void ThirdFourthLessonReview6Right(){
        game.currentDialogue = "ThirdFourthLessonReview6Right";
        game.diatextTracker = (1+(int)(Math.random()*(69-66))+66);
            motherSprite = "momSpriteHappy.png";
			livingRoomCutsceneLoad();
			ui.mainTextArea.setFont(game.normalFont);
			game.startDialogue();
			gameStory.increaseCP = 1;
			playerStats.XP+=3;
			gameStory.selectedRight();
				UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");

                game.nextDialogue = "endStart1";

    }
    public void ThirdFourthLessonReview6Wrong(){
        game.currentDialogue = "ThirdFourthLessonReview6Wrong";
        game.diatextTracker = (1+(int)(Math.random()*(72-69))+69);
            motherSprite = "momSpriteSad.png";  
			livingRoomCutsceneLoad();
            ui.mainTextArea.setFont(game.normalFont);
            gameStory.decreaseCP = 2;
            gameStory.selectedWrong();
            game.startDialogue();

                game.nextDialogue = "endStart1";
    }
}