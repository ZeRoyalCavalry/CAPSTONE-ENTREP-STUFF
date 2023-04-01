package mainPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
//import javax.swing.event.MenuKeyListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class colorText{

    Timer ImportantTimer;
    String importantText;
    char ImportantTextGen[];
    int letterTracker = 0, arrayNumber;

    UserInterface ui = new UserInterface();
	soundManager sm = new soundManager();

    public colorText(String importantText){
        this.importantText = importantText;
        keywordGeneration();
        ImportantTimer.start();
    }

    public void keywordGeneration(){
        StyledDocument doc = ui.mainTextArea.getStyledDocument();
        SimpleAttributeSet importantNotes = new SimpleAttributeSet();
        StyleConstants.setForeground(importantNotes, Color.YELLOW);

        //DIALOGUE GENERATION
        ImportantTimer = new Timer(30, new ActionListener(){
            public void actionPerformed(ActionEvent ie) {
                    Game.enableKeys = 0;
                    ui.dialoguePanel.setVisible(false);
                    ImportantTextGen = importantText.toCharArray();
                    arrayNumber = ImportantTextGen.length;
            
                    if((letterTracker%3) == 0){
                        sm.se.setFile1(sm.typesfx);
                        sm.se.playTypeSFX();
                    }
                
                String letterGen = ""; String space = "";
                letterGen = space + ImportantTextGen[letterTracker]; 
                try {
                    doc.insertString(doc.getLength(), letterGen, importantNotes);
                } catch (BadLocationException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            
                letterTracker++;
                if(letterTracker == arrayNumber) {
                    letterTracker = 0;
                    ImportantTimer.stop();
                }
            }
        });
    }
}
