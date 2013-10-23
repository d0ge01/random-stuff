package it.d0ge01.scuole;

import java.io.IOException;
import java.util.LinkedList;

public class Main {
	private static LinkedList containerS;
	
	public static void main(String[] args) throws IOException {
		containerS = new LinkedList();
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
			System.out.println("7. Modifica Studente");
			System.out.println("0. Esci ");
			
			c = Util.inputInt();
			switch(c) {
			case 0:
				System.out.println("Ciao :)");
				break;
			case 1:
				System.out.print("Inserisci il nome della scuola: ");
				String nome = Util.inputString();
				
				containerS.add(new Scuola(nome));
				break;
			case 2:
				buff1 = chSchool();
				System.out.println("Che classe?");
				String sez = Util.inputString();
				buff1.addClass(sez);
				break;
			case 3:
				buff1 = chSchool();
				buff2 = chClass(buff1);
				System.out.println("Inserisci il nome:");
				name = Util.inputString();
				System.out.println("Inserisci il peso:");
				weight = Util.inputInt();
				do {
					System.out.println("Inserisci la media:");
					vote = Util.inputDouble();
				}while(!(vote>=0 && vote <= 10));
				
				buff2.addStudente(new Studente(name, weight, vote));
				break;
			case 4:
				System.out.println("Inserisci il nome: ");
				String cerco = Util.inputString();
				
				buff1 = chSchool();
				System.out.println(buff1.searchStudent(cerco));
				break;
			case 5:
				buff1 = chSchool();
				buff2 = chClass(buff1);
				
				System.out.println(buff2.toStamp());
				break;
			case 6:
				buff1 = chSchool();
				System.out.println(buff1.toStamp());
				break;
			case 7:
				buff1 = chSchool();
				buff2 = chClass(buff1);
				buff3 = chStudent(buff2);
				System.out.println("Cosa vuoi modificare? (N/W/V)");
				char ch = Util.inputChar();
				System.out.print("Inserisci il nuovo dato: ");
				if ( ch == 'N')
					buff3.setName(Util.inputString());
				if ( ch == 'W')
					buff3.setWeight(Util.inputInt());
				if ( ch == 'V')
					buff3.setVote(Util.inputDouble());
				System.out.println("Campo modificato");
				break;
			default:
				System.out.println("Stupio");
				break;
			}
			
		}
	}
	
	private static Scuola chSchool() throws IOException {
		System.out.println("Di quale scuola? ");
		for ( int i = 0 ; i < containerS.size() ; i++ )
			System.out.println("-"+i+ " " + ((Scuola) containerS.get(i)).name);
		System.out.println("Scegli: ");
		int ch = Util.inputInt();
		if ( ch < 0 || ch > containerS.size() ) {
			System.out.println("Non valido :D ");
			return null;
		}
		return (Scuola) containerS.get(ch);
	}
	
	private static Classe chClass(Scuola x) throws IOException {
		LinkedList buffClassi = x.list();
		System.out.println("Di quale classe? ");
		for ( int i = 0 ; i < buffClassi.size() ; i++ )
			System.out.println("-"+i+ " " + (Classe) buffClassi.get(i));
		System.out.println("Scegli: ");
		int ch = Util.inputInt();
		if ( ch < 0 || ch > buffClassi.size() ) {
			System.out.println("Non valido :D ");
			return null;
		}
		return (Classe) buffClassi.get(ch);
		
	}
	
	private static Studente chStudent(Classe x) throws IOException {
		LinkedList buffStudenti = x.list();
		System.out.println("Quale studente?");
		for ( int i = 0 ; i < buffStudenti.size() ; i++ )
			System.out.println("-"+i+" "+((Studente) buffStudenti.get(i)).name);
		int ch = Util.inputInt();
		if ( ch < 0 || ch > buffStudenti.size()) {
			System.out.println("Non valido");
			return null;
		}
		return ( Studente ) buffStudenti.get(ch);
	}
}
