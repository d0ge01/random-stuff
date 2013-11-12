package it.d0ge01.main;

import java.io.IOException;
import java.util.LinkedList;

public class Main {
	static LinkedList viaggi = new LinkedList();
	
	public static void main(String[] args) throws IOException {
		menu();
	}
	
	private static void menu() throws IOException {
		Viaggio buff1;
		Viaggio buff2;
		String buff;
		Prenotazione buff3;
		
		boolean buff4 = false;
		double anticipo;
		
		while(true) {
			System.out.println("Agenzia viaggi:  ");
			System.out.println("1- Aggiungi viaggio");
			System.out.println("2- Aggiungi prenotazione");
			System.out.println("3- Sposta prenotazioni");
			System.out.println("4- Vedi prenotazioni");
			System.out.println("5- Cerca prenotazione in un viaggio dal nome");
			System.out.println("6- Cancella prenotazione");
			System.out.println("7- Cerca viaggio data prenotazione");
			System.out.println("0- Esci");
			int ch = Util.inputInt();
			switch ( ch ) {
			case 1:
				System.out.print("Inserisci la destinazione: ");
				String dest = Util.inputString();
				System.out.print("Inserisci il costo: ");
				double cost = Util.inputDouble();
				viaggi.add(new Viaggio(dest, cost));
				break;
			case 2:
				buff1 = chViaggio();
				System.out.print("Inserisci il nome: ");
				buff = Util.inputString();
				System.out.print("Inserisci l'anticipo versato: ");
				anticipo = Util.inputDouble();
				buff1.aggiungiPrenotazione(new Prenotazione(buff, anticipo));
				break;
			case 3:
				buff1 = chViaggio();
				buff2 = chViaggio();
				buff2.importBook(buff1.getBook());
				System.out.println("Trasferimento avvenuto");
				break;
			case 4:
				buff1 = chViaggio();
				System.out.println(buff1);
				break;
			case 5:
				buff1 = chViaggio();
				System.out.print("Inserisci il nome del elemento da cercare: ");
				buff = Util.inputString();
				System.out.println(buff1.searchPByName(buff) != null ? buff1.searchPByName(buff) : "Non esiste nessun " + buff + "...");
				break;
			case 6:
				buff1 = chViaggio();
				buff3 = chPrenotazione(buff1);
				if ( buff3 != null ) {
					int iPren = buff1.getIndex(buff3);
					if ( iPren >= 0 )
						buff1.deletePrenByIndex(iPren);
				}
				break;
			case 7:
				System.out.print("Inserisci il nome: ");
				buff = Util.inputString();
				System.out.print("Inserisci l'anticipo versato: ");
				anticipo = Util.inputDouble();
				buff3 = new Prenotazione(buff, anticipo);
				
				for ( int i = 0; i < viaggi.size(); i++ ) {
					for ( int j = 0 ; j < ((Viaggio) viaggi.get(i)).book.size() ; j++ )
						if ( ((Prenotazione) ((Viaggio) viaggi.get(i)).book.get(j)).equals(buff3)) {
							System.out.println(((Viaggio) viaggi.get(i)));
							buff4 = true;
						}		
				}
				
				if ( !buff4 ) {
					System.out.println("Viaggio non trovato...");
					buff4 = false;
				}
				break;
			default:
				return;
			}
		}
	}
	
	private Viaggio scegliViaggio(String dest) {
		for ( int i = 0 ; i < viaggi.size() ; i++ )
			if (((Viaggio) viaggi.get(i)).destinazione == dest )
				return (Viaggio) viaggi.get(i);
		return null;
	}
	
	private static Viaggio chViaggio() throws IOException {
		System.out.println("Quale viaggio? ");
		for ( int i = 0 ; i < viaggi.size() ; i++ )
			System.out.println("-"+i+"  "+ ((Viaggio) viaggi.get(i)).destinazione);
		int ch = Util.inputInt();
		return (Viaggio) viaggi.get(ch);
	}
	
	private static Prenotazione chPrenotazione(Viaggio viaggio) throws IOException {
		if ( viaggio.book.size() == 0 ) {
			System.out.println("Non ci sono prenotazioni per questo viaggio");
			return null;
		}
		System.out.println("Quale prenotazione? ");
		for ( int i = 0 ; i < viaggio.book.size() ; i++ )
			System.out.println("-"+(i+1)+"  "+ ((Prenotazione) viaggio.book.get(i)));
		int ch = Util.inputInt() -1 ;
		if ( ch < viaggio.book.size())
			return (Prenotazione) viaggio.book.get(ch);
		else
			return null;
	}
	
	
}
