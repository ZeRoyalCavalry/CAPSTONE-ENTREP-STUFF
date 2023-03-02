package mainPackage;

public class TransitionClass implements java.io.Serializable {	
	
	UserInterface ui; 
	gameStory Story;
	
	public TransitionClass(UserInterface UI){
		ui = UI;
	}
		public void introSequence(){
			ui.introPanel.setVisible(true);
			
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
		public void showTitleScreen(){
			
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			ui.mainTextPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
			ui.playerStatsPanel.setVisible(false);
			
			//ui.titlePanel.setVisible(true);
			ui.startButtonPanel.setVisible(true);
			ui.continueButtonPanel.setVisible(true);
			ui.bgPanel.setVisible(true);
		}	
		public void showName() {
			ui.mainTextPanel.setVisible(true);
			ui.nameInputPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(false);
			
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			//ui.titlePanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.choicePanel.setVisible(false);
		}
		public void genderSelect(){
			ui.maleSelectPanel.setVisible(true);
			ui.femaleSelectPanel.setVisible(true);
			ui.nonSelectPanel.setVisible(true);

			ui.introPanel.setVisible(false);
			ui.mainTextPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
			ui.playerStatsPanel.setVisible(false);
			ui.continueButtonPanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.bgPanel.setVisible(false);
		}
		public void showDialogue(){
			
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);

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
		}
		public void showDialogueNoBG(){
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);

			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			gameStory.bgHolder.setVisible(false);
			ui.bgPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			//ui.titlePanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.continueButtonPanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
		}

		public void showChoices() {
			ui.mainTextPanel.setVisible(true);
			ui.choicePanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			
			ui.maleSelectPanel.setVisible(false);
			ui.femaleSelectPanel.setVisible(false);
			ui.nonSelectPanel.setVisible(false);
			ui.introPanel.setVisible(false);
			//ui.titlePanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
		}
}

