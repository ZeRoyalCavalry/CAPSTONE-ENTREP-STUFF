package mainPackage;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
//import java.awt.event.KeyListener;
import java.awt.Image;

import mainPackage.Game.AnswerHandler;
import mainPackage.Game.ChoiceHandler;
import mainPackage.Game.KeyboardHandler;
import mainPackage.Game.MouseHandler;
import mainPackage.Game.NameHandler;
import mainPackage.Game.SaveLoadHandler;

import javax.swing.border.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class UserInterface implements java.io.Serializable{

		public static JFrame gameWindow;

		public JPanel titlePanel, startButtonPanel, continueButtonPanel, mainTextPanel, 
						dialoguePanel, choicePanel, bgPanel, nameInputPanel, playerStatsPanel,
						introPanel, maleSelectPanel, femaleSelectPanel, nonSelectPanel, SpritePanel,
						submitAnswerPanel, westPanel, characterNamePanel, instructionsPanel, 
						notesPanel, closeMenuPanel, saveNotesPanel, notesMenu, notesNamePanel, LevelUpTextPanel,
						gameoverScreen, MQGOPanel, restartBTNPanel, quitBTNPanel, settingBTNPanel;

		public JLabel titleLabel, subtitleLabel, bgPic, introGIF, XPLabel, characterSprite, 
						ChancePointsLabel, characterNamen, npcName, notesNameLabel, gameoverText,
						motivatingText;

		public static JLabel ChancePointsNumberLabel, XPNumberLabel;

		public JButton startButton, continueButton, dialogueBox, nameInputBTN, 
						choice1, choice2, choice3, choice4, saveButton, loadButton,
						maleButton, femaleButton, inclusiveButton, submitInputBTN,
						instructions, notesBTN, closeNotesBTN, saveNotesBTN, exitLevelUpBoxBTN,
						restartBTN, quitBTN, settingsButton;

		public int alignSetMenuX, alignSetMenuY;

		public JPopupMenu settingsMenu;
		public JMenuItem exitOptionItem;

		public JTextPane mainTextArea, LevelUpTextArea;
		public JTextArea notesTextArea;
		public JTextField nameInput, answerInput;
		public JScrollPane notesPane;

		GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice device = graphics.getDefaultScreenDevice();
		
			Border outlinePanel = new LineBorder(Color.WHITE, 11, true), 
					outlineButton = new LineBorder(Color.WHITE, 8),
					outlineChoice = new LineBorder(Color.WHITE, 1);
		
		Font titleFont = new Font("Times New Roman", Font.PLAIN, 90), subtitleFont = new Font("Times New Roman", Font.PLAIN, 50),
			 statsFont = new Font("Yu Gothic UI", Font.BOLD, 28), normalFont = new Font ("Arial", Font.PLAIN, 30),
			 npcNameFont = new Font("Yu Gothic UI", Font.BOLD, 30);

		public void makeUI(ChoiceHandler cHandler, MouseHandler mHandler, NameHandler nHandler, KeyboardHandler kbHandler, 
							SaveLoadHandler SLHandler, AnswerHandler aHandler, int screenWidth, int screenHeight, storyLines lines, Game game) {
			// //Title Panel & Main Text Panel Scaling	
			// int titlePanelWidth = 1300;
			// int titlePanelHeight = 250;
			// int aligntitleX = (screenWidth/2) - (titlePanelWidth/2);
			// int aligntitleY = (screenHeight/6);

			int buttonPanelWidth = 340; int buttonPanelHeight = 90;
			//Start Button Panel Scaling
			int alignSBX = (int)Math.round((screenWidth/2.7) - (buttonPanelWidth/1.5)); int alignSBY = (int)Math.round(screenHeight/1.34);
			
			//Continue Button Panel Scaling
			int alignCBX = (int)Math.round((screenWidth/1.6) - (buttonPanelWidth/2.7)); int alignCBY = (int)Math.round(screenHeight/1.34);

			//Restart Button Panel Scaling
			int alignRBX = (int)Math.round((screenWidth/2.7) - (buttonPanelWidth/1.5)); int alignRBY = (int)Math.round(screenHeight/1.6);
			
			//Quit Button Panel Scaling
			int alignQBX = (int)Math.round((screenWidth/1.6) - (buttonPanelWidth/2.7)); int alignQBY = (int)Math.round(screenHeight/1.6);

			//Settings Button Panel 
			int settingBTNWidth = 27, settingBTNHeight = 50;
			int alignSetBTNPanelX = (int)Math.round(screenWidth/1.05); int alignSetBTNPanelY = (int)Math.round(screenHeight/12);
			alignSetMenuX = (int)Math.round(screenWidth/1.095); alignSetMenuY = (int)Math.round(screenHeight/7.8);

			//Sex/Gender Select Panels Scaling
			int alignMBX = (int)Math.round((screenWidth/2) - (buttonPanelWidth/2)); int alignMBY = (int)Math.round(screenHeight/5.50);

			int alignFBX = (screenWidth/2) - (buttonPanelWidth/2); int alignFBY = (int)Math.round(screenHeight/2.50);

			int alignNBX = (int)Math.round((screenWidth/2) - (buttonPanelWidth/2)); int alignNBY = (int)Math.round(screenHeight/1.60);

			//NPC Name Panel 
			int npcNameWidth = 1300; int npcNameHeight = 35;

			//Main Text Panel Scaling
			//mainTextPanel.setBounds(120,160,1300,250); 
			int mtpWidth = 1300; int mtpHeight = 230; 
			int alignMTPX = (screenWidth/2) - (mtpWidth/2); int alignMTPY = (int)Math.round(screenHeight - (mtpHeight/0.63));
			
			//Main Text Area Scaling
			int mtaWidth = 1200; int mtaHeight = 215;
			int alignMTAX = (screenWidth/2) - (mtaWidth/2); int alignMTAY = (int)Math.round(mtaHeight/5);

			//Notes Name Panel Scaling
			int notesNameWidth = 1400, notesNameHeight = 60;
			int alignNNPanelX = (screenWidth/2) - (notesNameWidth/2), alignNNPanelY = (screenHeight/14);

			//Notes Text Panel Scaling 
			int ntpWidth = 1400; int ntpHeight = 570;
			int alignNTPX = (screenWidth/2) - (ntpWidth/2); int alignNTPY = (int)Math.round(mtaHeight/1.5);

			//Notes Text Area Scaling
			int ntaWidth = 1350; int ntaHeight = 480;
			int alignNTAX = (screenWidth/2) - (ntaWidth/2); int alignNTAY = (int)Math.round(ntaHeight/13.5);
			
			//Dialogue Panel Scaling
			int diaConPanelWidth = 110; int diaConPanelHeight = 90;
			int alignDCPanelX = (screenWidth/2) - (diaConPanelWidth/2); int alignDCPanelY = (int)Math.round(diaConPanelHeight/2);
			
			//Choice Panel Scaling
			int choicePanelWidth = 800; int choicePanelHeight = 320;
			int alignCPanelX = (screenWidth/2) - (choicePanelWidth/2); int alignCPanelY = (int)Math.round(screenHeight/8);
			
			//Name Input Panel Scaling
			int inPWidth = 900; int inPHeight = 130;
			int alignINPanelX = (screenWidth/2) - (inPWidth/2); int alignINPanelY = (int)Math.round(mtaHeight/1.5);

			//Player Stats Panel Scaling
			int pspWidth = 1300; int pspHeight = 70; 
			int alignPSPanelX = (screenWidth/2) - (pspWidth/2); int alignPSPanelY = (int)Math.round(screenHeight - (pspHeight/0.48));

			//Close Menu Panel Scaling
			int closeMenuWidth = 150; int closeMenuHeight = 70; 
			int alignCMPanelX = (int)Math.round(screenWidth/3.5);int alignCMPanelY = (int)Math.round(screenHeight/1.20);

			//Save Notes Panel Scaling alignSMPanelX, alignSMPanelY, saveNotesWidth, saveMenuHeight
			int saveNotesWidth = 150; int saveMenuHeight = 70;
			int alignSMPanelX = (int)Math.round(screenWidth/1.75); int alignSMPanelY = (int)Math.round(screenHeight/1.20);

			//Game Over Panel
			int GameOverWidth = 1400, GameOverHeight = 150;
			int alignGOPanelX = (int)Math.round((screenWidth/2) - (GameOverWidth/2)); int alignGOPanelY = (int)Math.round(screenHeight/6);

			//Motivating Quote for Game Over Panel
			int MotivatePlayerWidth = 1400, MotivatePlayerHeight = 160;
			int alignMQGOPanelX = (int)Math.round((screenWidth/2) - (GameOverWidth/2)); int alignMQGOPanelY = (int)Math.round(screenHeight/2.65);

			//MAKE GAME WINDOW
			gameWindow = new JFrame();
				gameWindow.setTitle("Starlight High School and Its Curious Cases");
				gameWindow.setSize(screenWidth,screenHeight);
				gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gameWindow.getContentPane().setBackground(Color.BLACK);
				gameWindow.setUndecorated(true);
				//gameWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
				//gameWindow.setLayout(null);
			
			//Intro with GIF
			introPanel = new JPanel();
			introPanel.setBounds(0,-1,screenWidth,screenHeight);
			//introPanel.setBackground(Color.black);
				introGIF = new JLabel();
				introGIF.setBounds(0,-1, screenWidth, screenHeight);
						ImageIcon gameIntro = new ImageIcon(getClass().getClassLoader().getResource("newGameIntro.gif"));
								Image gameGIF = gameIntro.getImage();
								Image resizedIntro = gameGIF.getScaledInstance(screenWidth, screenHeight, Image.SCALE_DEFAULT);
								gameIntro = new ImageIcon(resizedIntro);
					introGIF.setIcon(gameIntro);
				introPanel.add(introGIF);
			gameWindow.add(introPanel);

			// //TITLE SCREEN
			// titlePanel = new JPanel();
			// 	//titlePanel.setBounds(120,160,1300,250);
			// 	titlePanel.setBounds(aligntitleX, aligntitleY, titlePanelWidth, titlePanelHeight);
			// 	titlePanel.setBorder(outlinePanel);
			// 	titlePanel.setBackground(Color.black);
				
			// titleLabel = new JLabel("<html><center>STARLIGHT HIGH SCHOOL <br/>AND ITS CURIOUS CASES<center><html>");
			// 	titleLabel.setForeground(Color.white);
			// 	titleLabel.setFont(titleFont);
			// 	//titleLabel.setBorder(outlinePanel);
			// 	titlePanel.add(titleLabel);
				
			//START BUTTON
			startButtonPanel = new JPanel();
				startButtonPanel.setBounds(alignSBX, alignSBY, buttonPanelWidth, buttonPanelHeight);
				startButtonPanel.setBackground(Color.BLACK);
				startButtonPanel.setBorder(outlineButton);
				
					startButton = new JButton("<html><center>START<center><html>");
						startButton.setBackground(Color.BLACK);
						startButton.setForeground(Color.WHITE);
						startButton.setFont(subtitleFont);
						startButton.setFocusPainted(false);
						startButton.setBorderPainted(false);
							startButton.addActionListener(cHandler);
							startButton.setActionCommand("start");
					startButtonPanel.add(startButton);
	
			//CONTINUE BUTTON
			continueButtonPanel = new JPanel();
				continueButtonPanel.setBounds(alignCBX, alignCBY, buttonPanelWidth, buttonPanelHeight);
				continueButtonPanel.setBackground(Color.BLACK);
				continueButtonPanel.setBorder(outlineButton);

					continueButton = new JButton("<html><center>CONTINUE<center><html>");
						continueButton.setBackground(Color.BLACK);
						continueButton.setForeground(Color.WHITE);
						continueButton.setFont(subtitleFont);
						continueButton.setFocusPainted(false);
						continueButton.setBorderPainted(false);
								continueButton.addActionListener(cHandler);
								continueButton.setActionCommand("continue");
					continueButtonPanel.add(continueButton);

			//Sex or Gender Select
			maleSelectPanel = new JPanel();
				maleSelectPanel.setBounds(alignMBX, alignMBY, buttonPanelWidth, buttonPanelHeight);
				maleSelectPanel.setBackground(Color.BLACK);
				maleSelectPanel.setBorder(outlineButton);
								
					maleButton = new JButton("<html><center>MALE<center><html>");
						maleButton.setBackground(Color.BLACK);
						maleButton.setForeground(Color.WHITE);
						maleButton.setFont(subtitleFont);
						maleButton.setFocusPainted(false);
						maleButton.setBorderPainted(false);
								maleButton.addActionListener(cHandler);
								maleButton.setActionCommand("male");
						maleSelectPanel.add(maleButton);

			femaleSelectPanel = new JPanel();
				femaleSelectPanel.setBounds(alignFBX, alignFBY, buttonPanelWidth, buttonPanelHeight);
				femaleSelectPanel.setBackground(Color.BLACK);
				femaleSelectPanel.setBorder(outlineButton);

					femaleButton = new JButton("<html><center>FEMALE<center><html>");
						femaleButton.setBackground(Color.BLACK);
						femaleButton.setForeground(Color.WHITE);
						femaleButton.setFont(subtitleFont);
						femaleButton.setFocusPainted(false);
						femaleButton.setBorderPainted(false);
								femaleButton.addActionListener(cHandler);
								femaleButton.setActionCommand("female");
						femaleSelectPanel.add(femaleButton);

			nonSelectPanel = new JPanel();
				nonSelectPanel.setBounds(alignNBX, alignNBY, buttonPanelWidth, buttonPanelHeight);
				nonSelectPanel.setBackground(Color.BLACK);
				nonSelectPanel.setBorder(outlineButton);

					inclusiveButton = new JButton("<html><center>OTHERS<center><html>");
						inclusiveButton.setBackground(Color.BLACK);
						inclusiveButton.setForeground(Color.WHITE);
						inclusiveButton.setFont(subtitleFont);
						inclusiveButton.setFocusPainted(false);
						inclusiveButton.setBorderPainted(false);
								inclusiveButton.addActionListener(cHandler);
								inclusiveButton.setActionCommand("inclusive");
						nonSelectPanel.add(inclusiveButton);
			
				gameWindow.add(maleSelectPanel);
				gameWindow.add(femaleSelectPanel);
				gameWindow.add(nonSelectPanel);

			//BGImage	
			bgPanel = new JPanel();
				bgPanel.setBounds(0,0,screenWidth,screenHeight);
				//bgPanel.setBackground(Color.black);
					bgPic = new JLabel();
					bgPic.setBounds(0,0, screenWidth, screenHeight);
						ImageIcon titlePic = new ImageIcon(getClass().getClassLoader().getResource("titlescreen.png"));
								Image titleImage = titlePic.getImage();
								Image resizedTitle = titleImage.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
								titlePic = new ImageIcon(resizedTitle);
					bgPic.setIcon(titlePic);
				bgPanel.add(bgPic);
					
			//gameWindow.add(titlePanel);
			gameWindow.add(startButtonPanel);
			gameWindow.add(continueButtonPanel);
			
			//ACTUAL GAME
			//Game Over Screen
			gameoverScreen = new JPanel();
				gameoverScreen.setBounds(alignGOPanelX, alignGOPanelY, GameOverWidth, GameOverHeight);
			 	gameoverScreen.setBorder(outlinePanel);
				gameoverScreen.setBackground(Color.black);
				
			 gameoverText = new JLabel("<html><center>YOU RAN OUT OF CHANCES. . . <center><html>");
			 	gameoverText.setForeground(Color.white);
			 	gameoverText.setFont(titleFont);
			 	gameoverScreen.add(gameoverText);
			gameWindow.add(gameoverScreen);

			MQGOPanel = new JPanel();
				MQGOPanel.setBounds(alignMQGOPanelX, alignMQGOPanelY, MotivatePlayerWidth, MotivatePlayerHeight);
			MQGOPanel.setBackground(Color.black);
			
			String MotivatingQuote[] = {"<html><center>A true learner perseveres, <br/>you can still try again!<center><html>",
										"<html><center>If one door closes, another opens. <br/> A new opportunity awaits... Try again!<center><html>",
										"<html><center>Victory goes to those who never surrender! <br/>You got it next time!<center><html>"};
			int randomQuote = (int)((Math.random()*2)+1);

		 	motivatingText = new JLabel("<html><center>"  + MotivatingQuote[randomQuote] +  "<center><html>");
			 	motivatingText.setForeground(Color.white);
			 	motivatingText.setFont(subtitleFont);
				MQGOPanel.add(motivatingText);
			gameWindow.add(MQGOPanel);

			restartBTNPanel = new JPanel();
				restartBTNPanel.setBounds(alignRBX, alignRBY, buttonPanelWidth, buttonPanelHeight);
				restartBTNPanel.setBackground(Color.BLACK);
				restartBTNPanel.setBorder(outlineButton);

					restartBTN = new JButton("<html><center>RESTART<center><html>");
						restartBTN.setBackground(Color.BLACK);
						restartBTN.setForeground(Color.WHITE);
						restartBTN.setFont(subtitleFont);
						restartBTN.setFocusPainted(false);
						restartBTN.setBorderPainted(false);
							restartBTN.addActionListener(cHandler);
							restartBTN.setActionCommand("continue");
						restartBTNPanel.add(restartBTN);
					gameWindow.add(restartBTNPanel);

			quitBTNPanel = new JPanel();
				quitBTNPanel.setBounds(alignQBX, alignQBY, buttonPanelWidth, buttonPanelHeight);
				quitBTNPanel.setBackground(Color.BLACK);
				quitBTNPanel.setBorder(outlineButton);
		
					quitBTN = new JButton("<html><center>QUIT<center><html>");
						quitBTN.setBackground(Color.BLACK);
						quitBTN.setForeground(Color.WHITE);
						quitBTN.setFont(subtitleFont);
						quitBTN.setFocusPainted(false);
						quitBTN.setBorderPainted(false);
							quitBTN.addActionListener(cHandler);
							quitBTN.setActionCommand("quit");
						quitBTNPanel.add(quitBTN);
					gameWindow.add(quitBTNPanel);

			//Text Area Holder
			mainTextPanel = new JPanel();
				//mainTextPanel.setBounds(120,160,1300,250);
				mainTextPanel.setBounds(alignMTPX, alignMTPY, mtpWidth, mtpHeight);
				mainTextPanel.setBackground(Color.BLACK);
				mainTextPanel.setBorder(outlinePanel);	
				mainTextPanel.addMouseListener(mHandler);
				mainTextPanel.addKeyListener(kbHandler);
				mainTextPanel.setOpaque(false);
				mainTextPanel.setLayout(new BorderLayout(0,0));
			gameWindow.add(mainTextPanel);	
			
			//Text Area
			mainTextArea = new JTextPane();
			mainTextArea.setText("");
				//mainTextArea.setBounds(150,185,1200,230);
				mainTextArea.setBounds(alignMTAX,alignMTAY,mtaWidth,mtaHeight);
				mainTextArea.setBackground(Color.black);
				mainTextArea.setForeground(Color.white);
				mainTextArea.setFont(normalFont);
					//mainTextArea.setLineWrap(true);
					//mainTextArea.setWrapStyleWord(true);
					mainTextArea.setEditable(false);
					mainTextArea.addMouseListener(mHandler);
					mainTextArea.addKeyListener(kbHandler);
				mainTextPanel.add(mainTextArea, BorderLayout.CENTER);

			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					mainTextArea.requestFocus();
				}
			});

			//Non-playable Character Name/ NPC Name Panel
				characterNamePanel = new JPanel();
					characterNamePanel.setBounds(0,0, npcNameWidth, npcNameHeight);
					characterNamePanel.setBackground(Color.black);
					characterNamePanel.setLayout(new BorderLayout());
						JPanel filler = new JPanel();
							filler.setSize(10,35);
							filler.setBackground(Color.BLACK);
					characterNamePanel.add(filler, BorderLayout.WEST);
						npcName = new JLabel("NPC NAME");
							npcName.setForeground(Color.white);
							npcName.setFont(npcNameFont);
					characterNamePanel.add(npcName, BorderLayout.CENTER);
				mainTextPanel.add(characterNamePanel, BorderLayout.NORTH);
		
			//West Border, just so it wont stick
				westPanel = new JPanel();
					westPanel.setBounds(1,0,diaConPanelWidth,diaConPanelHeight);
					westPanel.setBackground(Color.black);
				mainTextPanel.add(westPanel, BorderLayout.WEST);
				
			//Dialogue Continuation Button
			dialoguePanel = new JPanel();
				dialoguePanel.setBounds(alignDCPanelX,alignDCPanelY,diaConPanelWidth,diaConPanelHeight);
				dialoguePanel.setBackground(Color.black);	

			dialogueBox = new JButton(">");
				dialogueBox.setBackground(Color.black);
				dialogueBox.setForeground(Color.white);
				dialogueBox.setFont(normalFont);
				dialogueBox.setBorder(null);
					dialogueBox.setFocusPainted(false);
					dialogueBox.addActionListener(cHandler);
					dialogueBox.setActionCommand("dialogue");
				dialoguePanel.add(dialogueBox);
			mainTextPanel.add(dialoguePanel, BorderLayout.EAST);	
			
			nameInputPanel = new JPanel();
				nameInputPanel.setBounds(alignINPanelX, alignINPanelY, inPWidth, inPHeight);
				nameInputPanel.setBackground(Color.BLACK);
				nameInputPanel.setLayout(new GridLayout(2,1));
				
				nameInput = new JTextField();
				nameInput.setFont(normalFont);
			
				nameInputBTN = new JButton("<html><center>ENTER<center><html>");
					nameInputBTN.setForeground(Color.BLACK);
					nameInputBTN.setFont(normalFont);
					nameInputBTN.addActionListener(nHandler);
					nameInputBTN.setActionCommand("submit");
					
			nameInputPanel.add(nameInput);
			nameInputPanel.add(nameInputBTN);
			
			gameWindow.add(nameInputPanel);

			submitAnswerPanel = new JPanel();
				submitAnswerPanel.setBounds(alignINPanelX, alignINPanelY, inPWidth, inPHeight);
				submitAnswerPanel.setBackground(Color.BLACK);
				submitAnswerPanel.setLayout(new GridLayout(2,1));
				
				answerInput = new JTextField();
				answerInput.setFont(normalFont);
			
				submitInputBTN = new JButton("<html><center>SUBMIT ANSWER<center><html>");
					submitInputBTN.setForeground(Color.BLACK);
					submitInputBTN.setFont(normalFont);
					submitInputBTN.addActionListener(aHandler);
					submitInputBTN.setActionCommand("submittedAnswer");
					
			submitAnswerPanel.add(answerInput);
			submitAnswerPanel.add(submitInputBTN);
			
			gameWindow.add(submitAnswerPanel);

			//Show Instructions Page
				instructionsPanel = new JPanel();
					instructionsPanel.setBounds(((screenWidth/2)-(1600/2)), (screenHeight/5), 1600, 1080);
					instructionsPanel.setBackground(Color.BLACK);

	String instructionsText = "<html><center>BASIC GAME INSTRUCTIONS:<br/><br/> PRESS Z OR THE '>'<br/><center><html>"
							+ "<html><center>TO CONTINUE THE STORY OR THE DIALOGUE<br/><br/>HOLD SPACEBAR TO SPEED UP THE TEXT<center><html>"
							+ "<html><center><br/>THANK YOU FOR DOWNLOADING<br/>AND TRYING THIS GAME!<center><html>"
							+ "<html><center><br/>MUCH LOVE FROM THE DEVELOPERS<br/> AT KINETICA ENTERTAINMENT!</center></html>";
					instructions = new JButton(instructionsText);
						instructions.setForeground(Color.BLACK);
						instructions.setFont(normalFont);
						instructions.addActionListener(cHandler);
						instructions.setActionCommand("dialogue");
						instructions.setBorder(null);
					instructionsPanel.add(instructions, BorderLayout.CENTER);
				gameWindow.add(instructionsPanel);

			choicePanel = new JPanel();
				//choicePanel.setBounds(450,470,600,250);
				choicePanel.setBounds(alignCPanelX, alignCPanelY, choicePanelWidth, choicePanelHeight);
					choicePanel.setOpaque(false);
					//choicePanel.setBackground(Color.black);
					//choicePanel.setForeground(Color.white);
					GridLayout choicePanelLayout = new GridLayout(4,1);
					choicePanelLayout.setVgap(30);
					choicePanel.setLayout(choicePanelLayout);
			
						choice1 = new JButton("FIRST CHOICE");
							choice1.setPreferredSize(new Dimension(800, 80));
							choice1.setBackground(Color.black);
							choice1.setForeground(Color.white);
							choice1.setFont(normalFont);
								choice1.setFocusPainted(false);
								choice1.addActionListener(cHandler);
								choice1.setActionCommand("c1");
								choice1.setBorder(outlineChoice);
							choicePanel.add(choice1);

						choice2 = new JButton("SECOND CHOICE");
							choice2.setPreferredSize(new Dimension(800, 80));
							choice2.setBackground(Color.black);
							choice2.setForeground(Color.white);
							choice2.setFont(normalFont);
								choice2.setFocusPainted(false);
								choice2.addActionListener(cHandler);
								choice2.setActionCommand("c2");
								choice2.setBorder(outlineChoice);
							choicePanel.add(choice2);

						choice3 = new JButton("THIRD CHOICE");
							choice3.setPreferredSize(new Dimension(800, 80));
							choice3.setBackground(Color.black);
							choice3.setForeground(Color.white);
							choice3.setFont(normalFont);
								choice3.setFocusPainted(false);
								choice3.addActionListener(cHandler);
								choice3.setActionCommand("c3");
								choice3.setBorder(outlineChoice);
							choicePanel.add(choice3);

						choice4 = new JButton("FOURTH CHOICE");
							choice4.setPreferredSize(new Dimension(800, 80));
							choice4.setBackground(Color.black);
							choice4.setForeground(Color.white);
							choice4.setFont(normalFont);
								choice4.setFocusPainted(false);
								choice4.addActionListener(cHandler);
								choice4.setActionCommand("c4");
								choice4.setBorder(outlineChoice);
							choicePanel.add(choice4);
			
			playerStatsPanel = new JPanel();
				playerStatsPanel.setBounds(alignPSPanelX, alignPSPanelY, pspWidth, pspHeight);
					playerStatsPanel.setBackground(Color.black);
					//playerStatsPanel.setOpaque(false);
				playerStatsPanel.setLayout(new GridLayout(1,7));
					playerStatsPanel.setBorder(outlinePanel);

			ChancePointsLabel = new JLabel("<html><center>CP:<center><html>");
				ChancePointsLabel.setFont(statsFont);
				//ChancePointsLabel.setBorder(outlineStatsPanel);
				ChancePointsLabel.setForeground(Color.WHITE);
					playerStatsPanel.add(ChancePointsLabel);
			ChancePointsNumberLabel = new JLabel();
				ChancePointsNumberLabel.setFont(statsFont);
				//ChancePointsNumberLabel.setBorder(outlineStatsPanel);
				ChancePointsNumberLabel.setForeground(Color.WHITE);
					playerStatsPanel.add(ChancePointsNumberLabel);
			XPLabel = new JLabel("<html><center>XP:<center><html>");
				XPLabel.setFont(statsFont);
				XPLabel.setForeground(Color.white);
				//XPLabel.setBorder(outlineStatsPanel);
					playerStatsPanel.add(XPLabel);
			XPNumberLabel = new JLabel();
				XPNumberLabel.setForeground(Color.WHITE);
				XPNumberLabel.setFont(statsFont);
				//XPNumberLabel.setBorder(outlineStatsPanel);
					playerStatsPanel.add(XPNumberLabel);

			saveButton = new JButton("<html><center>SAVE<center><html>");
				saveButton.setFont(statsFont);
				saveButton.setBackground(Color.black);
				saveButton.setForeground(Color.white);
				saveButton.setBorder(null);
				saveButton.addActionListener(SLHandler);
				saveButton.setActionCommand("save");
					playerStatsPanel.add(saveButton);
			loadButton = new JButton("<html><center>LOAD<center><html>");
				loadButton.setFont(statsFont);
				loadButton.setBackground(Color.black);
				loadButton.setForeground(Color.white);
				loadButton.setBorder(null);
				loadButton.addActionListener(SLHandler);
				loadButton.setActionCommand("load");
					playerStatsPanel.add(loadButton);

			notesBTN = new JButton("<html><center>NOTES<center><html>");
				notesBTN.setFont(statsFont);
				notesBTN.setBackground(Color.BLACK);
				notesBTN.setForeground(Color.WHITE);
				notesBTN.setBorder(null);
				notesBTN.setFocusPainted(false);
				notesBTN.addActionListener(cHandler);
				notesBTN.setActionCommand("openNotes");
					playerStatsPanel.add(notesBTN);

			notesNamePanel = new JPanel();
				notesNamePanel.setBounds(alignNNPanelX, alignNNPanelY, notesNameWidth, notesNameHeight);
				notesNamePanel.setBackground(Color.BLACK);
			notesNameLabel = new JLabel("<html><center>YOUR NOTES<center><html>");
				notesNameLabel.setFont(subtitleFont);
				notesNameLabel.setForeground(Color.WHITE);
			notesNamePanel.add(notesNameLabel);
			gameWindow.add(notesNamePanel);

			notesPanel = new JPanel();
				notesPanel.setBounds(alignNTPX, alignNTPY, ntpWidth,ntpHeight);
				notesPanel.setBackground(Color.BLACK);	
				notesPanel.setBorder(outlinePanel);
			notesTextArea = new JTextArea(15,51);
				notesTextArea.setBounds(alignNTAX,alignNTAY,ntaWidth,ntaHeight);
				notesTextArea.setBackground(Color.black);
				notesTextArea.setForeground(Color.white);
				notesTextArea.setFont(normalFont);
					notesTextArea.setLineWrap(true);
					notesTextArea.setWrapStyleWord(true);
					notesTextArea.setEditable(true);
					notesTextArea.setBorder(BorderFactory.createEmptyBorder());
			notesPane = new JScrollPane(notesTextArea);
				notesPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				notesPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
				notesPane.setBorder(BorderFactory.createEmptyBorder());
			
			notesPanel.add(notesPane, BorderLayout.CENTER);
			gameWindow.getContentPane().add(notesPanel);

			closeMenuPanel = new JPanel();
				closeMenuPanel.setBounds(alignCMPanelX,alignCMPanelY, closeMenuWidth, closeMenuHeight);
				closeMenuPanel.setBackground(Color.BLACK);
				closeMenuPanel.setBorder(outlineButton);

			closeNotesBTN = new JButton("<html><center>CLOSE<center><html>");
				closeNotesBTN.setFont(statsFont);
				closeNotesBTN.setBackground(Color.BLACK);
				closeNotesBTN.setForeground(Color.WHITE);
				closeNotesBTN.setFocusPainted(false);
				closeNotesBTN.setBorder(null);
				closeNotesBTN.addActionListener(cHandler);
				closeNotesBTN.setActionCommand("closeNotes");
					closeMenuPanel.add(closeNotesBTN);
						gameWindow.add(closeMenuPanel);

			saveNotesPanel = new JPanel();
				saveNotesPanel.setBounds(alignSMPanelX, alignSMPanelY, saveNotesWidth, saveMenuHeight);
				saveNotesPanel.setBackground(Color.BLACK);
				saveNotesPanel.setBorder(outlineButton);

			saveNotesBTN = new JButton("<html><center>SAVE<center><html>");
				saveNotesBTN.setFont(statsFont);
				saveNotesBTN.setBackground(Color.BLACK);
				saveNotesBTN.setForeground(Color.WHITE);
				saveNotesBTN.setFocusPainted(false);
				saveNotesBTN.setBorder(null);
				saveNotesBTN.addActionListener(cHandler);
				saveNotesBTN.setActionCommand("saveNotes");
					saveNotesPanel.add(saveNotesBTN);
						gameWindow.add(saveNotesPanel);

			//Setting Menu
			settingBTNPanel = new JPanel();
				settingBTNPanel.setBounds(alignSetBTNPanelX, alignSetBTNPanelY, settingBTNWidth, settingBTNHeight);
				//settingBTNPanel.setBackground(null);
				settingBTNPanel.setOpaque(false);

					ImageIcon settingsIcon = new ImageIcon(getClass().getClassLoader().getResource("setting.png"));
					settingsButton = new JButton(settingsIcon);
						settingsButton.setBackground(null);
						settingsButton.setOpaque(false);
						settingsButton.setFocusPainted(false);
						settingsButton.setBorderPainted(false);
							settingsButton.addActionListener(cHandler);
							settingsButton.setActionCommand("openSettings");
						settingBTNPanel.add(settingsButton);
					gameWindow.add(settingBTNPanel);
			
			settingsMenu = new JPopupMenu("Settings");
				exitOptionItem = new JMenuItem("<html><center>EXIT GAME<center><html>");
					exitOptionItem.addActionListener(cHandler);
					exitOptionItem.setActionCommand("exit");
						settingsMenu.add(exitOptionItem);

			gameWindow.add(playerStatsPanel);
			gameWindow.add(choicePanel);
			gameWindow.add(bgPanel);
				gameWindow.pack();
				gameWindow.setAlwaysOnTop(true);
				gameWindow.setVisible(true);	
				//settingsMenu.show(gameWindow, alignSetMenuX, alignSetMenuY);
				//setFullScreen();
		}
		public void setFullScreen(){
			gameWindow.setVisible(false);
			gameWindow.dispose();
			device.setFullScreenWindow(gameWindow);
			gameWindow.setUndecorated(true);
			gameWindow.setVisible(true);
		}
}
