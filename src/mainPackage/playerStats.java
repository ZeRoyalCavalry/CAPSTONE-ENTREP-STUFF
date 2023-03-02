package mainPackage;

public class playerStats implements java.io.Serializable{
    
    //Showable  Stats

	public static int CP, XP, maxCP, level;

    //Not showable, probably a different screen?
    static int namingMastery, stoichMastery;

    public playerStats(){
        if(playerStats.XP >= 15 && playerStats.XP < 25){
            playerStats.level++;
            playerStats.maxCP = 12;
            playerStats.CP = 15;
            playerStats.XP = 0;
        }
    }
}
