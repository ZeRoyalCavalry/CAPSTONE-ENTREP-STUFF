package mainPackage;
import java.io.Serializable;

public class DataStorage implements Serializable{
    String playerName, selectedGender, playerDialogue, nextStoryDialogue, playerQuestion,
            crushGender, crushGender1, crushGender2, crushGender3, crushName, crushSprite;
    int playerCP, playerXP, dialogueTracker, questionTracker, playermaxCP, playerLevel, playerNeededXP;
}
