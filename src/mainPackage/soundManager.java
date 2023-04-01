package mainPackage;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class soundManager implements java.io.Serializable {

	gameStory Story;

	public soundEffect se = new soundEffect();
	public bgSceneMusic bgsMusic = new bgSceneMusic();

	FloatControl fc;
	
	//ALL SOUUND EFFECTS AND MUSIC ARE FREE TO USE
	public String titleScreenMusic = ".//Sounds//titleScreenMusic_PAT.wav", buttonsfx = ".//Sounds//button_Universfield.wav",
			typesfx = ".//Sounds//typesound_SennaFoxy.wav", birdsfx = ".//Sounds//birdschirpping_nektaria909.wav",
			curtainsfx = ".//Sounds//curtainopen_jeneveev.wav",alarmclocksfx = ".//Sounds//alarmclock_ZyryTSounds.wav", 
			outofbedsfx = ".//Sounds//outofbed_LOTWStudios.wav", showersfx = ".//Sounds//shower_vmgraw.wav",
			doorsfx = ".//Sounds//door_Zeinel.wav", brushteethsfx = ".//Sounds//brushteeth_shelbyshark.wav",
			InGameBGMusic = ".//Sounds//gameBGmusic_PAT.wav";

	
	public class soundEffect{
		
		public Clip btnSFX, typeSFX, birdSFX, curtainSFX, alarmclockSFX, outofbedSFX, showerSFX, brushteethSFX, doorSFX;
		
		public void setFile(String sfx0Name) {
			try {
				File btnfile = new File(sfx0Name);
				AudioInputStream buttonsfx = AudioSystem.getAudioInputStream(btnfile);
				btnSFX = AudioSystem.getClip();
				btnSFX.open(buttonsfx);
			}
			catch (Exception be) {
			}
		}
		public void playButtonSFX(){
			btnSFX.setFramePosition(0);
			btnSFX.start();
		}
		
		public void setFile1(String sfx1Name) {
			try {
				File typefile = new File(sfx1Name);
				AudioInputStream typesfx = AudioSystem.getAudioInputStream(typefile);
				typeSFX = AudioSystem.getClip();
				typeSFX.open(typesfx);
			}
			catch(Exception te) {
			}
		}
		public void playTypeSFX() {
			typeSFX.setFramePosition(0);
			typeSFX.start();
		}
		
		public void setFile2(String sfx2Name) {
			try {
				File birdfile = new File(sfx2Name);
				AudioInputStream birdSfx = AudioSystem.getAudioInputStream(birdfile);
				birdSFX = AudioSystem.getClip();
				birdSFX.open(birdSfx);
			}
			catch(Exception be) {
			}
		}
		public void playBirdSFX() {
			birdSFX.setFramePosition(0);
			birdSFX.start();
		}
		
		public void setFile3(String sfx3Name) {
			try {
				File curtainfile = new File(sfx3Name);
				AudioInputStream curtainsfx = AudioSystem.getAudioInputStream(curtainfile);
				curtainSFX = AudioSystem.getClip();
				curtainSFX.open(curtainsfx);
			}
			catch(Exception curE) {
			}
		}
		public void playCurtainSFX() {
			curtainSFX.setFramePosition(0);
			curtainSFX.start();
		}

		public void setFile4(String sfx4Name){
			try{
				File alarmclockFile = new File(sfx4Name);
				AudioInputStream alarmclocksfx = AudioSystem.getAudioInputStream(alarmclockFile);
				alarmclockSFX = AudioSystem.getClip();
				alarmclockSFX.open(alarmclocksfx);
			}
			catch(Exception acError){
			}
		}
		public void playAlarmClockSFX(){
			alarmclockSFX.setFramePosition(0);
			alarmclockSFX.start();
		}

		public void setFile5(String sfx5Name){
			try{
				File oobFile = new File(sfx5Name);
				AudioInputStream outofbedsfx = AudioSystem.getAudioInputStream(oobFile);
				outofbedSFX = AudioSystem.getClip();
				outofbedSFX.open(outofbedsfx);
			}
			catch(Exception oobError){
			}
		}
		public void playOutOfBedSFX(){
			outofbedSFX.setFramePosition(0);
			outofbedSFX.start();
		}

		public void setFile6(String sfx6Name){
			try{
				File showerFile = new File(sfx6Name);
				AudioInputStream showersfx = AudioSystem.getAudioInputStream(showerFile);
				showerSFX = AudioSystem.getClip();
				showerSFX.open(showersfx);
			}
			catch(Exception oobError){
			}
		}
		public void playShowerSFX(){
			showerSFX.setFramePosition(0);
			showerSFX.start();
		}

		public void setFile7(String sfx7Name){
			try{
				File doorFile = new File(sfx7Name);
				AudioInputStream doorsfx = AudioSystem.getAudioInputStream(doorFile);
				doorSFX = AudioSystem.getClip();
				doorSFX.open(doorsfx);
			}
			catch(Exception oobError){
			}
		}
		public void playDoorSFX(){
			showerSFX.setFramePosition(0);
			showerSFX.start();
		}

		public void setFile8(String sfx8Name){
			try{
				File brushteethFile = new File(sfx8Name);
				AudioInputStream brushteethsfx = AudioSystem.getAudioInputStream(brushteethFile);
				brushteethSFX = AudioSystem.getClip();
				brushteethSFX.open(brushteethsfx);
			}
			catch(Exception oobError){
			}
		}
		public void playBrushTeethSFX(){
			showerSFX.setFramePosition(0);
			showerSFX.start();
		}
	}
	
	public class bgSceneMusic{
		public Clip backgroundMusic;
		public void setFile(String bgName) {
			try {
				File file = new File(bgName);
				AudioInputStream bgMusicName = AudioSystem.getAudioInputStream(file);
				backgroundMusic = AudioSystem.getClip();
				backgroundMusic.open(bgMusicName);
			}
			catch (Exception e) {
			}
		}
		public void playMusic() {
			backgroundMusic.setFramePosition(0);
			backgroundMusic.start();
		}
		public void loopMusic() {
			backgroundMusic.loop(Clip.LOOP_CONTINUOUSLY);
		}
		public void stopMusic() {
			backgroundMusic.stop();
			backgroundMusic.close();
		}

		public Clip ingameBGMusic;
		public void ingameBGMusicSet(String ingameBG){
			try{
				File file = new File(ingameBG);
				AudioInputStream ingamebgMusicName = AudioSystem.getAudioInputStream(file);
				ingameBGMusic = AudioSystem.getClip();
				ingameBGMusic.open(ingamebgMusicName);
				fc = (FloatControl)ingameBGMusic.getControl(FloatControl.Type.MASTER_GAIN);
				fc.setValue((float) 0.10);
			}
			catch(Exception e){
				System.out.println("ERROR LOADING MUSIC");
			}
		}
		public void playInGameMusic() {
			ingameBGMusic.setFramePosition(0);
			ingameBGMusic.start();
		}
		public void loopInGameMusic() {
			ingameBGMusic.loop(Clip.LOOP_CONTINUOUSLY);
		}
		public void stopInGameMusic() {
			ingameBGMusic.stop();
			ingameBGMusic.close();
		}
	}
}
