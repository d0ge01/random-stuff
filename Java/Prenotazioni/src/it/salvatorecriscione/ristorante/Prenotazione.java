package it.salvatorecriscione.ristorante;

public class Prenotazione {
	protected int nTavolo;
	protected String cognome;
	
	public Prenotazione(int nTavolo, String cognome) {
		this.nTavolo = nTavolo;
		this.cognome = cognome;
	}
	
	public boolean equals(Object x) {
		if ( x instanceof Prenotazione) {
			if ( this.nTavolo == ((Prenotazione) x).nTavolo && this.cognome.equals(((Prenotazione) x).cognome))
				return true;
			else
				return false;
		} else {
			return false;
		}
	}
}
