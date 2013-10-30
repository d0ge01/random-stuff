package it.d0ge01.main;

public class Prenotazione {
	protected String nome = "";
	protected double anticipo=0;
	
	public Prenotazione( String nome, double anticipo) {
		this.nome = nome;
		this.anticipo = anticipo;
	}
	
	public void aggiungiAnticipo(double soldi) {
		this.anticipo += soldi;
	}
	
	public String toString() {
		return "Prenotazione: " + this.nome + " " + this.anticipo;
	}
	
	public boolean equals(Object j) {
		if ( j instanceof Prenotazione ) {
			Prenotazione buff = (Prenotazione) j;
			if ( this.nome.equals(buff.nome) && this.anticipo == buff.anticipo )
				return true;
			else
				return false;
		} else
			return false;
	}
}
