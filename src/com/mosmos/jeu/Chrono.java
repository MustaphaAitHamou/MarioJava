package com.mosmos.jeu;

public class Chrono implements Runnable{

	private final int PAUSE = 3; //Temps d'attente entre deux tours de boucle
	
	@Override
	public void run() {
		
		while(true) {
			
			Main.scene.repaint();
			try {
				Thread.sleep(PAUSE);
			}catch (InterruptedException e) {
			}
		}
	}
	
}
