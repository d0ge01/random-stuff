package it.d0ge01.main;

public class Prenotazione {
	protected String nome = "";
	protected int costo = 0;
	protected int anticipo=0;
	
	public Prenotazione( String nome, int costo, int anticipo) {
		this.nome = nome;
		this.costo = costo;
		this.anticipo = anticipo;
	}
	
	public void cambiaCosto(int costo) {
		this.costo = costo;
	}
	
	public String toString() {
		return "Prenotazione: " + this.nome + " - " + this.costo + " - " + this.anticipo;
	}
}
