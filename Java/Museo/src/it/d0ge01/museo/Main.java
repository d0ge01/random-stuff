package it.d0ge01.museo;

public class Main {

	public static void main(String[] args) {
		int nTuristi = 100;
		
		Turista[] folla = new Turista[nTuristi];
		Entrata louvre = new Entrata(10);
		
		for ( int i = 0 ; i < nTuristi; i++ ) {
			folla[i] = new Turista(louvre, "Utente" + i);
		}
		
		for ( int i = 0 ; i < nTuristi ; i++ )
			folla[i].start();
	}
}
