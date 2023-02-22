package mainPackage;

import javax.swing.JLabel;
import javax.swing.Timer;

import mainPackage.storyLines.dialogues;
import mainPackage.storyLines.questions;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.Serializable;

public class gameStory implements Serializable{
	
	Game game;
	UserInterface ui;
	TransitionClass sceneChanger;
	soundManager sm;
	Screen screen;
	playerStats player;
	storyLines lines;
	ImageManager images;

	static String defaultBg = "temp1.png", bedroom = "bedroom.png", 
					city = "temp3.jpg", bayRoute = "temp4.png", 
					livingroom = "livingRoom.jpg", identifier;
	
	Font narrationFont = new Font("Times New Roman", Font.ITALIC, 35);
	Font normalFont = new Font ("Arial", Font.PLAIN, 35);
	Font hyperboleFont = new Font ("Papyrus", Font.BOLD, 40);
	
		int letterTracker = 0, arrayNumber, pauseTime = 0, normalSpeed = 30, fastSpeed = 5, enableKeys = 0, 
			increaseXP = 0, increaseCP = 0, decreaseCP = 0, number = 0;

		int diatextTracker = 0, questiontextTracker = 0;

		char DiaGen[], choiceGen[], nameGen[];
		String name;
		
		JLabel bgHolder = new JLabel();

	public gameStory(Game g, UserInterface UI, TransitionClass sc, soundManager SM, playerStats pStats, ImageManager imgManage) {	
				game = g; ui = UI; sceneChanger = sc; sm = SM; player = pStats; images = imgManage;
	}
	
	public void startStats(){
		player.maxCP = 10;
		player.XP = 0;
			ui.XPNumberLabel.setText("<html><center>" + player.XP + "<center><html>");
		player.CP = 10;
			ui.ChancePointsNumberLabel.setText("<html><center>" + player.CP + "<center><html>");
	}

	public void pause() {
		try {
			Thread.sleep(pauseTime);
		}
		catch(Exception e) {
			
		}
	}

	//INTRO GENERATION
	Timer DiaTimer = new Timer(normalSpeed, new ActionListener(){
		public void actionPerformed(ActionEvent ie) {
			enableKeys = 0;
			ui.dialoguePanel.setVisible(false);
			DiaGen = dialogues.diaText[diatextTracker].toCharArray();
			arrayNumber = DiaGen.length;
			
				if((letterTracker%3) == 0){
					sm.se.setFile1(sm.typesfx);
					sm.se.playTypeSFX();
				}
				
			String letterGen = "";
			String space = "";
		
			letterGen = space + DiaGen[letterTracker]; 
			ui.mainTextArea.append(letterGen);
			
			letterTracker++;
			if(letterTracker == arrayNumber) {
				letterTracker = 0;
				DiaTimer.stop();
				//diatextTracker++;
				ui.dialoguePanel.setVisible(true);
				enableKeys = 1;
			}
		}
	});

	//DECISION MOMENT ANIMATION
	Timer choiceTimer = new Timer(normalSpeed, new ActionListener(){
		public void actionPerformed(ActionEvent c) {
			ui.dialoguePanel.setVisible(false);
			choiceGen = questions.questionText[questiontextTracker].toCharArray();
			arrayNumber = choiceGen.length;
			
				if((letterTracker%2) == 0){
					sm.se.setFile1(sm.typesfx);
					sm.se.playTypeSFX();
				}
				
			String letterGen = "";
			String space = "";
			
			letterGen = space + choiceGen[letterTracker]; 
			ui.mainTextArea.append(letterGen);
			
			letterTracker++;
			if(letterTracker == arrayNumber) {
				letterTracker = 0;
				choiceTimer.stop();
				//questiontextTracker++;
				sceneChanger.showChoices();
			}
		}
	});

	//For simple dialogue moments	
	public void dialogueTracker(String nextDialogue) {
		switch(nextDialogue){
		case "intro0":    	intro0Game(); break; 
		case "genderSelect": sceneChanger.genderSelect(); genderSelect(); break;
		case "intro1":   	sceneChanger.showDialogue(); intro1Game(); break;
		case "intro2":    	intro2Game(); break;
		case "intro3":    	intro3Game(); break;
		case "intro3to4": 	intro3to4(); break;
		case "intro4":    	sceneChanger.showDialogue(); intro4Game(); break;
		case "intro5": 	  	intro5Game(); break;
		case "intro5to6": 	intro5to6(); break;
		case "intro6":    	sceneChanger.showDialogue(); intro6Game(); break;
		case "intro6toEnd": intro6toEnd(); break;
		case "introEnd":  	amBedroom(); break;
			
			case "gbedroomExit12": sceneChanger.showDialogue(); goodbedroomExit12(); break;
			case "gbedroomExit13": goodbedroomExit13(); break;
		
			case "scolding11": sceneChanger.showDialogue(); scolding11(); break;
				case "bbedroomExit12": badbedroomExit12(); break;
				case "bbedroomExit13": badbedroomExit13(); break;

			case "explanation1": explanation1(); break;
			case "explanation2": explanation2(); break;
			case "explanation3": explanation3(); break;

				case "bbedroomExit14": badbedroomExit14(); break;  
				case "sidefirstQuestion": sidefirstQuestion(); break;
					case "sfcorrect0": rightMelatonin(); break;
					case "sfincorrect0": wrongMelatonin(); break;

		case "setupFirstQuestion": setupFirstQuestion(); break;
		case "preFirstQuestion": preFirstQuestion(); break;

		//case "preFirstQuestion": preFirstQuestion(); break;
		case "firstQuestion": firstQuestion(); break;
		case "secondQuestion": secondQuestion(); break;

		case "afterQAOne": afterQAOne(); break;
		case "sceneOneEnd": sceneOneEnd(); break;

		case "exitHouse": exitHouse(); break;

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
}
	
	//For choice making moments
	public void progressTracker(String nextMove) {
		switch(nextMove) {
			case "afterBed": amBedroom(); break;
				case "bedroomExit11": bedroomExit11(); sceneChanger.showDialogue(); break;
				case "bedroomStudy11": bedroomStudy11(); sceneChanger.showDialogue(); break;		
				case "bedroomSS11": bedroomSS11();  sceneChanger.showDialogue(); ui.bgPanel.setVisible(true); 
									bgHolder.setIcon(images.cityView); break;		
				case "bedroomSleep11": bedroomSleep11(); sceneChanger.showDialogue(); break;	
				
			case "sidefirstQuestion": sidefirstQuestion(); break;
				case "sfhincorrect0": answerHappiness(); sceneChanger.showDialogue(); break;
				case "sfpincorrect0": answerPleasure(); sceneChanger.showDialogue(); break;
				case "sfscorrect0": answerSleepiness(); sceneChanger.showDialogue(); break;
				case "sfaincorrect0": answerAggressiveness(); sceneChanger.showDialogue(); break;
			
			case "firstQuestion": firstQuestion(); break;
				case "correct1": rightFirst(); sceneChanger.showDialogue(); break;
				case "incorrect1": wrongFirst(); sceneChanger.showDialogue(); break;

			case "secondQuestion": secondQuestion(); break;
				case "correct2": rightSecond(); sceneChanger.showDialogue(); break;
				case "incorrect2": wrongSecond(); sceneChanger.showDialogue(); break;
			
			case "HelpOrIgnore": HelpOrIgnore(); break;
				case "helped": crushHelped1(); sceneChanger.showDialogue(); break;
				case "ignored": crushIgnored(); sceneChanger.showDialogue(); break;
		}
	}
	public void startDialogue(){
		number++;
		increaseCP = 0; decreaseCP = 0;
		ui.mainTextArea.setText("");
		ui.dialogueBox.setText(">");
		DiaTimer.start();
		enableKeys = 0;
		System.out.println("DIALOGUE SUCCESS: " + number);
	}
	public void selectedRight(){
		if(player.CP < player.maxCP){
			player.CP = player.CP + increaseCP;
			ui.ChancePointsNumberLabel.setText("<html><center>" + player.CP + "<center><html>");
		}
	}
	public void selectedWrong(){
		if(player.CP > 0){
			player.CP = player.CP - decreaseCP;
			ui.ChancePointsNumberLabel.setText("<html><center>" + player.CP + "<center><html>");
		}
	}

	//Mostly Dialogue
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
		bgHolder.setIcon(images.livingroomView);
		sm.se.setFile7(sm.doorsfx);
		sm.se.doorSFX.start();
		pauseTime = 3000;
		pause();
		game.currentDialogue = "gbedroomExit12";
		diatextTracker = 11;
		ui.bgPanel.setVisible(true);
			bgHolder.setIcon(images.livingroomView);
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
		bgHolder.setIcon(livingroomView);
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
}
