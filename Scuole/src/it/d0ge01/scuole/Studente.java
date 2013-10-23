package it.d0ge01.scuole;

public class Studente {
	protected String name;
	protected int weight;
	protected double vote;
	
	public Studente(String name, int weight, double vote) {
		this.name = name;
		this.weight = weight;
		this.vote = vote;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setVote(double vote) {
		this.vote = vote;
	}
	
	public String toString() {
		return this.name + " Weight: " + this.weight + " Vote: " + this.vote;
	}
}
