package it.salvatorecriscione.ristorante;

import java.util.LinkedList;
import java.util.List;

public class Menu {
	protected LinkedList<String> nomi;
	protected LinkedList<Double> prezzi;
	
	public Menu() {
		this.nomi = new LinkedList<String>();
		this.prezzi = new LinkedList<Double>();
	}
	
	public void addToMenu(String n, double x) {
		nomi.add(n); prezzi.add(x);
	}
	
	public double getPrezzo(String oggetto) {
		for ( int i = 0; i < this.nomi.size() ; i++ )
			if ( this.nomi.get(i).equals(oggetto))
				return (double) this.prezzi.get(i);
		return -1;
	}
}
