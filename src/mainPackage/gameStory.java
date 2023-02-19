package mainPackage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

import mainPackage.storyLines.dialogues;
import mainPackage.storyLines.questions;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class gameStory implements java.io.Serializable{
	
	Game game;
	UserInterface ui;
	TransitionClass sceneChanger;
	soundManager sm;
	Screen screen;
	playerStats player;
	storyLines lines;
	static String defaultBg = "temp1.png", bedroom = "bedroom.png", 
					city = "temp3.jpg", bayRoute = "temp4.png", 
					livingroom = "livingRoom.jpg", identifier;
	
	Font narrationFont = new Font("Times New Roman", Font.ITALIC, 35);
	Font normalFont = new Font ("Arial", Font.PLAIN, 35);
	Font hyperboleFont = new Font ("Papyrus", Font.BOLD, 40);
	
		int letterTracker = 0, arrayNumber, pauseTime = 0, normalSpeed = 30, fastSpeed = 5, enableKeys = 0, 
			increaseXP = 0, increaseCP = 0, decreaseCP = 0, number = 0;

		int diatextTracker = 0, questiontextTracker = 0;

			ImageIcon bedroomView = new ImageIcon(getClass().getClassLoader().getResource("bedroom.png")),
					cityView = new ImageIcon(getClass().getClassLoader().getResource("temp3.jpg")),
					bayRouteView = new ImageIcon(getClass().getClassLoader().getResource("temp4.png")),
					livingroomView = new ImageIcon(getClass().getClassLoader().getResource("livingRoom.jpg"));

		char DiaGen[], choiceGen[], nameGen[];
		String name;
		
		JLabel bgHolder = new JLabel();

	public gameStory(Game g, UserInterface UI, TransitionClass sc, soundManager SM, playerStats pStats) {	
				game = g; ui = UI; sceneChanger = sc; sm = SM; player = pStats;
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
				diatextTracker++;
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
				questiontextTracker++;
				sceneChanger.showChoices();
			}
		}
	});

	//For simple dialogue moments	
	public void dialogueTracker(String nextDialogue) {
		switch(nextDialogue){
		case "intro0":    	intro0Game(); break; 
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
		case "firstQuestion": firstQuestion(); break;
		case "secondQuestion": secondQuestion(); break;

		case "afterQAOne": afterQAOne(); break;
		case "sceneOneEnd": sceneOneEnd(); break;

		case "exitHouse": exitHouse(); break;

		}
	}
	
	//For choice making moments
	public void progressTracker(String nextMove) {
		switch(nextMove) {
			case "bedroomExit11": bedroomExit11(); sceneChanger.showDialogue(); break;
			case "bedroomStudy11": bedroomStudy11(); sceneChanger.showDialogue(); break;		
			case "bedroomSS11": bedroomSS11();  sceneChanger.showDialogue(); ui.bgPanel.setVisible(true); bgHolder.setIcon(cityView); break;		
			case "bedroomSleep11": bedroomSleep11(); sceneChanger.showDialogue(); break;	
				
			case "sfhincorrect0": answerHappiness(); sceneChanger.showDialogue(); break;
			case "sfpincorrect0": answerPleasure(); sceneChanger.showDialogue(); break;
			case "sfscorrect0": answerSleepiness(); sceneChanger.showDialogue(); break;
			case "sfaincorrect0": answerAggressiveness(); sceneChanger.showDialogue(); break;
			
			case "correct1": rightFirst(); sceneChanger.showDialogue(); break;
			case "incorrect1": wrongFirst(); sceneChanger.showDialogue(); break;

			case "correct2": rightSecond(); sceneChanger.showDialogue(); break;
			case "incorrect2": wrongSecond(); sceneChanger.showDialogue(); break;
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
			game.nextDialogue = "intro1";
	}
	public void intro1Game(){//A world a new
		game.saveAction();
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
		sm.se.birdSFX.stop();
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
		fadeIn bedroomIn = new fadeIn(bedroom);
		ui.gameWindow.add(bedroomIn);
		ui.gameWindow.setVisible(true);
			game.nextDialogue = "intro4";
	}
	public void intro4Game() {//Bedroom
		sm.se.alarmclockSFX.stop();
		game.currentDialogue = "intro4";
		diatextTracker = 4;
		fadeIn bedroomIn = new fadeIn(bedroom);
		bedroomIn.fadeInTimer.stop();
		ui.gameWindow.remove(bedroomIn);
				ui.bgPanel.add(bgHolder);
				bgHolder.setIcon(bedroomView);
				ui.bgPanel.setVisible(true);
				startDialogue();
			game.nextDialogue = "intro5";
	}
	public void intro5Game() {//A new day...
		game.currentDialogue = "intro5";
		diatextTracker = 5;
		bgHolder.setIcon(bedroomView);
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "intro5to6";
			
	}
	public void intro5to6(){
		sm.se.setFile5(sm.outofbedsfx);
		sm.se.outofbedSFX.start();
		game.currentDialogue = "intro5to6";
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
				bgHolder.setIcon(cityView);
	
		startDialogue();
			game.nextDialogue = "intro6toEnd";	
	}
	public void intro6toEnd(){
		sm.se.curtainSFX.stop();
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
		enableKeys = 0;
		questiontextTracker = 0;
		ui.choicePanel.setVisible(true);
			ui.bgPanel.add(bgHolder);
				bgHolder.setIcon(bedroomView);
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
		bgHolder.setIcon(bedroomView);
		game.currentDialogue = "bedroomExit11";
		enableKeys = 1;
		diatextTracker = 7;
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "gbedroomExit12";
	}
	public void bedroomStudy11() {
		bgHolder.setIcon(bedroomView);
		diatextTracker = 8;
		enableKeys = 1;
		game.currentDialogue = "bedroomStudy11";
		ui.mainTextArea.setFont(narrationFont);
		startDialogue();
			game.nextDialogue = "gbedroomExit12";
	}
	public void bedroomSS11() {
		bgHolder.setIcon(cityView);
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
		bgHolder.setIcon(livingroomView);
		sm.se.setFile7(sm.doorsfx);
		sm.se.doorSFX.start();
		pauseTime = 3000;
		pause();
		game.currentDialogue = "gbedroomExit12";
		diatextTracker = 11;
		ui.bgPanel.setVisible(true);
			bgHolder.setIcon(livingroomView);
			diatextTracker = 11;
			pauseTime = 750;
			pause();
			ui.mainTextArea.setFont(normalFont);
			startDialogue();
			increaseCP = 1;
			selectedRight();
				ui.mainTextArea.append(name + "!");
				game.nextDialogue = "gbedroomExit13";
	}
	public void goodbedroomExit13() {
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "gbedroomExit13";	
		diatextTracker = 12;
			pauseTime=750;
			pause();
			ui.mainTextArea.setFont(normalFont);
			startDialogue();
				game.nextDialogue = "explanation1";
	}	
	
	public void scolding11() {
		bgHolder.setIcon(bedroomView);
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
		bgHolder.setIcon(livingroomView);
		sm.se.setFile7(sm.doorsfx);
		sm.se.doorSFX.start();
		pauseTime = 3000;
		pause();
		game.currentDialogue = "bbedroomExit12";
		diatextTracker = 14;
		ui.bgPanel.setVisible(true);
			bgHolder.setIcon(livingroomView);
		DiaTimer.setDelay(normalSpeed);
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "bbedroomExit13";
	}
	public void badbedroomExit13() {
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "bbedroomExit13";
		diatextTracker = 15;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "explanation1";
	}

	public void explanation1(){
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "explanation1";
		diatextTracker = 16;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "explanation2";
	}
	public void explanation2(){
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "explanation2";
		diatextTracker = 17;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "explanation3";
	}
	public void explanation3(){
		bgHolder.setIcon(livingroomView);
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
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "bbedroomExit14";
		diatextTracker = 19;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "sidefirstQuestion";
	}

	public void setupFirstQuestion(){
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "setupFirstQuestion";
		diatextTracker = 20;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "prefirstQuestion";
	}

	public void sidefirstQuestion() {
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "sidefirstQuestion";
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
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "sfhincorrect0";
		diatextTracker = 21;
		ui.dialoguePanel.setVisible(true);
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "sfincorrect0";
	}
	public void answerPleasure(){
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "sfpincorrect0";
		diatextTracker = 22;
		ui.dialoguePanel.setVisible(true);
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "sfincorrect0";
	}
	public void answerSleepiness(){
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "sfscorrect0";
		diatextTracker = 23;
		ui.dialoguePanel.setVisible(true);
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "sfcorrect0";
	}
	public void answerAggressiveness(){
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "sfaincorrect0";
		diatextTracker = 24;
		ui.dialoguePanel.setVisible(true);
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "sfincorrect0";
	}
	
	public void rightMelatonin() {
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "sfcorrect0";
		diatextTracker = 25;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
		increaseCP = 1; 
		selectedRight();
			player.XP+=2;
			ui.XPNumberLabel.setText("<html><center>" + player.XP + "<center><html>");

			game.nextDialogue = "setupFirstQuestion";
	}
	public void wrongMelatonin(){
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "preFirstQuestion";
		diatextTracker = 26;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
		decreaseCP = 1;
		selectedWrong();
			game.nextDialogue = "preFirstQuestion";
	}

	public void preFirstQuestion(){
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "preFirstQuestion";
		diatextTracker = 27;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "firstQuestion";
	}
	
	//First Question but second choice
	public void firstQuestion() {
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "firstQuestion";
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
		bgHolder.setIcon(livingroomView);
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
		bgHolder.setIcon(livingroomView);
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
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "secondQuestion";
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
		bgHolder.setIcon(livingroomView);
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
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "incorrect2";
		diatextTracker = 31;
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
		decreaseCP = 1;
		selectedWrong();
			game.nextDialogue = "afterQAOne";
	}

	public void afterQAOne(){
		bgHolder.setIcon(livingroomView);
		game.currentDialogue = "afterQAOne";
		diatextTracker = 32;
			sm.se.setFile8(sm.brushteethsfx);
			sm.se.brushteethSFX.start();
				pauseTime = 9000;
				pause();
			sm.se.setFile6(sm.showersfx);
			sm.se.showerSFX.start();
				pauseTime = 8000;
				pause();
		ui.mainTextArea.setFont(normalFont);
		startDialogue();
			game.nextDialogue = "sceneOneEnd";
	}
	public void sceneOneEnd(){
		bgHolder.setIcon(livingroomView);
		sm.se.brushteethSFX.stop();
		sm.se.showerSFX.stop();
		game.currentDialogue = "sceneOneEnd";
		if(player.CP>= 8){
			diatextTracker = 33;
		}
		else{
			diatextTracker = 34;
		}
		ui.mainTextArea.setFont(normalFont);
		pauseTime = 1500;
		pause();
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
			game.nextDialogue = "preHelp1";
	}

	//Scene Two (Offering Help)
	public void preHelp1(){

	}
}
