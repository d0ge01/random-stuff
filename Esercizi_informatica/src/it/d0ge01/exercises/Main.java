package it.d0ge01.exercises;

import java.io.IOException;

import it.d0ge01.exercises.ex2309.Ex2309;
import it.d0ge01.exercises.util.*;

public class Main {
	public static void main(String[] Args) throws IOException {
		menu();
	}
	
	private static void menu() throws IOException {
		int sc = 0;
		while ( true ) {
			System.out.println("1  - Esercizi 23 / 09 ");
			System.out.println("99 - Crediti ");
			System.out.println("0  - Esci ");
			sc = Util.inputInt();
			
			if ( sc == 1 )
				Ex2309.menu();
			
			if ( sc == 99 )
				credits();
			
			if ( sc == 0 )
				return;
		}
	}
	
	private static void credits() {
		System.out.println("Author: Salvatore Criscione | 4B | Itis Volterra San don� di piave");
	}
}
