package mainPackage;

import javax.swing.JLabel;

import scenes.introScene;
import scenes.sceneOnePartOne;

import java.io.Serializable;

public class gameStory implements Serializable{
	
	introScene intro; sceneOnePartOne scOne;
	
	Game game; UserInterface ui;
	TransitionClass sceneChanger; soundManager sm;
	playerStats player; storyLines lines;
	ImageManager images;
	
		public static int  pauseTime = 0;
		public static int increaseCP = 0,  increaseXP = 0, decreaseCP = 0;
		public int number = 0, reviewCorrect = 0, questionSelector = 0, questionRecognizer = 0;

		public static String name;
		
		public static JLabel bgHolder = new JLabel();
		public static JLabel charHolder = new JLabel(); 

	public gameStory(Game g, UserInterface UI, TransitionClass sc, soundManager SM, playerStats pStats, ImageManager imgManage, 
					introScene intro2, sceneOnePartOne homeOne) {	
				game = g; ui = UI; sceneChanger = sc; sm = SM; player = pStats; images = imgManage; 
				
				intro = intro2; scOne = homeOne;
	}
	
	public void startStats(){
		playerStats.maxCP = 10;
		playerStats.XP = 0;
			ui.XPNumberLabel.setText("<html><center>" + playerStats.XP + "<center><html>");
			playerStats.CP = 10;
			UserInterface.ChancePointsNumberLabel.setText("<html><center>" + playerStats.CP + "<center><html>");
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
		case "intro1":   	sceneChanger.showDialogue(); intro.intro1Game(); break;
		case "intro2":    	intro.intro2Game(); break;
		case "intro3":    	intro.intro3Game(); break;
			case "intro3to4": 	game.enableKeys = 1; intro.intro3to4(); break;
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

		// case "afterQAOne": scOne.afterQAOne(); break;
		// case "sceneOneEnd": scOne.sceneOneEnd(); break;

		// case "exitHouse": scOne.exitHouse(); break;
		}
	}
		/*
		case "sceneTwoStart": sceneTwoStart(); break;
		case "suddenRain": suddenRain(); break;
		case "suddenRain2": suddenRain2(); break;
		case "crushStart": crushStart(); break;
		case "helpAsked": helpAsked(); break;

		case "HelpOrIgnore": sceneChanger.showChoices(); break;
			case "crushHelped2": crushHelped2(); break;
			case "crushHelped3": crushHelped3(); break;
			case "crushHelped4": crushHelped4(); break;
			
				case "crushIgnored": crushIgnored(); break;

		case "AtSchool": AtSchool(); break;

		case "friends1": friends1(); break;
		case "friends2": friends2(); break; 
		case "friends3": friends3(); break;
		case "friends4": friends4(); break;

		case "cafeteria1": cafeteria1(); break;
		case "cafeteria2": cafeteria2(); break;
		case "cafeteria3": cafeteria3(); break;
		case "cafeteria4": cafeteria4(); break;
	}
}*/
	
	//For choice making moments
	public void progressTracker(String nextMove) {
		switch(nextMove) {
			case "afterBed": intro.amBedroom(); break;
				case "bedroomExit11": 	intro.bedroomExit11(); sceneChanger.showDialogue();  break;
				case "bedroomStudy11": 	intro.bedroomStudy11(); sceneChanger.showDialogue();  break;		
				case "bedroomSS11": 	intro.bedroomSS11();  sceneChanger.showDialogue(); ui.bgPanel.setVisible(true); 
										bgHolder.setIcon(images.cityView); break;		
				case "bedroomSleep11": 	intro.bedroomSleep11(); sceneChanger.showDialogue(); break;	
				
			case "firstLessonQuestion": 	scOne.firstLessonQuestion(); break;
				case "firstLessonRight": 	scOne.firstLessonRight(); sceneChanger.showDialogue(); break;
				case "firstLessonWrong": 	scOne.firstLessonWrong(); sceneChanger.showDialogue(); break;

			case "secondLessonQuestion1": 	scOne.secondLessonQuestion1(); break;
				case "secondLesson1Right": 	scOne.secondLesson1Right(); sceneChanger.showDialogue(); break;
				case "secondLesson1Wrong": 	scOne.secondLesson1Wrong(); sceneChanger.showDialogue();  break;

			case "secondLessonQuestion2": 	scOne.secondLessonQuestion2(); break;
				case "secondLesson2Right": 	scOne.secondLesson2Right(); sceneChanger.showDialogue(); break;
				case "secondLesson2Wrong": 	scOne.secondLesson2Wrong(); sceneChanger.showDialogue(); break;

			case "secondLessonQuestion3": 	scOne.secondLessonQuestion3(); break;
				case "secondLesson3Right": 	scOne.secondLesson3Right(); sceneChanger.showDialogue(); break;
				case "secondLesson3Wrong": 	scOne.secondLesson3Wrong(); sceneChanger.showDialogue(); break;
			
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

			/*case "HelpOrIgnore": HelpOrIgnore(); break;
				case "helped": crushHelped1(); sceneChanger.showDialogue(); break;
				case "ignored": crushIgnored(); sceneChanger.showDialogue(); break;*/
		}
	}
	public static void selectedRight(){
		if(playerStats.CP < playerStats.maxCP){
			playerStats.CP = playerStats.CP + increaseCP;
			UserInterface.ChancePointsNumberLabel.setText("<html><center>" + playerStats.CP + "<center><html>");
		}
	}
	public static void selectedWrong(){
		if(playerStats.CP > 0){
			playerStats.CP = playerStats.CP - decreaseCP;
			UserInterface.ChancePointsNumberLabel.setText("<html><center>" + playerStats.CP + "<center><html>");
		}
	}
}
	/*Mostly Dialogue
	public void intro0Game() {//Get name
		ui.bgPanel.setBackground(Color.BLACK);
		game.currentDialogue = "intro0";
		diatextTracker = 0;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
		ui.dialogueBox.setText(null);
			game.nextDialogue = "genderSelect";
	}
	public void genderSelect(){
		diatextTracker = 0;
		ui.bgPanel.setBackground(Color.BLACK);
		game.currentDialogue = "genderSelect";
		game.nextDialogue = "intro1";
	}
	public void intro1Game(){//A world a new
		ui.bgPanel.setBackground(Color.BLACK);
		game.currentDialogue = "intro1";
		diatextTracker = 1;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
		nameGen = name.toCharArray();
				game.nextDialogue = "intro2";
	}
	public void intro2Game() {//Birds chirping...
		ui.bgPanel.setBackground(Color.BLACK);
		game.currentDialogue = "intro2";
		diatextTracker = 2;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			sm.se.setFile2(sm.birdsfx); 
			sm.se.playBirdSFX(); 
			game.nextDialogue = "intro3";
	}
	public void intro3Game() {//Different...
		ui.bgPanel.setBackground(Color.BLACK);
		game.currentDialogue = "intro3";
		diatextTracker = 3;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue(); 
			game.nextDialogue = "intro3to4";
			//game.nextDialogue = "intro4";
	}
	public void intro3to4(){//Fade In
		sm.se.setFile4(sm.alarmclocksfx);
		sm.se.alarmclockSFX.start();
		game.currentDialogue = "intro3to4";
		ui.bgPanel.remove(bgHolder);
		fadeIn bedroomIn = new fadeIn(bedroom);
		ui.gameWindow.add(bedroomIn);
		ui.gameWindow.setVisible(true);
		ui.dialogueBox.setText(null);
			game.nextDialogue = "intro4";
	}
	public void intro4Game() {//Bedroom
		game.currentDialogue = "intro4";
		diatextTracker = 4;
		fadeIn bedroomIn = new fadeIn(bedroom);
		bedroomIn.fadeInTimer.stop();
		ui.gameWindow.remove(bedroomIn);
				ui.bgPanel.add(bgHolder);
				bgHolder.setIcon(images.bedroomView);
				ui.bgPanel.setVisible(true);
				startDialogue();
			game.nextDialogue = "intro5";
	}
	public void intro5Game() {//A new day...
		game.currentDialogue = "intro5";
		diatextTracker = 5;
		bgHolder.setIcon(images.bedroomView);
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "intro5to6";
	}
	public void intro5to6(){
		game.currentDialogue = "intro5to6";
		sm.se.setFile5(sm.outofbedsfx);
		sm.se.outofbedSFX.start();
		ui.bgPanel.remove(bgHolder);
		Screen bedroomFadeOut = new Screen(bedroom);
		//ui.gameWindow.add(bedroomFadeOut);
		ui.gameWindow.add(bedroomFadeOut);
			game.nextDialogue = "intro6";
	}
	public void intro6Game() {//City view
		game.currentDialogue = "intro6";
		diatextTracker = 6;
		Screen bedroomFadeOut = new Screen(bedroom);
		bedroomFadeOut.alphaTimer.stop();
		//ui.gameWindow.remove(bedroomFadeOut);
		ui.gameWindow.remove(bedroomFadeOut);
		ui.mainTextArea.setFont(narrationFont);
			sm.se.setFile3(sm.curtainsfx);
			sm.se.curtainSFX.start();
				pauseTime = 3000;
				pause();
				ui.bgPanel.add(bgHolder);
				ui.bgPanel.setVisible(true);
				bgHolder.setIcon(images.cityView);
	
		startDialogue();
			game.nextDialogue = "intro6toEnd";	
	}
	public void intro6toEnd(){
		game.currentDialogue = "intro6toEnd";
		ui.bgPanel.remove(bgHolder);
		Screen cityFadeOut = new Screen(city);
		//ui.gameWindow.add(bedroomFadeOut);
		ui.gameWindow.add(cityFadeOut);
			game.nextDialogue = "introEnd";
	}

	//First choice of the game or First Scene Transition
	public void amBedroom() {
		game.currentDialogue = "introEnd";
		game.currentQuestion = "afterBed";
		enableKeys = 0;
		questiontextTracker = 0;
		ui.choicePanel.setVisible(true);
			ui.bgPanel.add(bgHolder);
				bgHolder.setIcon(images.bedroomView);
				ui.bgPanel.setVisible(true);
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(null);
		choiceTimer.start();
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
		bgHolder.setIcon(images.bedroomView);
		game.currentDialogue = "bedroomExit11";
		enableKeys = 1;
		diatextTracker = 7;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "gbedroomExit12";
	}
	public void bedroomStudy11() {
		bgHolder.setIcon(images.bedroomView);
		diatextTracker = 8;
		enableKeys = 1;
		game.currentDialogue = "bedroomStudy11";
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "gbedroomExit12";
	}
	public void bedroomSS11() {
		bgHolder.setIcon(images.cityView);
		game.currentDialogue = "bedroomSS11";
		diatextTracker = 9;
		enableKeys = 1;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
				game.nextDialogue = "scolding11";
	}
	public void bedroomSleep11() {
		ui.bgPanel.setBackground(Color.BLACK);
		game.currentDialogue = "bedroomSleep11";
		diatextTracker = 10;
		enableKeys = 1;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "scolding11";
	}

	public void goodbedroomExit12() {
		sm.se.setFile7(sm.doorsfx);
		sm.se.doorSFX.start();
		pauseTime = 3000;
		pause();
		game.currentDialogue = "gbedroomExit12";
		diatextTracker = 11;
			CutsceneMaker livingroomCutscene = new CutsceneMaker(momSprite, livingroom);
				ui.gameWindow.add(livingroomCutscene);
		diatextTracker = 11;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			increaseCP = 1;
			selectedRight();
				ui.mainTextArea.append(name + "!");
				game.nextDialogue = "gbedroomExit13";
	}
	public void goodbedroomExit13() {
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "gbedroomExit13";	
		diatextTracker = 12;
			ui.mainTextArea.setFont(normalFont);
			startDialogue();
				game.nextDialogue = "explanation1";
	}	
	
	
	public void scolding11() {
		bgHolder.setIcon(images.bedroomView);
		game.currentDialogue = "scolding11";
		diatextTracker = 13;
		ui.mainTextArea.setText("");
			pauseTime = 8000;
			this.pause();
				ui.mainTextPanel.setVisible(true);
				ui.playerStatsPanel.setVisible(true);
		DiaTimer.setDelay(7);
			ui.mainTextArea.setFont(hyperboleFont);
			startDialogue();
			decreaseCP = 1;
			selectedWrong();
				game.nextDialogue = "bbedroomExit12";
	}
	public void badbedroomExit12() {
		bgHolder.setIcon(images.livingroomView);
		sm.se.setFile7(sm.doorsfx);
		sm.se.doorSFX.start();
		pauseTime = 3000;
		pause();
		game.currentDialogue = "bbedroomExit12";
		diatextTracker = 14;
		ui.bgPanel.setVisible(true);
			bgHolder.setIcon(images.livingroomView);
		DiaTimer.setDelay(normalSpeed);
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "bbedroomExit13";
	}
	public void badbedroomExit13() {
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "bbedroomExit13";
		diatextTracker = 15;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "explanation1";
	}

	public void explanation1(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "explanation1";
		diatextTracker = 16;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "explanation2";
	}
	public void explanation2(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "explanation2";
		diatextTracker = 17;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "explanation3";
	}
	public void explanation3(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "explanation3";
		diatextTracker = 18;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			if(player.CP == player.maxCP){
				game.nextDialogue = "setupFirstQuestion";	
			}
			else{
				game.nextDialogue = "bbedroomExit14";
			}
	}

	public void badbedroomExit14() {
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "bbedroomExit14";
		diatextTracker = 19;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "sidefirstQuestion";
	}

	public void setupFirstQuestion(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "setupFirstQuestion";
		diatextTracker = 20;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "preFirstQuestion";
	}
	// public void preFirstQuestion(){
	// 	bgHolder.setIcon(livingroomView);
	// 	game.currentDialogue = "preFirstQuestion";
	// 	diatextTracker = 21;
	// 	ui.mainTextArea.setFont(normalFont);
	// 	startDialogue();
	// 		game.nextDialogue = "firstQuestion";
	// }

	public void sidefirstQuestion() {
		game.currentDialogue = "sidefirstQuestion";
		game.currentQuestion = "sidefirstQuestion";
		bgHolder.setIcon(images.livingroomView);
		questiontextTracker = 1;
		ui.dialoguePanel.setVisible(false);
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(null);
		choiceTimer.start();
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
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "sfhincorrect0";
		diatextTracker = 22;
		ui.dialoguePanel.setVisible(true);
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "sfincorrect0";
	}
	public void answerPleasure(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "sfpincorrect0";
		diatextTracker = 23;
		ui.dialoguePanel.setVisible(true);
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "sfincorrect0";
	}
	public void answerSleepiness(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "sfscorrect0";
		diatextTracker = 24;
		ui.dialoguePanel.setVisible(true);
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "sfcorrect0";
	}
	public void answerAggressiveness(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "sfaincorrect0";
		diatextTracker = 25;
		ui.dialoguePanel.setVisible(true);
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "sfincorrect0";
	}
	
	public void rightMelatonin() {
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "sfcorrect0";
		diatextTracker = 26;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
		increaseCP = 1; 
		selectedRight();
			player.XP+=2;
			ui.XPNumberLabel.setText("<html><center>" + player.XP + "<center><html>");

			game.nextDialogue = "preFirstQuestion";
	}
	public void wrongMelatonin(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "sfincorrect0";
		diatextTracker = 26;
		game.currentDialogue = "preFirstQuestion";
		diatextTracker = 27;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
		decreaseCP = 1;
		selectedWrong();
			game.nextDialogue = "preFirstQuestion";
	}
	
	public void preFirstQuestion(){
		game.currentDialogue = "preFirstQuestion";
		bgHolder.setIcon(images.livingroomView);
		diatextTracker = 27;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "firstQuestion";
	}

	
	//First Question but second choice
	public void firstQuestion() {
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "firstQuestion";
		game.currentQuestion = "firstQuestion";
		questiontextTracker = 2;
		ui.dialoguePanel.setVisible(false);
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(null);
		choiceTimer.start();
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
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "correct1";
		diatextTracker = 28;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
		increaseCP = 1;
		selectedRight();
		player.XP+=7;
			ui.XPNumberLabel.setText("<html><center>" + player.XP + "<center><html>");

			game.nextDialogue = "secondQuestion";
	}
	public void wrongFirst(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "incorrect1";
		diatextTracker = 29;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
		decreaseCP = 1;
		selectedWrong();
			game.nextDialogue = "secondQuestion";
	}

	//Second Question
	public void secondQuestion(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "secondQuestion";
		game.currentQuestion = "secondQuestion";
		questiontextTracker = 3;
		ui.dialoguePanel.setVisible(false);
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(null);
		choiceTimer.start();
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
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "correct2";
		diatextTracker = 30;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
		increaseCP = 1;
		selectedRight();
			player.XP+=3;
				ui.XPNumberLabel.setText("<html><center>" + player.XP + "<center><html>");

			game.nextDialogue = "afterQAOne";
	}
	public void wrongSecond(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "incorrect2";
		diatextTracker = 31;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
		decreaseCP = 1;
		selectedWrong();
			game.nextDialogue = "afterQAOne";
	}

	public void afterQAOne(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "afterQAOne";
		diatextTracker = 32;
			ui.mainTextArea.setFont(normalFont);
			startDialogue();
			sm.se.setFile8(sm.brushteethsfx);
			sm.se.brushteethSFX.start();
				pauseTime = 9000;
				pause();
			sm.se.setFile6(sm.showersfx);
			sm.se.showerSFX.start();
				pauseTime = 8000;
				pause();
			game.nextDialogue = "sceneOneEnd";
	}
	public void sceneOneEnd(){
		bgHolder.setIcon(images.livingroomView);
		game.currentDialogue = "sceneOneEnd";
		if(player.CP>= 8){
			diatextTracker = 33;
		}
		else{
			diatextTracker = 34;
		}
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "exitHouse";
	}
	public void exitHouse(){
		ui.bgPanel.setBackground(Color.BLACK);
		sm.se.setFile7(sm.doorsfx);
		sm.se.doorSFX.start();
		pauseTime = 3000;
		pause();
		game.currentDialogue = "exitHouse";
		diatextTracker = 35;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "sceneTwoStart";
	}

	//Scene Two (Offering Help)
	public void sceneTwoStart(){
		game.currentDialogue = "sceneTwo";
		ui.bgPanel.setVisible(true);
		ui.bgPanel.add(bgHolder);
		bgHolder.setIcon(images.bayRouteView);
		diatextTracker = 36;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "suddenRain";
	}
	public void suddenRain(){
		game.currentDialogue = "suddenRain";
		diatextTracker = 37;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "suddenRain2";
	}
	public void suddenRain2(){
		game.currentDialogue = "suddenRain2";
		diatextTracker = 38;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "crushStart";
	}

	//Crush Situation
	public void crushStart(){
		game.currentDialogue = "crushStart";
		diatextTracker = 38;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "helpAsked";
	}
	public void helpAsked(){
		game.currentDialogue = "helpAsked";
		diatextTracker = 39;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "HelpOrIgnore";
	}
	public void HelpOrIgnore(){
		game.currentDialogue = "HelpOrIgnore";
		game.currentQuestion = "HelpOrIgnore";
		questiontextTracker = 4;
		ui.dialoguePanel.setVisible(false);
		ui.mainTextArea.setFont(narrationFont);
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(null);
		choiceTimer.start();
			ui.choice1.setText("Help");
			ui.choice2.setText("Ignore");
			ui.choice3.setText(null);
			ui.choice4.setText(null);
			
			game.nextPosition1 = "helped";
			game.nextPosition2 = "ignored";
			game.nextPosition3 = null;
			game.nextPosition4 = null;
	}

	//Crush Helped
	public void crushHelped1(){
		game.currentDialogue = "crushHelped1";
		diatextTracker = 40;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "crushHelped2";
	}
	public void crushHelped2(){
		game.currentDialogue = "crushHelped2";
		diatextTracker = 41;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "crushHelped3";
	}
	public void crushHelped3(){
		game.currentDialogue = "crushHelped3";
		diatextTracker = 42;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "crushHelped4";
	}
	public void crushHelped4(){
		game.currentDialogue = "crushHelped4";
		diatextTracker = 43;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "AtSchool";
	}
	//Crush Ignored
	public void crushIgnored(){
		game.currentDialogue = "crushIgnored";
		diatextTracker = 44;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
		selectedWrong();
			game.nextDialogue = "AtSchool";
	}

	public void AtSchool(){
		game.currentDialogue = "AtSchool";
		diatextTracker = 45;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "friends1";
	}

	//Friends talking
	public void friends1(){ //friend1
		game.currentDialogue = "friends1";
		diatextTracker = 46;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "friends2";
	}
	public void friends2(){ //friend1
		game.currentDialogue = "friends2";
		diatextTracker = 47;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "friends3";
	}
	public void friends3(){ //friend1
		game.currentDialogue = "friends3";
		diatextTracker = 48;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "friends4";
	}
	public void friends4(){ //friend1
		game.currentDialogue = "friends4";
		diatextTracker = 49;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "cafeteria1";
	}

	//At Cafeteria
	public void cafeteria1(){
		game.currentDialogue = "cafeteria1";
		diatextTracker = 50;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "cafeteria2";
	}
	public void cafeteria2(){
		game.currentDialogue = "cafeteria2";
		diatextTracker = 50;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "cafeteria3";
	}
	public void cafeteria3(){
		game.currentDialogue = "cafeteria3";
		diatextTracker = 51;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "cafeteria4";
	}
	public void cafeteria4(){
		game.currentDialogue = "cafeteria4";
		diatextTracker = 52;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "cafeteria4";
	}
}*/
