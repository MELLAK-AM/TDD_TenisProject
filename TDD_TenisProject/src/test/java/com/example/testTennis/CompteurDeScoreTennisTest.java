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
	CompteurDeScoreTennis compteur = new CompteurDeScoreTennis();
	
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
	
	// Début de la partie 0 points.
	@Test
	public void testDebutPartie0Point() {
		Assertions.assertEquals(0, partie.getJoueurUn().getPoint());
		Assertions.assertEquals(0, partie.getJoueurDeux().getPoint());
	}
	
	// Début de la partie 0 jeux
	@Test
	public void testDebutPartie0Jeux() {
		Assertions.assertEquals(0, partie.getJoueurUn().getJeux());
		Assertions.assertEquals(0, partie.getJoueurDeux().getJeux());
	}
	// Début de la partie 0 set
	
	@Test
	public void testDebutPartie0Set() {
		Assertions.assertEquals(0, partie.getJoueurUn().getSet());
		Assertions.assertEquals(0, partie.getJoueurDeux().getSet());
	}
	
	
	//Gagner un point : pour le joueurUn
	@Test
	public void testGagnerUnPointJ1() {
		compteur.AjouterPoint(joueurUn);
		Assertions.assertEquals(15, joueurUn.getPoint());
	}
	
	//Gagner un point : pour le joueurDeux
	@Test
	public void testGagnerUnPointJ2() {
		compteur.AjouterPoint(joueurDeux);
		Assertions.assertEquals(15, joueurDeux.getPoint());
	}
	
}
