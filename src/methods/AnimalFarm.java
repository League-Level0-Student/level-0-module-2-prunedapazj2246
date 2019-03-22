package methods;

import java.applet.AudioClip;
import java.util.Random;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		for (int i = 0; i < 5;) {
			
		
		String r = JOptionPane.showInputDialog("What is your favorite animal?");
		
		if (r.equals( "cow")) {
			playMoo();
		}
		else if (r.equals("duck")) {
			playQuack();
		}
		else if (r.equals( "dog")) {
			playWoof();
		}
		else if (r.equals("cat")) {
			playMeow();
		}
		else {
			playLlama();
		}
		}	
		/* 2. Make it so that the user can keep entering new animals. */
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playMeow() {
		playNoise(meowFile);
	}
	void playLlama(){
	playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
