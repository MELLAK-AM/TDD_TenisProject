package com.example.entities;


import lombok.Data;

@Data

public class Partie {
	
	
	
	private Joueur joueurUn;
	private Joueur joueurDeux;
	
	public Partie(Joueur joueurUn, Joueur joueurDeux) {
		
		this.joueurUn = joueurUn;
		this.joueurDeux = joueurDeux;
	}
	
	
	
	

	

}


