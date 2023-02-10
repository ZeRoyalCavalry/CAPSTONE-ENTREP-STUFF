package mainPackage;

public class TransitionClass {	
	
	UserInterface ui;
	
	public TransitionClass(UserInterface UI){
		ui = UI;
	}
	
	public void showTitleScreen(){
		
			ui.titlePanel.setVisible(true);
			ui.startButtonPanel.setVisible(true);
			ui.bgPanel[0].setVisible(true);
		
			ui.mainTextPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
		}
	
		public void showDialogue(){
		
			ui.mainTextPanel.setVisible(true);
			
			ui.titlePanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.bgPanel[0].setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
		}
	
		public void showChoices() {
			ui.mainTextPanel.setVisible(true);
			ui.choicePanel.setVisible(true);
			
			ui.titlePanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.nameInputPanel.setVisible(false);
		}
		
		public void showName() {
			ui.mainTextPanel.setVisible(true);
			ui.nameInputPanel.setVisible(true);
			
			ui.titlePanel.setVisible(false);
			ui.startButtonPanel.setVisible(false);
			ui.dialoguePanel.setVisible(false);
			ui.choicePanel.setVisible(false);
			
		}
}

