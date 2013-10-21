package it.d0ge01.scuole;

import java.io.IOException;

public class Main {
	private static Scuola[] containerS;
	private static int posx = 0;
	
	public static void main(String[] args) throws IOException {
		containerS = new Scuola[30];
		menu();
	}
	
	private static void menu() throws IOException {
		int c = -1;
		Scuola buff1;
		Classe buff2;
		Studente buff3;
		
		String name;
		int weight;
		double vote;
		while ( c != 0 ) {
			System.out.println("1. Aggiungi una scuola");
			System.out.println("2. Aggiungi classe in una scuola");
			System.out.println("3. Aggiungi studenti in una classe");
			System.out.println("4. Cerca studente in una scuola ");
			System.out.println("5. Elenca studenti di una classe");
			System.out.println("6. Elenca studenti di una scuola");
			
			System.out.println("0. Esci ");
			
			c = Util.inputInt();
			switch(c) {
			case 0:
				System.out.println("Ciao :)");
				break;
			case 1:
				System.out.print("Inserisci il nome della scuola: ");
				String nome = Util.inputString();
				
				System.out.println("Inserisci il numero massimo di classi: ");
				int sizeN = Util.inputInt();
				
				containerS[posx] = new Scuola(nome, sizeN);
				if ( posx < 30 )
					posx += 1;
				break;
			case 2:
				buff1 = chSchool();
				System.out.println("Che classe?");
				String sez = Util.inputString();
				buff1.addClass(Integer.valueOf(sez.charAt(0)), (char) sez.charAt(1) );
				break;
			case 3:
				buff1 = chSchool();
				buff2 = chClass(buff1);
				System.out.println("Inserisci il nome:");
				name = Util.inputString();
				System.out.println("Inserisci il peso:");
				weight = Util.inputInt();
				System.out.println("Inserisci la media:");
				vote = Util.inputDouble();
				
				buff2.addStudente(new Studente(name, weight, vote));
				break;
			default:
				System.out.println("Stupio");
				break;
			}
			
		}
	}
	
	private static Scuola chSchool() throws IOException {
		System.out.println("Di quale scuola? ");
		for ( int i = 0 ; i < posx ; i++ )
			System.out.println("-"+i+ " " + containerS[i].name);
		System.out.println("Scegli: ");
		int ch = Util.inputInt();
		if ( ch < 0 || ch > posx ) {
			System.out.println("Non valido :D ");
			return null;
		}
		return containerS[ch];
	}
	
	private static Classe chClass(Scuola x) throws IOException {
		Classe[] buffClassi = x.list();
		System.out.println("Di quale scuola? ");
		for ( int i = 0 ; i < buffClassi.length ; i++ )
			System.out.println("-"+i+ " " + buffClassi[i].name);
		System.out.println("Scegli: ");
		int ch = Util.inputInt();
		if ( ch < 0 || ch > buffClassi.length ) {
			System.out.println("Non valido :D ");
			return null;
		}
		return buffClassi[ch];
		
	}
}
