package com.mosmos.objets;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.mosmos.jeu.Main;

public class Objet {
	private int largeur, hauteur;
	private int x, y;
	
	protected Image imgObjet;
	protected ImageIcon icoObjet;
	
	//Constructeur
	
	public Objet(int x, int y, int largeur, int hauteur) {
		
		this.x = x;
		this.y = y;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	//getters 
	
	public int getLargeur() {
		return largeur;
	}
	
	public int getHauteur() {
			return hauteur;
		}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Image getImgObjet() {
		return imgObjet;
	}

	public ImageIcon getIcoObjet() {
		return icoObjet;
	}
	
	//setters
	
	public void setIcoObjet(ImageIcon icoObjet) {
		this.icoObjet = icoObjet;
	}

	public void setImgObjet(Image imgObjet) {
		this.imgObjet = imgObjet;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//Méthodes
	
	public void deplacement() {
		
		if(Main.scene.getxPos() >= 0) {
			this.x = this.x - Main.scene.getDx();
			
		}
	}
}
