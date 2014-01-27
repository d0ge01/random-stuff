package it.salvatorecriscione.ristorante;

import it.salvatorecriscione.ristorante.utils.Utils;

public class Main {
	public static void main(String[] args) {
		
		System.out.print("Vuoi un interfaccia testuale[T] o una gui?[G]");
		char ch = Utils.inputChar();
		
		Ui user = new Ui(ch, "Maremio");
	}
}
