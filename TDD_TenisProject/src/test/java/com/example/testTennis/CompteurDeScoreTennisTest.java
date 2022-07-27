package com.example.testTennis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.entities.CompteurDeScoreTennis;
import com.example.entities.Joueur;
import com.example.entities.Partie;


public class CompteurDeScoreTennisTest {

	// Test de début de partie
//	@Test
//	public void testDemarrerPartie() {
//		String debut = CompteurDeScoreTennis.demarrerPartie();
//		assertEquals("La partie commence", debut);
//
//	}
	

	Joueur joueurUn= new Joueur("toto");
	Joueur joueurDeux= new Joueur("titi");
	Partie partie = new Partie(joueurUn, joueurDeux);

	
	//Lancer une nouvelle partie
	@Test
	public void nouvellePartie() {
		Assertions.assertNotNull(partie);
	}
	
	
	//Créer deux joueurs 
	@Test
	@DisplayName("création de deux joueurs")
	public void creerJoueurs() {
		Assertions.assertNotNull(joueurUn);
		Assertions.assertNotNull(joueurDeux);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
