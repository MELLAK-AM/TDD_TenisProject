package com.example.entities;


public class CompteurDeScoreTennis {

	private Partie partie;
	
	
	public CompteurDeScoreTennis(Partie partie) {
		super();
		this.partie = partie;
	}



	public void AjouterPointGagnant(Joueur winner) {
		if(!partie.getJoueurUn().isGagnant() && !partie.getJoueurDeux().isGagnant()) 
		{
			if (winner.getPoint()== 0) 
			{
				winner.setPoint(15);
			} else if (winner.getPoint() == 15 ){
				winner.setPoint(30);
			}  else if (winner.getPoint() == 30 ) {
				winner.setPoint(40);
			} 
			
		}
	}

//	public void AjouterPoint(Joueur vainqueur)
//	    {
//	        if(!partie.getJoueurUn().isGagnant() && !partie.getJoueurDeux().isGagnant()) {
//	            if (vainqueur.getPoint() == 0) {
//	                vainqueur.setPoint(15);
//	            } else if (vainqueur.getPoint() == 15) {
//	                vainqueur.setPoint(30);
//	            } else if (vainqueur.getPoint() == 30) {
//	                vainqueur.setPoint(40);
//	            } else {
//	                Joueur perdant;
//	                if (vainqueur.equals(partie.getJoueurUn())) {
//	                    perdant = partie.getJoueurDeux();
//	                } else {
//	                    perdant = partie.getJoueurUn();
//	                }

	            //}
	        }
	   // }

//}


















//	public static String demarrerPartie() {
//		return "La partie commence";
//		
//	}







