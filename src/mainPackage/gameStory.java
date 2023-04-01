package mainPackage;

import javax.swing.JLabel;

import scenes.introScene;
import scenes.sceneOnePartEnd;
import scenes.sceneOnePartOne;
import scenes.sceneOnePartTwo;
import scenes.sceneTwoPartOne;
import scenes.sceneTwoPartTwo;

import java.io.Serializable;

public class gameStory implements Serializable{
	
	introScene intro; sceneOnePartOne scOne; sceneOnePartTwo scOne2; sceneOnePartEnd scOneEnd;
	sceneTwoPartOne scTwo1;
	
	Game game; UserInterface ui;
	TransitionClass sceneChanger; soundManager sm;
	playerStats player; storyLines lines;
	ImageManager images;
	
		public static int  pauseTime = 0;
		public static int increaseCP = 0,  increaseXP = 0, decreaseCP = 0;
		public int number = 0, reviewCorrect = 0, questionSelector = 0, questionRecognizer = 0;

		public static String name, 
							gender = Game.gender, 
							gender1 = Game.gender1, 
							gender2 = Game.gender2, 
							gender3 = Game.gender3, 
							SOName = Game.SOName,
							SOSprite = Game.SOSprite;
		public static String playerAnswerInput;
		
		public static JLabel bgHolder = new JLabel();
		public static JLabel charHolder = new JLabel(); 

	public gameStory(Game g, UserInterface UI, TransitionClass sc, soundManager SM, playerStats pStats, ImageManager imgManage, 
					introScene intro2, sceneOnePartOne homeOne, sceneOnePartTwo homeTwo, sceneOnePartEnd homeEnd, 
					sceneTwoPartOne walkOne, sceneTwoPartTwo walkTwo) {	
				game = g; ui = UI; sceneChanger = sc; sm = SM; player = pStats; images = imgManage; 
				
				intro = intro2; scOne = homeOne; scOne2 = homeTwo; scOneEnd = homeEnd; scTwo1 = walkOne;
	}
	
	public void startStats(){
		playerStats.maxCP = 10;
		playerStats.XP = 0;
			UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "/" + playerStats.neededXP + "<center><html>");
			playerStats.CP = 10;
			UserInterface.ChancePointsNumberLabel.setText("<html><center>" + playerStats.CP + "/" + playerStats.maxCP + "<center><html>");
	}

	public static void pause() {
		try {
			Thread.sleep(pauseTime);
		}
		catch(Exception e) {
			
		}
	}

	//For simple dialogue moments	
	public void dialogueTracker(String nextDialogue) {
		switch(nextDialogue){
		case "intro0":    	intro.intro0Game(); break; 
		case "genderSelect": sceneChanger.genderSelect(); intro.genderSelect(); break;
		case "instructions": sceneChanger.showInstructions(); intro.instructions(); break;
		case "intro1":   	sceneChanger.showDialogue(); intro.intro1Game(); break;
		case "intro2":    	intro.intro2Game(); break;
		case "intro3":    	intro.intro3Game(); break;
			case "intro3to4":	intro.intro3to4(); break;
		case "intro4":    	sceneChanger.showDialogue(); intro.intro4Game(); break;
		case "intro5": 	  	intro.intro5Game(); break;
			case "intro5to6": 	intro.intro5to6(); break;
		case "intro6":    	sceneChanger.showDialogue(); intro.intro6Game(); break;
			case "intro6toEnd": intro.intro6toEnd(); break;
		case "introEnd":  	intro.amBedroom(); break;
			
			case "gbedroomExit12": scOne.goodbedroomExit12(); break;
			case "gbedroomExit13": scOne.goodbedroomExit13(); break;
		
			case "scolding11": scOne.scolding11(); sceneChanger.showDialogue(); break;
				case "bbedroomExit12": scOne.badbedroomExit12(); break;
				case "bbedroomExit13": scOne.badbedroomExit13(); break;

			case "explanation1": scOne.explanation1(); break;
			case "explanation2": scOne.explanation2(); break;
			case "explanation3": scOne.explanation3(); break;

		case "firstLessonStart1": scOne.firstLessonStart1(); break;
		case "firstLessonStart2": scOne.firstLessonStart2(); break;

		case "arcStart1": scOne.showArc(); break;

			case "firstLessonQuestion": scOne.firstLessonQuestion(); break;
			case "firstLessonNotes": scOne.firstLessonNotes(); break;

		case "secondLessonStart1": scOne.secondLessonStart1(); break;
		case "secondLessonStart2": scOne.secondLessonStart2(); break;
		case "secondLessonStart3": scOne.secondLessonStart3(); break;

		case "secondLessonQuestion1": scOne.secondLessonQuestion1(); break;
			case "secondLesson1Notes": scOne.secondLesson1Notes(); break;
		
		case "secondLessonQuestion2": scOne.secondLessonQuestion2(); break;
			case "secondLesson2Notes": scOne.secondLesson2Notes(); break;

		case "secondLessonQuestion3": scOne.secondLessonQuestion3(); break;
			case "secondLesson3Notes": scOne.secondLesson3Notes(); break;
		
		case "secondLessonReviewStart": scOne.secondLessonReviewStart(); break;
			case "secondLessonReview1": scOne.secondLessonReview1(); break;
			case "secondLessonReview2": scOne.secondLessonReview2(); break;
			case "secondLessonReview3": scOne.secondLessonReview3(); break;
			case "secondLessonReview4": scOne.secondLessonReview4(); break;
			case "secondLessonReview5": scOne.secondLessonReview5(); break;
			case "secondLessonReview6": scOne.secondLessonReview6(); break;

		case "thirdLessonStart1": scOne2.thirdLessonStart1(); break;
		case "thirdLessonStart2": scOne2.thirdLessonStart2(); break;
		case "thirdLessonStart3": scOne2.thirdLessonStart3(); break;
		case "thirdLessonStart4": scOne2.thirdLessonStart4(); break;

		case "thirdLessonQuestion1": scOne2.thirdLessonQuestion1(); break;
			case "thirdLessonAnswer1Load": scOne2.thirdLessonAnswer1Load(); break;
				case "thirdLesson1Right": scOne2.thirdLesson1Right(); break;
				case "thirdLesson1Wrong": scOne2.thirdLesson1Wrong(); break;
			case "thirdLesson1Notes": scOne2.thirdLesson1Notes(); break;

		case "thirdLessonQuestion2": scOne2.thirdLessonQuestion2(); break;
			case "thirdLessonAnswer2Load": scOne2.thirdLessonAnswer2Load(); break;
				case "thirdLesson2Right": scOne2.thirdLesson2Right(); break;
				case "thirdLesson2Wrong": scOne2.thirdLesson2Wrong(); break;
			case "thirdLesson2Notes": scOne2.thirdLesson2Notes();

		case "fourthLessonStart1": scOne2.fourthLessonStart1(); break;
		case "fourthLessonStart2": scOne2.fourthLessonStart2(); break;
		case "fourthLessonStart3": scOne2.fourthLessonStart3(); break;
		case "fourthLessonStart4": scOne2.fourthLessonStart4(); break;

		case "fourthLessonQuestion1": scOne2.fourthLessonQuestion1(); break;
			case "fourthLessonAnswer1Load": scOne2.fourthLessonAnswer1Load(); break;
				case "fourthLesson1Right": scOne2.fourthLesson1Right(); break;
				case "fourthLesson1Wrong": scOne2.fourthLesson1Wrong(); break;

		case "fourthLessonQuestion2": scOne2.fourthLessonQuestion2(); break;
			case "fourthLessonAnswer2Load": scOne2.fourthLessonAnswer2Load(); break;
				case "fourthLesson2Right": scOne2.fourthLesson2Right(); break;
				case "fourthLesson2Wrong": scOne2.fourthLesson2Wrong(); break;
			case "fourthLesson2Notes1": scOne2.fourthLesson2Notes1(); break;
			case "fourthLesson2Notes2": scOne2.fourthLesson2Notes2(); break;
			case "fourthLesson2Notes3": scOne2.fourthLesson2Notes3(); break;
			case "fourthLesson2Notes4": scOne2.fourthLesson2Notes4(); break;

		case "ThirdFourthLessonReviewStart": scOne2.ThirdFourthLessonReviewStart(); break;
			
		case "ThirdFourthLessonReview1": scOne2.ThirdFourthLessonReview1(); break;
			case "ThirdFourthLessonReview1Load": scOne2.ThirdFourthLessonReview1Load(); break;
				case "ThirdFourthLessonReview1Right": scOne2.ThirdFourthLessonReview1Right(); break;
				case "ThirdFourthLessonReview1Wrong": scOne2.ThirdFourthLessonReview1Wrong(); break;

		case "ThirdFourthLessonReview2": scOne2.ThirdFourthLessonReview2(); break;
			case "ThirdFourthLessonReview2Load": scOne2.ThirdFourthLessonReview2Load(); break;
				case "ThirdFourthLessonReview2Right": scOne2.ThirdFourthLessonReview2Right(); break;
				case "ThirdFourthLessonReview2Wrong": scOne2.ThirdFourthLessonReview2Wrong(); break;

		case "ThirdFourthLessonReview3": scOne2.ThirdFourthLessonReview3(); break;
			case "ThirdFourthLessonReview3Load": scOne2.ThirdFourthLessonReview3Load(); break;
				case "ThirdFourthLessonReview3Right": scOne2.ThirdFourthLessonReview3Right(); break;
				case "ThirdFourthLessonReview3Wrong": scOne2.ThirdFourthLessonReview3Wrong(); break;

		case "ThirdFourthLessonReview4": scOne2.ThirdFourthLessonReview4(); break;
			case "ThirdFourthLessonReview4Load": scOne2.ThirdFourthLessonReview4Load(); break;
				case "ThirdFourthLessonReview4Right": scOne2.ThirdFourthLessonReview4Right(); break;
				case "ThirdFourthLessonReview4Wrong": scOne2.ThirdFourthLessonReview4Wrong(); break;

		case "ThirdFourthLessonReview5": scOne2.ThirdFourthLessonReview5(); break;
			case "ThirdFourthLessonReview5Load": scOne2.ThirdFourthLessonReview5Load(); break;
				case "ThirdFourthLessonReview5Right": scOne2.ThirdFourthLessonReview5Right(); break;
				case "ThirdFourthLessonReview5Wrong":  scOne2.ThirdFourthLessonReview5Wrong(); break;

		case "ThirdFourthLessonReview6": scOne2.ThirdFourthLessonReview6(); break;
			case "ThirdFourthLessonReview6Load": scOne2.ThirdFourthLessonReview6Load(); break;
				case "ThirdFourthLessonReview6Right": scOne2.ThirdFourthLessonReview6Right(); break;
				case "ThirdFourthLessonReview6Wrong": scOne2.ThirdFourthLessonReview6Wrong(); break;

		case "endStart1": scOneEnd.endStart1(); break;
		case "endStart2": scOneEnd.endStart2(); break;
			case "endStart2to3": scOneEnd.endStart2to3(); break;
		case "endStart3": scOneEnd.endStart3(); break;

		case "endQuestion1": scOneEnd.endQuestion1(); break;
		case "endQuestion2": scOneEnd.endQuestion2(); break;

		case "sceneOneEnds1": scOneEnd.sceneOneEnds1(); break;
		case "sceneOneEnds2": scOneEnd.sceneOneEnds2(); break;
		case "sceneOneEndEnd": scOneEnd.sceneOneEndEnd(); break;

		case "walkToSchool1": scTwo1.walkToSchool1(); break;
		case "walkToSchool2": scTwo1.walkToSchool2(); break;
		case "walkToSchool3": scTwo1.walkToSchool3(); break;
		case "walkToSchool4": scTwo1.walkToSchool4(); break;
		case "walkToSchool5": scTwo1.walkToSchool5(); break;
		case "walkToSchool6": scTwo1.walkToSchool6(); break;
		case "walkToSchool7": scTwo1.walkToSchool7(); break;
		case "walkToSchool8": scTwo1.walkToSchool8(); break;
		case "walkToSchool9": scTwo1.walkToSchool9(); break;

		case "crushBusStopEvent1": scTwo1.crushBusStopEvent1(); break;
		case "crushBusStopEvent2": scTwo1.crushBusStopEvent2(); break;
		case "crushBusStopEvent3": scTwo1.crushBusStopEvent3(); break;
		case "crushBusStopEvent4": scTwo1.crushBusStopEvent4(); break;

		case "crushBusStopEventApproach": scTwo1.crushBusStopEventApproach(); break;
		case "crushBusStopEventApproach1": scTwo1.crushBusStopEventApproach1(); break;
		case "crushBusStopEventApproach2": scTwo1.crushBusStopEventApproach2(); break;
		case "crushBusStopEventApproach3": scTwo1.crushBusStopEventApproach3(); break;

		case "crushBusStopEventTalk": scTwo1.crushBusStopEventTalk(); break;
		case "crushBusStopEventTalk1": scTwo1.crushBusStopEventTalk1(); break;
		case "crushBusStopEventTalk2": scTwo1.crushBusStopEventTalk2(); break;
		case "crushBusStopEventTalk3": scTwo1.crushBusStopEventTalk3(); break;
		case "crushBusStopEventTalk4": scTwo1.crushBusStopEventTalk4(); break;
		case "crushBusStopEventTalk5": scTwo1.crushBusStopEventTalk5(); break;
		case "crushBusStopEventTalk6": scTwo1.crushBusStopEventTalk6(); break;
		case "crushBusStopEventTalk7": scTwo1.crushBusStopEventTalk7(); break;
		case "crushBusStopEventTalk8": scTwo1.crushBusStopEventTalk8(); break;
		case "crushBusStopEventTalk9": scTwo1.crushBusStopEventTalk9(); break;
		case "crushBusStopEventTalk10": scTwo1.crushBusStopEventTalk10(); break;
		case "crushBusStopEventTalk11": scTwo1.crushBusStopEventTalk11(); break;
		case "crushBusStopEventTalk12": scTwo1.crushBusStopEventTalk12(); break;
		case "crushBusStopEventTalk13": scTwo1.crushBusStopEventTalk13(); break;
		case "crushBusStopEventTalk14": scTwo1.crushBusStopEventTalk14(); break;
		case "crushBusStopEventTalk15": scTwo1.crushBusStopEventTalk15(); break;
		case "crushBusStopEventTalk16": scTwo1.crushBusStopEventTalk16(); break;

	}
}

	//For choice making moments
	public void progressTracker(String nextMove) {
		switch(nextMove) {
			case "afterBed": intro.amBedroom(); break;
				case "bedroomExit11": 	intro.bedroomExit11(); sceneChanger.showDialogue();  break;
				case "bedroomStudy11": 	intro.bedroomStudy11(); break;		
				case "bedroomSS11": 	intro.bedroomSS11();  sceneChanger.showDialogue(); ui.bgPanel.setVisible(true); 
										bgHolder.setIcon(images.cityView); break;		
				case "bedroomSleep11": 	intro.bedroomSleep11(); sceneChanger.showDialogue(); break;	
				
			case "firstLessonQuestion": 	scOne.firstLessonQuestion(); break;
				case "firstLessonRight": 	scOne.firstLessonRight(); break;
				case "firstLessonWrong": 	scOne.firstLessonWrong(); break;

			case "secondLessonQuestion1": 	scOne.secondLessonQuestion1(); break;
				case "secondLesson1Right": 	scOne.secondLesson1Right(); break;
				case "secondLesson1Wrong": 	scOne.secondLesson1Wrong(); break;

			case "secondLessonQuestion2": 	scOne.secondLessonQuestion2(); break;
				case "secondLesson2Right": 	scOne.secondLesson2Right(); break;
				case "secondLesson2Wrong": 	scOne.secondLesson2Wrong(); break;

			case "secondLessonQuestion3": 	scOne.secondLessonQuestion3(); break;
				case "secondLesson3Right": 	scOne.secondLesson3Right(); break;
				case "secondLesson3Wrong": 	scOne.secondLesson3Wrong(); break;
			
				case "secondLessonReview1": scOne.secondLessonReview1(); break;
					case "secondLessonReview1Right": scOne.secondLessonReview1Right(); break;
					case "secondLessonReview1Wrong": scOne.secondLessonReview1Wrong(); break;

				case "secondLessonReview2": scOne.secondLessonReview2(); break;
					case "secondLessonReview2Right": scOne.secondLessonReview2Right(); break;
					case "secondLessonReview2Wrong": scOne.secondLessonReview2Wrong(); break;

				case "secondLessonReview3": scOne.secondLessonReview3(); break;
					case "secondLessonReview3Right": scOne.secondLessonReview3Right(); break;
					case "secondLessonReview3Wrong": scOne.secondLessonReview3Wrong(); break;

				case "secondLessonReview4": scOne.secondLessonReview4(); break;
					case "secondLessonReview4Right": scOne.secondLessonReview4Right(); break;	
					case "secondLessonReview4Wrong": scOne.secondLessonReview4Wrong(); break;

				case "secondLessonReview5": scOne.secondLessonReview5(); break;
					case "secondLessonReview5Right": scOne.secondLessonReview5Right(); break;	
					case "secondLessonReview5Wrong": scOne.secondLessonReview6Wrong(); break;

				case "secondLessonReview6": scOne.secondLessonReview6(); break;
					case "secondLessonReview6Right": scOne.secondLessonReview6Right(); break;	
					case "secondLessonReview6Wrong": scOne.secondLessonReview6Wrong(); break;

				case "thirdLessonQuestion1": scOne2.thirdLessonQuestion1(); break;
				case "thirdLessonQuestion2": scOne2.thirdLessonQuestion2(); break;
				case "fourthLessonQuestion1": scOne2.fourthLessonQuestion1(); break;
				case "fourthLessonQuestion2": scOne2.fourthLessonQuestion2(); break;
		
				case "ThirdFourthLessonReview1": scOne2.ThirdFourthLessonReview1(); break;
				case "ThirdFourthLessonReview2": scOne2.ThirdFourthLessonReview2(); break;
				case "ThirdFourthLessonReview3": scOne2.ThirdFourthLessonReview3(); break;
				case "ThirdFourthLessonReview4": scOne2.ThirdFourthLessonReview4(); break;
				case "ThirdFourthLessonReview5": scOne2.ThirdFourthLessonReview5(); break;
				case "ThirdFourthLessonReview6": scOne2.ThirdFourthLessonReview6(); break;	
			
				case "endQuestion1": scOneEnd.endQuestion1(); break;
					case "endQuestion1Right": scOneEnd.endQuestion1Right(); break;
					case "endQuestion1Wrong": scOneEnd.endQuestion1Wrong(); break;

				case "endQuestion2": scOneEnd.endQuestion2(); break;
					case "endQuestion2Right": scOneEnd.endQuestion2Right(); break;
					case "endQuestion2Wrong": scOneEnd.endQuestion2Wrong(); break;
	
		}
	}
	public static void selectedRight(){
		if(playerStats.CP < playerStats.maxCP){
			playerStats.CP = playerStats.CP + increaseCP;
			UserInterface.ChancePointsNumberLabel.setText("<html><center>" + playerStats.CP + "/" + playerStats.maxCP + "<center><html>");
		}
	}
	public static void selectedWrong(){
		if(playerStats.CP > 0){
			playerStats.CP = playerStats.CP - decreaseCP;
			UserInterface.ChancePointsNumberLabel.setText("<html><center>" + playerStats.CP + "/" + playerStats.maxCP + "<center><html>");
		}
	}
}
