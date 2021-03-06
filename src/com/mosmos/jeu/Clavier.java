package com.mosmos.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.mosmos.audio.Audio;

public class Clavier implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		if(Main.scene.mario.isVivant() == true) {
			
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			
			//Annule le d?calage de 1 cr?? par deplacementfond (PanJeu)
			if(Main.scene.getxPos() == -1) {
				Main.scene.setxPos(0);
				Main.scene.setxFond1(-50);
				Main.scene.setxFond2(750);
			}
			
			Main.scene.mario.setMarche(true);
			Main.scene.mario.setVersDroite(true);
			Main.scene.setDx(1);
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			
			if(Main.scene.getxPos() == 4431) {
				Main.scene.setxPos(4430);
				Main.scene.setxPos(-50);
				Main.scene.setxPos(750);
			}
	
			Main.scene.mario.setMarche(true);
			Main.scene.mario.setVersDroite(false);
			Main.scene.setDx(-1);
		}
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			Main.scene.mario.setSaut(true);
			Audio.playSound("/audio/saut.wav");
		}
	}

}


	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.mario.setMarche(false);
		Main.scene.setDx(0);
		}
	
	@Override
	public void keyTyped(KeyEvent e) {}

}
