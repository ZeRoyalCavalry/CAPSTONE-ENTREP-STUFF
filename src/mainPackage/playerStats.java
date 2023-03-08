package mainPackage;

public class playerStats implements java.io.Serializable{
    
    UserInterface ui;
    Game g;

    //Showable  Stats
	public static int CP, XP, maxCP, level;
    public static double neededXP = 15, multiplier = 2.3;

    //Not showable, probably a different screen?
    static int namingMastery, stoichMastery;

    public playerStats(UserInterface UI, Game game){
        ui = UI; g = game;
    }

    public void checkLevel(){
        if(XP >= neededXP){
            level++;
            maxCP+=2;
            CP = maxCP;
            neededXP = (int)Math.round(neededXP*multiplier);
            multiplier+= 0.15;
            XP = 0;

            UserInterface.ChancePointsNumberLabel.setText("<html><center>" + CP + "/" + maxCP + "<center><html>");
            UserInterface.XPNumberLabel.setText("<html><center>" + XP + "<center><html>");
            // ui.mainTextArea.setText("");
            // g.levelUpTimer.start();
        }
        else{
            gameStory.pauseTime = 0;
        }
    }
}
