package com.mosmos.affichage;

public class Score {

	private final int NB_TOTAL_PIECES = 10;
	private int nbPieces;
	
	public Score() {
		this.nbPieces = 0;
	}
	
	public int getNbPieces() {
		return nbPieces;
	}
	
	public int getNB_TOTAL_PIECES() {
		return NB_TOTAL_PIECES;
	}
	
	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}
	
}
