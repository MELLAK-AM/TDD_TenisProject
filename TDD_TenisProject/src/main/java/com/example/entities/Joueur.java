package com.example.entities;


public class Joueur {

	private String nom;
	private int point;
	private int jeux;
	private int set;
	private boolean gagnant;
 
	//on initialise les : point, jeux et set à 0 au début de la partie
	public Joueur(String nom) {
	 point= 0;
	 jeux=0;
	 set=0;
	 this.nom=nom;
	 gagnant = false;
	 
 }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getJeux() {
		return jeux;
	}

	public void setJeux(int jeux) {
		this.jeux = jeux;
	}

	public int getSet() {
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}

	public boolean isGagnant() {
		return gagnant;
	}

	public void setGagnant(boolean gagnant) {
		this.gagnant = gagnant;
	}

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", point=" + point + ", jeux=" + jeux + ", set=" + set + ", gagnant=" + gagnant
				+ "]";
	}
}
