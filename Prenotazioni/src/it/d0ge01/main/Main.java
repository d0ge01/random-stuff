package it.d0ge01.main;

import java.io.IOException;
import java.util.LinkedList;

public class Main {
	static LinkedList viaggi = new LinkedList();
	
	public static void main(String[] args) throws IOException {
		menu();
	}
	
	private static void menu() throws IOException {
		while(true) {
		System.out.println("1- Aggiungi viaggio");
		System.out.println("2- Aggiungi prenotazione");
		System.out.println("3- Sposta prenotazioni");
		System.out.println("4- Vedi prenotazioni");
		System.out.println("0- Esci");
		int ch = Util.inputInt();
		switch ( ch ) {
		case 1:
			System.out.print("Inserisci la destinazione: ");
			String dest = Util.inputString();
			viaggi.add(new Viaggio(dest));
			break;
		case 2:
			Viaggio buff = chViaggio();
			System.out.println("Inserisci il nome: ");
			String nome = Util.inputString();
			buff.aggiungiPrenotazione(new Prenotazione(nome, 50, 50));
			break;
		case 3:
			Viaggio buff1 = chViaggio();
			Viaggio buff2 = chViaggio();
			buff2.importBook(buff1.getBook());
			break;
		case 4:
			Viaggio buff3 = chViaggio();
			System.out.println(buff3);
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
}
