package mainPackage;

import mainPackage.Game.ChoiceHandler;
import mainPackage.Game.KeyboardHandler;
import mainPackage.Game.MouseHandler;
import mainPackage.Game.NameHandler;

public class CutsceneManager {
	
	Game game; UserInterface ui;
	TransitionClass sceneChanger; soundManager sm;
	playerStats player; storyLines lines; ImageManager images;
	ChoiceHandler cHandler; MouseHandler mHandler; 
	KeyboardHandler kbHandler; NameHandler nHandler;
	
    public String motherSprite = "momSprite.png", spriteToLoad = "placeholder.png", crushName = "???";
	public static String SOSprite = "placeholder.png";

	public CutsceneManager(Game game, UserInterface ui, TransitionClass sceneChanger, soundManager sm,
						playerStats player, storyLines lines, ImageManager images, int screenWidth, int screenHeight)
	{
		this.game = game; this.ui = ui; this.sceneChanger = sceneChanger; this.sm = sm;
		this.player = player; this.lines = lines; this.images = images;
	}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// NO DISPLAY
	public void blackScreen(){
		sceneChanger.showDialogue();
		ui.npcName.setText(null);
		CutsceneMaker blackScreen = new CutsceneMaker("blackscreen.png", "placeholder.png", "placeholder.png", "placeholder.png", 
														1.0f, 0.0f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// HOME BEDROOM CUTSCENE
public void bedroomCutsceneLoad(){
    sceneChanger.showDialogue();
    CutsceneMaker bedroomCutscene = new CutsceneMaker("bedroom.png", "placeholder.png", "placeholder.png", spriteToLoad, 
                                                        1.0f, 0.0f, 0.0f, 0.0f);
        ui.bgPanel.remove(gameStory.bgHolder);
        ui.bgPanel.add(CutsceneMaker.image);
        ui.bgPanel.setVisible(true);
        ui.mainTextPanel.setVisible(true);
        ui.playerStatsPanel.setVisible(true);
        player.checkLevel();
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// LIVING ROOM CUTSCENE
	public void livingRoomCutsceneLoad(){
        ui.npcName.setText("<html><font color=\"#FF00FF\">Mom<font><html>");
		sceneChanger.showDialogue();
		CutsceneMaker livingRoomCutscene = new CutsceneMaker("livingRoom.jpg", "placeholder.png" , "placeholder.png", 
                                                            motherSprite, 0.75f, 0.0f, 0.0f, 1.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
            player.checkLevel();
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// HOME BATHROOM CUTSCENE
    public void homeBathRoomCutsceneLoad(){
		sceneChanger.showDialogue();
		ui.npcName.setText("<html><font color=\"#FF00FF\">Mom<font><html>");
		CutsceneMaker homeBathRoomCutscene = new CutsceneMaker("homeRestroom.png", "placeholder.png", "placeholder.png", spriteToLoad, 
																1.0f, 0.0f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// CITY CUTSCENE
	public void cityCutsceneLoad(){
		sceneChanger.showDialogue();
		CutsceneMaker cityCutscene = new CutsceneMaker("temp3.jpg", "placeholder.png", "placeholder.png", spriteToLoad, 
															1.0f, 0.0f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// CITY 1 CUTSCENE
    public void city1CutsceneLoad(){
		ui.npcName.setText(null);
		sceneChanger.showDialogue();
		CutsceneMaker city1Cutscene = new CutsceneMaker("city1.jpg", "placeholder.png", "placeholder.png", 
														spriteToLoad, 1.0f, 0.0f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
            player.checkLevel();
	}
	public void city1DarkCutsceneLoad(){
		ui.npcName.setText(null);
		sceneChanger.showDialogue();
		CutsceneMaker city1DarkCutscene = new CutsceneMaker("city1.jpg", "placeholder.png", "placeholder.png", 
															spriteToLoad, 1.0f, 0.35f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
    }
    public void city1RainCutsceneLoad(){
		ui.npcName.setText(null);
		sceneChanger.showDialogue();
		CutsceneMaker city1RainCutscene = new CutsceneMaker("city1.jpg", "placeholder.png", "buncee_raineffect.gif", 
															spriteToLoad, 1.0f, 0.35f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// CITY 2 CUTSCENE
    public void city2CutsceneLoad(){
		ui.npcName.setText(null);
		sceneChanger.showDialogue();
		CutsceneMaker city2Cutscene = new CutsceneMaker("city2.png", "placeholder.png", "placeholder.png", 
														spriteToLoad, 1.0f, 0.0f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
            player.checkLevel();
	}
	public void city2DarkCutsceneLoad(){
		ui.npcName.setText(null);
		sceneChanger.showDialogue();
		CutsceneMaker city2DarkCutscene = new CutsceneMaker("city2.png", "placeholder.png", "placeholder.png", 
															spriteToLoad, 1.0f, 0.35f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
	}
    public void city2RainCutsceneLoad(){
		ui.npcName.setText(null);
		sceneChanger.showDialogue();
		CutsceneMaker city2RainCutscene = new CutsceneMaker("city2.png", "placeholder.png", "buncee_raineffect.gif", 
															spriteToLoad, 1.0f, 0.35f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// BUS STOP CUTSCENES
	public void busStopLoad(){
		ui.npcName.setText(null);
		sceneChanger.showDialogue();
		CutsceneMaker busStopCutscene = new CutsceneMaker("busstop.png", "placeholder.png", 
															"buncee_raineffect.gif", spriteToLoad,  1.0f, 0.75f, 1.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
	}
	public void crushBusStopCutsceneLoad(){
        ui.npcName.setText(crushName);
		sceneChanger.showDialogue();
		CutsceneMaker crushBusStopCutscene = new CutsceneMaker("busstop.png", "placeholder.png", 
                                                            "buncee_raineffect.gif", SOSprite, 1.0f, 1.0f, 1.0f, 1.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
            player.checkLevel();
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// CONVENIENCE STORE CUTSCENES
	public void ConvenienceStoreCutsceneLoad(){
		ui.npcName.setText(null);
		sceneChanger.showDialogue();
		CutsceneMaker ConvenienceStoreCutscene = new CutsceneMaker("constore.png", "placeholder.png", 
															"placeholder.png", "placeholder.png",  1.0f, 0.0f, 0.0f, 0.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
	}
    public void crushConvenienceStoreCutsceneLoad(){
        ui.npcName.setText(null);
		sceneChanger.showDialogue();
		CutsceneMaker CrushConvenienceStoreCutscene = new CutsceneMaker("constore.png", "placeholder.png", 
															"placeholder.png", SOSprite,  1.0f, 0.0f, 0.0f, 1.0f);
			ui.bgPanel.remove(gameStory.bgHolder);
			ui.bgPanel.add(CutsceneMaker.image);
			ui.bgPanel.setVisible(true);
			ui.mainTextPanel.setVisible(true);
			ui.playerStatsPanel.setVisible(true);
			player.checkLevel();
    }
}
