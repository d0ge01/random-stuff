package it.salvatorecriscione.simulazionilulz;

import java.util.LinkedList;

/*
 * La situazione è questa
 * Sta sera devo andare al cinema, ma ho più posti dove mangiare e un solo cinema.
 * 
 * Partendo a una X ora, e avendo un X - Y tempo per mangiare e andare al cinema in macchina
 * Simulare tutti i tragitti
 */


public class Main {
	static LinkedList<LocaleCibo> v = new LinkedList<LocaleCibo>();
	public static void main(String[] args) {
		Cinema c = new Cinema(70000);
		v.add(new LocaleCibo("MAC San Dona", 15000, 20000, 25000, 0.9));
		v.add(new LocaleCibo("WOK Marco", 35000, 30000, 5000, 0.8));
		v.add(new LocaleCibo("Viceversa", 5000, 10000, 35000, 1.3));
		v.add(new LocaleCibo("Rubin", 5000, 40000, 36000, 0.9));
		v.add(new LocaleCibo("Postiglione", 6000, 34000, 36000, 1.1));
		v.add(new LocaleCibo("Barco", 10000, 30000, 35000, 1));

		
		
		
		Macchina m[] = new Macchina[v.size()];
		for ( int i = 0 ; i < v.size() ; i++ )
			m[i] = new Macchina((LocaleCibo) v.get(i));
		
		c.start();
		// PARTO ALLE 20:00
		for ( int i = 0 ; i < v.size() ; i++ )
			m[i].start();
	}
	
}
