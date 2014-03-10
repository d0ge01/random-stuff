package it.salvatorecriscione.ristorante;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Locale {
	protected String nome;
	protected LinkedList<Prenotazione> prenotazioni;
	protected Menu menu;
	protected LinkedList<Tavolo> tavoli;
	
	
	public Locale(String nome) {
		this.prenotazioni = new LinkedList<Prenotazione>();
		this.tavoli = new LinkedList<Tavolo>();
		
		
		this.nome = nome;
		this.setMenu(new Menu());
		
		this.menu.addToMenu("Pasta", 5.00);
		this.menu.addToMenu("Carne", 6.00);
		
	}
	
	private void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	private boolean validate(Prenotazione p) {
		// Controllo che non sia già presente
		boolean ret = true;
		for ( int i = 0 ; i < this.prenotazioni.size() && ret; i++ )
			if ( p.equals(((Prenotazione) this.prenotazioni.get(i))))
				ret = false;
		
		// Controllo che non vada a occupare tavoli altrui
		for ( int i = 0 ; i < this.prenotazioni.size() && ret; i++ )
			if ( p.nTavolo == ((Prenotazione) this.prenotazioni.get(i)).nTavolo)
				ret = false;
		
		return ret;
	}
	
	public void aggiungiPrenotazione(Prenotazione p) {
		if ( this.validate(p) )
			this.prenotazioni.add(p);
		else
			Log.d("Prenotazione non valida...");
	}
	
	public void cancellaPrenotazione(int nTavolo) {
		for ( int i = 0 ; i < this.prenotazioni.size(); i++ )
			if ( nTavolo == ((Prenotazione) this.prenotazioni.get(i)).nTavolo)
				this.prenotazioni.remove(i);
	}
	
	public LinkedList<Prenotazione> getPren() {
		return this.prenotazioni;
	}
}
