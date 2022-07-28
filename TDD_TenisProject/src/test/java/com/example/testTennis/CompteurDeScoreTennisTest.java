package com.example.testTennis;

import org.junit.Before;
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
	CompteurDeScoreTennis compteur = new CompteurDeScoreTennis(partie);



	//Lancer une nouvelle partie
	@Before
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

	//Gagner un point 1 point équivaut à 15 points: pour le joueurUn
	@Test
	public void testGagnerUnPointJ1() {
		compteur.AjouterPointGagnant(partie.getJoueurUn());
		Assertions.assertEquals(15, joueurUn.getPoint());
	}

	//Gagner un point équivaut à 15 points : pour le joueurDeux
	@Test
	public void testGagnerUnPointJ2() {
		compteur.AjouterPointGagnant(partie.getJoueurDeux());
		Assertions.assertEquals(15, joueurDeux.getPoint());
	}

	// Test nombre de points, passage de 0 à 15 pour le joueurUn
	@Test
	public void testNombreDePoints15J1() {
		joueurUn.setPoint(0);
		Assertions.assertEquals(0, joueurUn.getPoint());
		compteur.AjouterPointGagnant(partie.getJoueurUn());
		joueurDeux.setPoint(15);
		Assertions.assertEquals(15, joueurUn.getPoint());
	}

	// Test nombre de points, passage de 0 à 15 pour le joueurUn
	@Test
	public void testNombreDePoints15J2() {
		joueurDeux.setPoint(0);
		Assertions.assertEquals(0, joueurDeux.getPoint());
		compteur.AjouterPointGagnant(partie.getJoueurDeux());
		joueurDeux.setPoint(15);
		Assertions.assertEquals(15, joueurDeux.getPoint());
	}

	// Test nombre de points, passage de 15 à 30 pour le joueurUn
	@Test
	public void testNombreDePoints30J1() {
		joueurUn.setPoint(15);
		Assertions.assertEquals(15, joueurUn.getPoint());
		compteur.AjouterPointGagnant(partie.getJoueurUn());
		joueurDeux.setPoint(30);
		Assertions.assertEquals(30, joueurUn.getPoint());
	}

	// Test nombre de points passage de 15 à 30 pour le joueurDeux
	@Test
	public void testNombreDePoints30J2() {
		joueurDeux.setPoint(15);
		Assertions.assertEquals(15, joueurDeux.getPoint());
		compteur.AjouterPointGagnant(partie.getJoueurDeux());
		joueurDeux.setPoint(30);
		Assertions.assertEquals(30, joueurDeux.getPoint());
	}

	// Test nombre de points passage de 30 à 40 pour le joueurUn
	@Test
	public void testNombreDePoints40J1() {
		joueurUn.setPoint(30);
		Assertions.assertEquals(30, joueurUn.getPoint());
		compteur.AjouterPointGagnant(partie.getJoueurDeux());
		joueurUn.setPoint(40);
		Assertions.assertEquals(40, joueurUn.getPoint());
	}

	// Test nombre de points passage de 30 à 40 pour le joueurDeux
	@Test
	public void testNombreDePoints40J2() {
		joueurDeux.setPoint(30);
		Assertions.assertEquals(30, joueurDeux.getPoint());
		compteur.AjouterPointGagnant(partie.getJoueurDeux());
		joueurDeux.setPoint(40);
		Assertions.assertEquals(40, joueurDeux.getPoint());
	}
	
    //Si les deux joueurs sont a egalité a 40 points, si le perdant a un avantage, alors il le perd"
    @Test
    public void testEgalite()
    {
        CompteurDeScoreTennis cpt = new CompteurDeScoreTennis(partie);
        joueurUn.setScore("avantage");
        joueurDeux.setPoint(40);
        cpt.AjouterPointGagnant(joueurDeux);
        Assertions.assertEquals("Egalité", partie.getJoueurDeux().getScore());
    }
	
	// Si les deux joueurs sont a egalité a 40 points, si aucun joueur a un avantage, le joueur qui gagne le point gagne un avantage"  
	@Test
	public void testAvantageJ1() {
		CompteurDeScoreTennis compteur = new CompteurDeScoreTennis(partie);
		joueurUn.setPoint(40);
		joueurDeux.setPoint(40);
		compteur.AjouterPointGagnant(joueurUn );
		Assertions.assertEquals("avantage", partie.getJoueurUn().getScore());
	}
	

	  //"Si un joueur a 40 points gagne le point alors que le perdant a moins de 40 point, alors, il gagne le jeu")
	 @Test   
	 public void testJeuGagne()
	    {
	        joueurUn.setPoint(40);
	        joueurDeux.setPoint(0);
	        compteur.AjouterPointGagnant(joueurUn);
	        Assertions.assertEquals(1, partie.getJoueurUn().getJeux());
	        joueurUn.setPoint(40);
	        joueurDeux.setPoint(15);
	        compteur.AjouterPointGagnant(joueurUn);
	        Assertions.assertEquals(2, partie.getJoueurUn().getJeux());
	        joueurUn.setPoint(40);
	        joueurDeux.setPoint(30);
	        compteur.AjouterPointGagnant(joueurUn);
	        Assertions.assertEquals(3, partie.getJoueurUn().getJeux());
	    }
	 
	 // Quand un jeu est gagné, alors les deux joueurs retournent à 0 point"
	    @Test
	    public void testReinitialiserPoint()
	    {
	    	Assertions.assertEquals(0, partie.getJoueurUn().getJeux());
	        joueurUn.setPoint(40);
	        joueurUn.setScore("avantage");
	        joueurDeux.setPoint(40);
	        compteur.AjouterPointGagnant(joueurUn);
	        Assertions.assertEquals(1, partie.getJoueurUn().getJeux());
	        Assertions.assertEquals(0, partie.getJoueurUn().getPoint());
	        Assertions.assertEquals(0, partie.getJoueurDeux().getPoint());
	    }


	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void testEgaliteJ2() {
//		CompteurDeScoreTennis compteur = new CompteurDeScoreTennis(partie);
//		joueurUn.setPoint(40);
//		joueurDeux.setPoint(40);
//		compteur.AjouterPointGagnant(joueurDeux );
//		Assertions.assertEquals("Egalité", partie.getJoueurDeux().getScore());
//	}
//	

	
	
	
	
//	// si aucun joueur a un avantage, le joueur qui gagne le point gagne un avantage
//	@Test
//	public void testAvantage() {
//		joueurUn.setPoint(40);
//		compteur.AvantageEgalite(partie.getJoueurUn());
//		Assertions.assertEquals("avantage", joueurUn.getPoint());
//		joueurDeux.setPoint(40);
//		compteur.AvantageEgalite(partie.getJoueurDeux());
//		Assertions.assertEquals("avantage", joueurDeux.getPoint());
//	}
//	
	
	
}
