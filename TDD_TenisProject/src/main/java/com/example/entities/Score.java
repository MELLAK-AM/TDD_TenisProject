package com.example.entities;

public class Score {


	private int points;
	private int jeux;
	private int set;
	
	
	public Score() {
	
	}


	public Score(int points, int jeux, int set) {
		super();
		this.points = points;
		this.jeux = jeux;
		this.set = set;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
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
	
	
}
