package mainPackage;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class soundManager {

	soundEffect se = new soundEffect();
	bgSceneMusic bgsMusic = new bgSceneMusic();
	
	String buttonsfx = ".//resource//button_Universfield.wav";
	String titleScreenMusic = ".//resource//titleScreenMusic_ZRC.wav";
	String typesfx = ".//resource//typesound_SennaFoxy.wav";
	String birdsfx = ".//resource//birdschirpping_nektaria909.wav";
	String curtainsfx = ".//resource//curtainopen_jeneveev.wav";
	
	public class soundEffect{
		
		Clip btnSFX;
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
		
		Clip typeSFX;
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
		
		Clip birdSFX;
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
		
		Clip curtainSFX;
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
	}
	
	public class bgSceneMusic{
		Clip backgroundMusic;
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
	}
}
