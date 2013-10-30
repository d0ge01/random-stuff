package it.d0ge01.main;

import java.util.LinkedList;

public class Viaggio {
	protected LinkedList<Prenotazione> book;
	protected String destinazione;
	protected double costo;
	
	public Viaggio(String dest, double costo) {
		this.destinazione = dest;
		this.costo = costo;
		this.book = new LinkedList();
	}
	
	public void aggiungiPrenotazione(Prenotazione s) {
		this.book.add(s);
	}
	
	public String toString() {
		int i;
		String ret = "Lista prenotazioni per " + this.destinazione + " ( costo : " + this.costo + " ) :\n";
		for ( i = 0 ; i < this.book.size(); i++ )
			ret += "-"+i+" "+this.book.get(i) + "\n";
		ret += "ci sono " + i + " prenotazioni..\n";
		return ret;
	}
	
	public void cambiaCosto(double costo) {
		this.costo = costo;
	}
	
	public LinkedList<Prenotazione> getBook() {
		LinkedList buff = this.book;
		book = new LinkedList();
		return buff;
	}
	
	
	public void importBook(LinkedList v) {
		for ( int i = 0 ; i < v.size() ; i++ ) {
			this.book.add((Prenotazione) v.get(i));
		}
	}
	
	public Prenotazione searchPByName(String name) {
		for ( int i = 0 ; i < this.book.size() ; i++ ) {
			if ( this.book.get(i).nome.equals(name) )
				return this.book.get(i);
		}
		return null;
	}
	
	public void deletePrenByIndex(int i) {
		this.book.remove(i);
	}
	
	public int getIndex(Prenotazione p) {
		for ( int i = 0 ; i <= this.book.size(); i++ )
			if ( this.book.get(i).equals(p))
				return i;
		return -1;
	}
}
