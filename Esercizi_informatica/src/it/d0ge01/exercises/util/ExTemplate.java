package it.d0ge01.exercises.util;

import java.io.IOException;

public abstract class ExTemplate {
	
	public static String[] testo;
	
	public ExTemplate(String[] t) throws IOException {
		testo = t;
		this.menu();
	}
	
	public void menu() throws IOException {
		int sc = 0;
		while ( true ) {
			System.out.println("\n Menu ");
			for ( int i = 0 ; i < 6 ; i++ )
				System.out.println("" + ( i + 1) + "- " + testo[i]);
			System.out.print(">");
			sc = Util.inputInt();
			
			if ( sc == 1 )
				esercizio1();
			
			if ( sc == 2 )
				esercizio2();
			
			if ( sc == 3 )
				esercizio3();
			
			if ( sc == 4 )
				esercizio4();
			
			if ( sc == 5 )
				esercizio5();
			
			if ( sc == 6 )
				esercizio6();
			
			if ( sc == 0 )
				return;
		}
	}
	
	public void esercizio1() throws IOException {
	}
		
	public void esercizio2() throws IOException {
		
	}
	
	public void esercizio3() throws IOException {
		
	}
	
	public void esercizio4() throws IOException {
		
	}
	
	public void esercizio5() throws IOException {
		
	}
	
	public void esercizio6() throws IOException {
			
	}
	
	

}
