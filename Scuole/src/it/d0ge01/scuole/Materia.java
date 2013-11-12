package it.d0ge01.scuole;

import java.util.LinkedList;

public class Materia {
	private LinkedList voti;
	protected String nome;
	private double votoMedio;
	
	public Materia(String nome) {
		this.nome = nome;
		this.voti = new LinkedList();
	}
	
	public void aggiungiVoto(double voto) {
		voti.add(voto);
		this.votoMedio = genMedia();;
	}
	
	public String toString() {
		String ret = "\n- " + this.nome + ": \n";
		for ( int i = 0; i < this.voti.size(); i++ )
			ret += "\t"+i+" - " + ((double) this.voti.get(i)) + " \n";
		return ret;
	}
	
	private double genMedia() {
		double ret = 0;
		for ( int i = 0 ; i < voti.size() ; i++ )
			ret += (double) voti.get(i);
		return ( ret / voti.size());
	}
}
