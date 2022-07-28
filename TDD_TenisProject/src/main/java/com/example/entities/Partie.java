package com.example.entities;

public class Partie {
	
	private Joueur joueurUn;
	private Joueur joueurDeux;
	
	public Partie(Joueur joueurUn, Joueur joueurDeux) {
		
		this.joueurUn = joueurUn;
		this.joueurDeux = joueurDeux;
	}

	public Joueur getJoueurUn() {
		return joueurUn;
	}

	public void setJoueurUn(Joueur joueurUn) {
		this.joueurUn = joueurUn;
	}

	public Joueur getJoueurDeux() {
		return joueurDeux;
	}

	public void setJoueurDeux(Joueur joueurDeux) {
		this.joueurDeux = joueurDeux;
	}
	
	
}


