package it.salvatorecriscione.simulazionilulz;

public class Locale {
	private double tempoPerArrivare;
	private double tempoPerMangiare;
	private String nome;
	
	public Locale(String nome, double x, double y) {
		this.nome = nome;
		this.tempoPerArrivare = x;
		this.tempoPerMangiare = y;
	}
	
	public String getNome() {
		return this.nome;
	}
	public double getRoamingTime() {
		return this.tempoPerArrivare;
	}
	
	public double getDinnerTime() {
		return this.tempoPerMangiare;
	}
}
