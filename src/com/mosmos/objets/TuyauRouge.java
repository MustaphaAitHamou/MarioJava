package com.mosmos.objets;

import java.awt.Image;

import javax.swing.ImageIcon;

public class TuyauRouge extends Objet{

	
	//Constructeur
	public TuyauRouge(int x, int y) {
		
		super(x, y, 43, 65);
		this.icoObjet = new ImageIcon(getClass().getResource("/images/tuyauRouge.png"));
		this.imgObjet = this.icoObjet.getImage();
	}

	//Getters 
	
	
	//Setters

}
