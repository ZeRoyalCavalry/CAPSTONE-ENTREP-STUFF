package mainPackage;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class soundManager {

	soundEffect se = new soundEffect();
	bgSceneMusic bgsMusic = new bgSceneMusic();
	
	String buttonsfx = ".//resource//button-124476.wav";
	String titleScreenMusic = ".//resource//titleScreenMusic.wav";
	String typesfx = ".//resource//typesound.wav";
	
	public class soundEffect{
		
		Clip btnSFX;
		public void setFile(String sfx1Name) {
			try {
				File btnfile = new File(sfx1Name);
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
		public void setFile1(String sfx2Name) {
			try {
				File typefile = new File(sfx2Name);
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
