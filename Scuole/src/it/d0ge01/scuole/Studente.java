package it.d0ge01.scuole;

import java.util.LinkedList;

public class Studente {
	protected String name;
	protected int weight;
	protected LinkedList vote;
	
	public Studente(String name, int weight) {
		this.name = name;
		this.weight = weight;
		this.vote = new LinkedList();
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setVote(String materia, double voto) {
		boolean pres = false;
		for ( int i = 0; i < this.vote.size(); i++ )
			if ( ((Materia) this.vote.get(i)).nome.equals(materia) ) {
				((Materia) this.vote.get(i)).aggiungiVoto(voto);
				pres = true;
			}
		if ( !pres ) {
			Materia buff = new Materia(materia);
			buff.aggiungiVoto(voto);
			this.vote.add(buff);
		}
		
	}
	
	public String stampVote() {
		String ret = "";
		for ( int i = 0; i < this.vote.size(); i++ )
			ret += (Materia) this.vote.get(i);
		return ret;
	}
	
	public String toString() {
		return this.name + " Weight: " + this.weight + " Vote: " + this.stampVote();
	}
}
