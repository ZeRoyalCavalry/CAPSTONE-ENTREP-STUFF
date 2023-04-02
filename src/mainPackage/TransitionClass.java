package mainPackage;

public class TransitionClass implements java.io.Serializable {	
	
	UserInterface ui; 
	Game g;
	gameStory Story;
	public int choicePanelRecognizer = 0;

	public TransitionClass(Game game, UserInterface UI){
		g = game; ui = UI;
	}
		public void introSequence(){
			ui.introPanel.setVisible(true);

			ui.notesNamePanel.setVisible(false);
			ui.notesPanel.setVisible(false);
			ui.saveNotesPanel.setVisible(false);
			ui.closeMenuPanel.setVisible(false);
			ui.instructionsPanel.setVisible(false);
			ui.submitAnswerPanel.setVisible(false);
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.mainTextPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
			ui.playerStatsPanel.setVisible(false);
			ui.continueButtonPanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.bgPanel.setVisible(false);
			ui.gameoverScreen.setVisible(false);
			ui.MQGOPanel.setVisible(false);
			ui.restartBTNPanel.setVisible(false);
			ui.quitBTNPanel.setVisible(false);
		}
		public void showTitleScreen(){
			ui.notesNamePanel.setVisible(false);
			ui.notesPanel.setVisible(false);
			ui.saveNotesPanel.setVisible(false);
			ui.closeMenuPanel.setVisible(false);
			ui.instructionsPanel.setVisible(false);
			ui.submitAnswerPanel.setVisible(false);
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			ui.mainTextPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
			ui.playerStatsPanel.setVisible(false);
			ui.gameoverScreen.setVisible(false);
			ui.MQGOPanel.setVisible(false);
			ui.restartBTNPanel.setVisible(false);
			ui.quitBTNPanel.setVisible(false);
			
			//ui.titlePanel.setVisible(true);
			ui.startButtonPanel.setVisible(true);
			ui.continueButtonPanel.setVisible(true);
			ui.bgPanel.setVisible(true);	
			ui.bgPanel.remove(CutsceneMaker.image);
			ui.bgPanel.add(ui.bgPic);	
		}	
		public void showName() {
			ui.mainTextPanel.setVisible(true);
			ui.nameInputPanel.setVisible(true);

			ui.notesNamePanel.setVisible(false);
			ui.notesPanel.setVisible(false);
			ui.saveNotesPanel.setVisible(false);
			ui.closeMenuPanel.setVisible(false);
			ui.instructionsPanel.setVisible(false);
			ui.playerStatsPanel.setVisible(false);
			ui.submitAnswerPanel.setVisible(false);
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			//ui.titlePanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.gameoverScreen.setVisible(false);
			ui.MQGOPanel.setVisible(false);
			ui.restartBTNPanel.setVisible(false);
			ui.quitBTNPanel.setVisible(false);
		}
		public void inputAnswer() {
			ui.mainTextPanel.setVisible(true);
			ui.submitAnswerPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			
			ui.notesNamePanel.setVisible(false);
			ui.notesPanel.setVisible(false);
			ui.saveNotesPanel.setVisible(false);
			ui.closeMenuPanel.setVisible(false);
			ui.instructionsPanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			//ui.titlePanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.gameoverScreen.setVisible(false);
			ui.MQGOPanel.setVisible(false);
			ui.restartBTNPanel.setVisible(false);
			ui.quitBTNPanel.setVisible(false);
		}
		public void genderSelect(){
			ui.maleSelectPanel.setVisible(true);
			ui.femaleSelectPanel.setVisible(true);
			ui.nonSelectPanel.setVisible(true);

			ui.notesNamePanel.setVisible(false);
			ui.notesPanel.setVisible(false);
			ui.saveNotesPanel.setVisible(false);
			ui.closeMenuPanel.setVisible(false);
			ui.instructionsPanel.setVisible(false);
			ui.submitAnswerPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			ui.mainTextPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
			ui.playerStatsPanel.setVisible(false);
			ui.continueButtonPanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.bgPanel.setVisible(false);
			ui.gameoverScreen.setVisible(false);
			ui.MQGOPanel.setVisible(false);
			ui.restartBTNPanel.setVisible(false);
			ui.quitBTNPanel.setVisible(false);
		}
		public void showDialogue(){	
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);

			ui.notesNamePanel.setVisible(false);
			ui.notesPanel.setVisible(false);
			ui.saveNotesPanel.setVisible(false);
			ui.closeMenuPanel.setVisible(false);
			ui.instructionsPanel.setVisible(false);
			ui.submitAnswerPanel.setVisible(false);
			ui.bgPanel.setVisible(false);
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			//ui.titlePanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.continueButtonPanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
			ui.gameoverScreen.setVisible(false);
			ui.MQGOPanel.setVisible(false);
			ui.restartBTNPanel.setVisible(false);
			ui.quitBTNPanel.setVisible(false);
		}

		public void showChoices() {
			ui.mainTextPanel.setVisible(true);
			ui.choicePanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);			

			ui.notesNamePanel.setVisible(false);
			ui.notesPanel.setVisible(false);
			ui.saveNotesPanel.setVisible(false);
			ui.closeMenuPanel.setVisible(false);
			ui.instructionsPanel.setVisible(false);
			ui.submitAnswerPanel.setVisible(false);
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			//ui.titlePanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
			ui.gameoverScreen.setVisible(false);
			ui.MQGOPanel.setVisible(false);
			ui.restartBTNPanel.setVisible(false);
			ui.quitBTNPanel.setVisible(false);

			choicePanelRecognizer++;
		}
		public void showInstructions(){
			ui.instructionsPanel.setVisible(true);			

			ui.notesNamePanel.setVisible(false);
			ui.notesPanel.setVisible(false);
			ui.saveNotesPanel.setVisible(false);
			ui.closeMenuPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			ui.submitAnswerPanel.setVisible(false);
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.mainTextPanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
			ui.playerStatsPanel.setVisible(false);
			ui.continueButtonPanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.bgPanel.setVisible(false);
			ui.gameoverScreen.setVisible(false);
			ui.MQGOPanel.setVisible(false);
			ui.restartBTNPanel.setVisible(false);
			ui.quitBTNPanel.setVisible(false);
		}

		public void showNotes(){
			ui.notesPanel.setVisible(true);
			ui.closeMenuPanel.setVisible(true);
			ui.saveNotesPanel.setVisible(true);
			ui.notesNamePanel.setVisible(true);

			ui.instructionsPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			ui.submitAnswerPanel.setVisible(false);
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.mainTextPanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
			ui.playerStatsPanel.setVisible(false);
			ui.continueButtonPanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.bgPanel.setVisible(false);
			ui.gameoverScreen.setVisible(false);
			ui.MQGOPanel.setVisible(false);
			ui.restartBTNPanel.setVisible(false);
			ui.quitBTNPanel.setVisible(false);
		}
		public void closeNotes(){
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			ui.bgPanel.setVisible(true);
			if(choicePanelRecognizer >= 1){
				ui.choicePanel.setVisible(true);
			}
			ui.notesNamePanel.setVisible(false);
			ui.instructionsPanel.setVisible(false);
			ui.notesPanel.setVisible(false);
			ui.saveNotesPanel.setVisible(false);
			ui.closeMenuPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			ui.submitAnswerPanel.setVisible(false);
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.continueButtonPanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.gameoverScreen.setVisible(false);
			ui.MQGOPanel.setVisible(false);
			ui.restartBTNPanel.setVisible(false);
			ui.quitBTNPanel.setVisible(false);
		}
		public void GameOver(){
			g.sm.bgsMusic.stopInGameMusic();
			g.DiaTimer.stop();
			g.choiceTimer.stop();
			g.calculateTimer.stop();

			ui.gameoverScreen.setVisible(true);
			ui.MQGOPanel.setVisible(true);
			ui.restartBTNPanel.setVisible(true);
			ui.quitBTNPanel.setVisible(true);

			ui.introPanel.setVisible(false);

			ui.notesNamePanel.setVisible(false);
			ui.notesPanel.setVisible(false);
			ui.saveNotesPanel.setVisible(false);
			ui.closeMenuPanel.setVisible(false);
			ui.instructionsPanel.setVisible(false);
			ui.submitAnswerPanel.setVisible(false);
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.mainTextPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
			ui.playerStatsPanel.setVisible(false);
			ui.continueButtonPanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.bgPanel.setVisible(false);
		}
}

