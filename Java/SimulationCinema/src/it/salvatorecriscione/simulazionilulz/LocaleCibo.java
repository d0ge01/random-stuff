package it.salvatorecriscione.simulazionilulz;

public class LocaleCibo extends Locale{
	
	private double timeToCinema;
	private double gradimento;
	
	public LocaleCibo(String nome, double x, double y, double z, double gradimento) {
		super(nome, x*gradimento, y*gradimento);
		// TODO Auto-generated constructor stub
		this.timeToCinema = z;
	}
	
	public double timeCinema() {
		return this.timeToCinema;
	}
	
}
