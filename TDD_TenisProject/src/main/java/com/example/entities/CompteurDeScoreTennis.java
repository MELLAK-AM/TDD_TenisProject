package com.example.entities;


public class CompteurDeScoreTennis {

	private Partie partie;
	private String avantage = "avantage";

	public CompteurDeScoreTennis(Partie partie) {
		super();
		this.partie = partie;
	}







	public void AjouterPointGagnant(Joueur winner) {
		//calculer le nbre de point 0-15, 15-30 et 30-40
		if(!partie.getJoueurUn().isGagnant() && !partie.getJoueurDeux().isGagnant()) 
		{
			//on initialise le debut de la partie à 0
			if (winner.getPoint()== 0) 
			{
				//on modifie les points à 15 quand un point est marqué
				winner.setPoint(15);
				//le passage de 15 à 30 points
			} else if (winner.getPoint() == 15 ){
				winner.setPoint(30);
			}  else if (winner.getPoint() == 30 ) {
				//le passage de 30 à 40 points
				winner.setPoint(40);
		//les deux joueurs sont à égalités
			} else {
				Joueur looser;
				if(winner.equals(partie.getJoueurUn())) {
					looser = partie.getJoueurDeux();
				}else {
					looser = partie.getJoueurUn();
				}
				
				if(looser.getPoint()==40 && !winner.getScore().equals("avantage")) {
					winner.setScore("avantage");
				}else if(looser.getScore().equals("avantage")) {
					looser.setPoint(40);
					looser.setScore("Egalité");
					winner.setPoint(40);
					winner.setScore("Egalité");
				} else {
					JeuxGagnant(winner);
				}

			}

		}
	}
	
	//A chaque jeux gagnant on incrémente le jeux de 1
	public void JeuxGagnant(Joueur winner) {
		winner.setJeux(winner.getJeux()+1);
		//on incrémente de 1 et on renitialise le nbre de point à chaque jeu gagné
		reinitialiserPoints();
	}
	
	//renitialisation des points lorsqu'un jeu est remporté 

	  public void reinitialiserPoints()
	    {
	        partie.getJoueurUn().setPoint(0);
	        partie.getJoueurDeux().setPoint(0);
	    
	    }


	//	public void AvantageEgalite(Joueur winner) {
	//		if(!partie.getJoueurUn().isGagnant()  && partie.getJoueurDeux().isGagnant()) {
	//			winner.setPoint(40);
	//			System.out.println("les joueurs sont à égalité");
	//		} else if (partie.getJoueurUn().getPoint() > partie.getJoueurDeux().getPoint()) {
	//			System.out.println(avantage);
	//		}else {
	//			System.out.println(avantage);
	//		}
	//	}



}




//	public static String demarrerPartie() {
//		return "La partie commence";
//		
//	}







