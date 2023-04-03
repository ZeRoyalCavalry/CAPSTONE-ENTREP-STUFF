package mainPackage;

public class playerStats implements java.io.Serializable{
    
    UserInterface ui;
    Game g;
    TransitionClass changeScene;

    //Showable  Stats
	public static int CP, XP, maxCP, level = 1, neededXP = 20;
    public static double multiplier = 2.3;

    //Text Generation Part
    // public static Timer LvlUpTimer;
    // public static String LvlUpText = "YOU HAVE LEVELED UP TO: LEVEL " + "\n" + level 
    //                                 + "\nYOUR MAXIMUM CP IS NOW: \n" + "\n" + CP + "/" + maxCP;
    // public static char LvlGen[];
    // public static int arrayNumber, letterTracker;

    //Not showable, probably a different screen?
    static int namingMastery, stoichMastery;

    public playerStats(UserInterface UI, Game game, TransitionClass tc){
        ui = UI; g = game; changeScene = tc;
    }

    public void checkLevel(){
        if(XP >= neededXP){
            XP-=neededXP;
            level++;
            maxCP+=2;
            CP = maxCP;
            neededXP = (int)Math.round(neededXP*multiplier);
            multiplier+= 0.15;
            //LevelUpDiaGen();
            UserInterface.ChancePointsNumberLabel.setText("<html><center>" + CP + "/" + maxCP + "<center><html>");
            UserInterface.XPNumberLabel.setText("<html><center>" + playerStats.XP + "/" + playerStats.neededXP + "<center><html>");       
        }
        if(CP<=0){
            changeScene.GameOver();
        }
    }
}
