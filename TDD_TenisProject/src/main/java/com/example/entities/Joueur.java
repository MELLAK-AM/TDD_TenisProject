package com.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

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


	
}
