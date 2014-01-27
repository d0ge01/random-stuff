package it.salvatorecriscione.ristorante;

import it.salvatorecriscione.ristorante.utils.Utils;

import java.util.LinkedList;

public class Ui {
	private int type = 0;
	private String typeName;
	private Locale locale;
	
	public Ui(char t, String nome) {
		this.locale = new Locale(nome);
		if ( t == 'T' ){
			this.type = 1;
			this.typeName = "text ui";
		}
		if ( t == 'G' ) {
			this.type = 2;
			this.typeName = "gui";
		}
		
		this.menu();
	}
	
	private void menu() {
		if (this.type == 1) {
			this.textUi();
		} else
			this.gui();
	}
	
	private void textUi() {
		int sc = -1;
		while(sc != 0 ) {
			System.out.println("Benvenuto al ristorante :D " + this.locale.nome);
			System.out.println("1. Aggiungi prenotazione");
			System.out.println("2. Cancella una prenotazione");
			System.out.println("3. Vedi prenotazioni");
			System.out.print("Cosa vuoi fare? ");
			sc = Utils.inputInt();
			if ( sc == 1 ) {
				System.out.println("N tavolo? ");
				int s = Utils.inputInt();
				System.out.println("Cognome? ");
				String c = Utils.inputString();
				this.locale.aggiungiPrenotazione(new Prenotazione(s,c));
			}
			
			if ( sc == 2 ) {
				System.out.println("N tavolo? ");
				int s = Utils.inputInt();
				this.locale.cancellaPrenotazione(s);
			}
			
			if ( sc == 3 ) {
				LinkedList<Prenotazione> pren = this.locale.getPren();
				for ( int i = 0 ; i < pren.size() ; i++ ) {
					System.out.println("===== PREN " + i + " ========");
					System.out.println("nTavolo: " + pren.get(i).nTavolo + "   Cognome: " + pren.get(i).cognome);
					
				}
			}
		}
	}
	
	private void gui() {
		
	}
}
