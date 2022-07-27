package com.example.testTennis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.entities.CompteurDeScoreTennis;


public class CompteurDeScoreTennisTest {

	// Test de début de partie
	@Test
	public void testDemarrerPartie() {
		String debut = CompteurDeScoreTennis.demarrerPartie();
		assertEquals("La partie commence", debut);

	}
}
