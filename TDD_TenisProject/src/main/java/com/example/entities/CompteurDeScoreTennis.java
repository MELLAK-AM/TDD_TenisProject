package com.example.entities;


public class CompteurDeScoreTennis {

	private Partie partie;

	public void AjouterPoint(Joueur winer) {
		if(!partie.getJoueurUn().isGagnant() && !partie.getJoueurDeux().isGagnant()) 
		{

			if (winer.getPoint()== 0) 

			{
				winer.setPoint(15);
			}
			
		}
	}




}


















//	public static String demarrerPartie() {
//		return "La partie commence";
//		
//	}







