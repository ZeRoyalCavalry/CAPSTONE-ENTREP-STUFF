package mainPackage;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
//import java.awt.event.KeyListener;

import mainPackage.Game.ChoiceHandler;
import mainPackage.Game.KeyboardHandler;
import mainPackage.Game.MouseHandler;
import mainPackage.Game.NameHandler;
import mainPackage.Game.SaveLoadHandler;

import javax.swing.border.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class UserInterface implements java.io.Serializable{

		public JFrame gameWindow;
		public JPanel titlePanel, startButtonPanel, continueButtonPanel, mainTextPanel, dialoguePanel, choicePanel, bgPanel, nameInputPanel, playerStatsPanel;
		public JLabel titleLabel, subtitleLabel, bgPic, XPLabel, XPNumberLabel, ChancePointsLabel, ChancePointsNumberLabel;
		public JButton startButton, continueButton, dialogueBox, nameInputBTN, choice1, choice2, choice3, choice4, saveButton, loadButton;
		public JTextArea mainTextArea;
		public JTextField nameInput;
		
			Border outlinePanel = new LineBorder(Color.WHITE, 12), 
					outlineButton = new LineBorder(Color.WHITE, 5),
					outlineDialogue = new LineBorder(Color.WHITE, 10), 
					outlineStatsPanel = new LineBorder(Color.white, 1);
		
		Font titleFont = new Font("Times New Roman", Font.PLAIN, 90), subtitleFont = new Font("Times New Roman", Font.PLAIN, 68),
			 statsFont = new Font("Arial", Font.BOLD, 33), normalFont = new Font ("Arial", Font.PLAIN, 40);

		public void makeUI(ChoiceHandler cHandler, MouseHandler mHandler, NameHandler nHandler, KeyboardHandler kbHandler, 
							SaveLoadHandler SLHandler, int screenWidth, int screenHeight, storyLines lines, Game game) {
			//Title Panel & Main Text Panel Scaling	
			int titlePanelWidth = 1300;
			int titlePanelHeight = 250;
			int aligntitleX = (screenWidth/2) - (titlePanelWidth/2);
			int aligntitleY = (screenHeight/6);
			
			//Start Button Panel Scaling
			int SBPanelWidth = 375;
			int SBPanelHeight = 115;
			int alignSBX = (screenWidth/2) - (SBPanelWidth/2);
			int alignSBY = (int)Math.round(screenHeight/1.75);
			
			//Continue Button Panel Scaling
			int CBPanelWidth = 375;
			int CBPanelHeight = 115;
			int alignCBX = (screenWidth/2) - (CBPanelWidth/2);
			int alignCBY = (int)Math.round(screenHeight/1.38);

			//Main Text Panel Scaling
			//mainTextPanel.setBounds(120,160,1300,250); 
			int mtpWidth = 1300;
			int mtpHeight = 230;
			int alignMTPX = (screenWidth/2) - (mtpWidth/2);
			int alignMTPY = (int)Math.round(screenHeight - (mtpHeight/0.63));
			
			//Main Text Area Scaling
			int mtaWidth = 1200;
			int mtaHeight = 215;
			int alignMTAX = (screenWidth/2) - (mtaWidth/2);
			int alignMTAY = (int)Math.round(mtaHeight/5);
			
			//Dialogue Panel Scaling
			int diaConPanelWidth = 110;
			int diaConPanelHeight = 90;
			int alignDCPanelX = (screenWidth/2) - (diaConPanelWidth/2);
			int alignDCPanelY = (int)Math.round(diaConPanelHeight/2);
			
			//Choice Panel Scaling
			int choicePanelWidth = 600;
			int choicePanelHeight = 250;
			int alignCPanelX = (screenWidth/2) - (choicePanelWidth/2);
			int alignCPanelY = (int)Math.round(screenHeight/5.5);
			
			//Name Input Panel Scaling
			int inPWidth = 900; 
			int inPHeight = 130;
			int alignINPanelX = (screenWidth/2) - (inPWidth/2); 
			int alignINPanelY = (int)Math.round(mtaHeight/1.5);

			//Player Stats Panel Scaling
			int pspWidth = 1300; 
			int pspHeight = 70; 
			int alignPSPanelX = (screenWidth/2) - (pspWidth/2);
			int alignPSPanelY = (int)Math.round(screenHeight - (pspHeight/0.48));
			
			//MAKE GAME WINDOW
			gameWindow = new JFrame();
				gameWindow.setTitle("Starlight High School 1.1");
				gameWindow.setSize(screenWidth,screenHeight);
				gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gameWindow.getContentPane().setBackground(Color.BLACK);
				//gameWindow.setLayout(null);
				gameWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
				
			//TITLE SCREEN
			titlePanel = new JPanel();
				//titlePanel.setBounds(120,160,1300,250);
				titlePanel.setBounds(aligntitleX, aligntitleY, titlePanelWidth, titlePanelHeight);
				titlePanel.setBorder(outlinePanel);
				titlePanel.setBackground(Color.black);
				
			titleLabel = new JLabel("<html><center>STARLIGHT HIGH SCHOOL <br/>AND ITS CURIOUS CASES<center><html>");
				titleLabel.setForeground(Color.white);
				titleLabel.setFont(titleFont);
				//titleLabel.setBorder(outlinePanel);
				titlePanel.add(titleLabel);
				
			//START BUTTON
			startButtonPanel = new JPanel();
				//startButtonPanel.setBounds(605,500,290,117);
				startButtonPanel.setBounds(alignSBX, alignSBY, SBPanelWidth, SBPanelHeight);
				startButtonPanel.setBackground(Color.BLACK);
				startButtonPanel.setBorder(outlineButton);
				
					startButton = new JButton("<html><center>START<center><html>");
						startButton.setBackground(Color.BLACK);
						startButton.setForeground(Color.WHITE);
						startButton.setFont(subtitleFont);
						startButton.setFocusPainted(false);
						startButton.setBorder(null);
							startButton.addActionListener(cHandler);
							startButton.setActionCommand("start");
					startButtonPanel.add(startButton);
	
			//CONTINUE BUTTON
			continueButtonPanel = new JPanel();
				continueButtonPanel.setBounds(alignCBX, alignCBY, CBPanelWidth, CBPanelHeight);
				continueButtonPanel.setBackground(Color.BLACK);
				continueButtonPanel.setBorder(outlineButton);

					continueButton = new JButton("<html><center>CONTINUE<center><html>");
						continueButton.setBackground(Color.BLACK);
						continueButton.setForeground(Color.WHITE);
						continueButton.setFont(subtitleFont);
						continueButton.setFocusPainted(false);
						continueButton.setBorder(null);
								continueButton.addActionListener(cHandler);
								continueButton.setActionCommand("continue");
					continueButtonPanel.add(continueButton);

			//BGImage	
			bgPanel = new JPanel();
				bgPanel.setBounds(0,0,screenWidth,screenHeight);
				bgPanel.setBackground(Color.black);
					bgPic = new JLabel();
					bgPic.setBounds(0,0, game.screenWidth, game.screenHeight);
						ImageIcon titlePic = new ImageIcon(getClass().getClassLoader().getResource("temp1.png"));
					bgPic.setIcon(titlePic);
				bgPanel.add(bgPic);
					
			gameWindow.add(titlePanel);
			gameWindow.add(startButtonPanel);
			gameWindow.add(continueButtonPanel);
			
			//ACTUAL GAME
			mainTextPanel = new JPanel();
				//mainTextPanel.setBounds(120,160,1300,250);
				mainTextPanel.setBounds(alignMTPX, alignMTPY, mtpWidth, mtpHeight);
				mainTextPanel.setBackground(Color.BLACK);
				mainTextPanel.setBorder(outlinePanel);	
				mainTextPanel.addMouseListener(mHandler);
				mainTextPanel.addKeyListener(kbHandler);
			gameWindow.add(mainTextPanel);	
			
			//Text Making
			mainTextArea = new JTextArea("");
				//mainTextArea.setBounds(150,185,1200,230);
				mainTextArea.setBounds(alignMTAX,alignMTAY,mtaWidth,mtaHeight);
				mainTextArea.setBackground(Color.black);
				mainTextArea.setForeground(Color.white);
				mainTextArea.setFont(normalFont);
					mainTextArea.setLineWrap(true);
					mainTextArea.setWrapStyleWord(true);
					mainTextArea.setEditable(false);
					mainTextArea.addMouseListener(mHandler);
					mainTextArea.addKeyListener(kbHandler);
				mainTextPanel.add(mainTextArea);
				
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
				dialoguePanel.add(dialogueBox, BorderLayout.SOUTH);
			mainTextPanel.add(dialoguePanel);	
			
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
			
			choicePanel = new JPanel();
				//choicePanel.setBounds(450,470,600,250);
				choicePanel.setBounds(alignCPanelX, alignCPanelY, choicePanelWidth, choicePanelHeight);
					choicePanel.setBackground(Color.black);
					choicePanel.setForeground(Color.white);
					choicePanel.setLayout(new GridLayout(4,1));
			
						choice1 = new JButton("FIRST CHOICE");
							choice1.setBackground(Color.black);
							choice1.setForeground(Color.white);
							choice1.setFont(normalFont);
								choice1.setFocusPainted(false);
								choice1.addActionListener(cHandler);
								choice1.setActionCommand("c1");
							choicePanel.add(choice1);
						choice2 = new JButton("SECOND CHOICE");
							choice2.setBackground(Color.black);
							choice2.setForeground(Color.white);
							choice2.setFont(normalFont);
								choice2.setFocusPainted(false);
								choice2.addActionListener(cHandler);
								choice2.setActionCommand("c2");
							choicePanel.add(choice2);
						choice3 = new JButton("THIRD CHOICE");
							choice3.setBackground(Color.black);
							choice3.setForeground(Color.white);
							choice3.setFont(normalFont);
								choice3.setFocusPainted(false);
								choice3.addActionListener(cHandler);
								choice3.setActionCommand("c3");
							choicePanel.add(choice3);
						choice4 = new JButton("FOURTH CHOICE");
							choice4.setBackground(Color.black);
							choice4.setForeground(Color.white);
							choice4.setFont(normalFont);
								choice4.setFocusPainted(false);
								choice4.addActionListener(cHandler);
								choice4.setActionCommand("c4");
							choicePanel.add(choice4);
			
			playerStatsPanel = new JPanel();
				playerStatsPanel.setBounds(alignPSPanelX, alignPSPanelY, pspWidth, pspHeight);
					playerStatsPanel.setBackground(Color.black);
					//playerStatsPanel.setOpaque(false);
				playerStatsPanel.setLayout(new GridLayout(1,6));
					playerStatsPanel.setBorder(outlinePanel);


			ChancePointsLabel = new JLabel("<html><center>CP:<center><html>");
				ChancePointsLabel.setFont(statsFont);
				ChancePointsLabel.setBorder(outlineStatsPanel);
				ChancePointsLabel.setForeground(Color.WHITE);
					playerStatsPanel.add(ChancePointsLabel);
			ChancePointsNumberLabel = new JLabel();
				ChancePointsNumberLabel.setFont(statsFont);
				ChancePointsNumberLabel.setBorder(outlineStatsPanel);
				ChancePointsNumberLabel.setForeground(Color.WHITE);
					playerStatsPanel.add(ChancePointsNumberLabel);
			XPLabel = new JLabel("<html><center>XP:<center><html>");
				XPLabel.setFont(statsFont);
				XPLabel.setForeground(Color.white);
				XPLabel.setBorder(outlineStatsPanel);
					playerStatsPanel.add(XPLabel);
			XPNumberLabel = new JLabel();
				XPNumberLabel.setForeground(Color.WHITE);
				XPNumberLabel.setFont(statsFont);
				XPNumberLabel.setBorder(outlineStatsPanel);
					playerStatsPanel.add(XPNumberLabel);

			saveButton = new JButton("<html><center>SAVE<center><html>");
				saveButton.setFont(statsFont);
				saveButton.setBackground(Color.black);
				saveButton.setForeground(Color.white);
				saveButton.setBorder(outlineStatsPanel);
				saveButton.addActionListener(SLHandler);
				saveButton.setActionCommand("save");
					playerStatsPanel.add(saveButton);
			loadButton = new JButton("<html><center>LOAD<center><html>");
				loadButton.setFont(statsFont);
				loadButton.setBackground(Color.black);
				loadButton.setForeground(Color.white);
				continueButton.setBorder(outlineStatsPanel);
				loadButton.addActionListener(SLHandler);
				loadButton.setActionCommand("load");
					playerStatsPanel.add(loadButton);
				

			gameWindow.add(playerStatsPanel);
			gameWindow.add(choicePanel);		
			gameWindow.add(bgPanel);
				gameWindow.setVisible(true);	
			//setFullScreen();
		}
}
