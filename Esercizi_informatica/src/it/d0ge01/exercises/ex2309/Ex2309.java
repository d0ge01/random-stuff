package it.d0ge01.exercises.ex2309;

import it.d0ge01.exercises.util.Util;

import java.io.IOException;

public class Ex2309 {
	public static void menu() throws IOException {
		int sc = 0;
		int buff = 10;
		while ( true ) {
			System.out.println("\n Menu ");
			System.out.println("1- Media 3 Vettori reali");
			System.out.println("2- Controlla '*' in un vettore di caratteri");
			System.out.println("3- Controlla elementi pari in un vettore integer");
			System.out.println("4- Conta elementi diversi v1, v2 = integer");
			System.out.println("5- Conta le cifre di un naturale :D");
			System.out.println("6- Calcola radice in un numero reale");
			System.out.println("0- Esci");
			sc = Util.inputInt();
			
			if ( sc == 1 )
				Esercizio1(3);
			
			if ( sc == 2 )
				Esercizio2(3);
			
			if ( sc == 3 )
				Esercizio3(3);
			
			if ( sc == 4 )
				Esercizio4(3);
			
			if ( sc == 5 )
				Esercizio5();
			
			
			if ( sc == 0 )
				return;
		}
	}
	
	private static void Esercizio1(int dim) throws IOException {
		double[] v1 = new double[dim];
		double[] v2 = new double[dim];
		double[] v3 = new double[dim];
		
		Util.loadArrayDouble("Inserisci l'elemento reale (1° v ): ", v1);
		Util.loadArrayDouble("Inserisci l'elemento reale (2° v ): ", v2);
		Util.loadArrayDouble("Inserisci l'elemento reale (3° v ): ", v3);
		
		System.out.println("La somma del primo vettore e' " + sumAllDouble(v1));
		System.out.println("La somma del secondo vettore e' " + sumAllDouble(v2));
		System.out.println("La somma del terzo vettore e' " + sumAllDouble(v3));
		
		
	}
	
	private static double sumAllDouble(double[] v) {
		// TODO Auto-generated method stub
		double s = 0;
		for ( int i = 0 ; i < v.length ; i++ )
			s += v[i];
		return s;
	}

	private static void Esercizio2(int dim) throws IOException {
		char[] v = new char[dim];
		boolean c= false;
		Util.loadArrayChar("Inserisci un carattere: ", v);
		/*
			for ( int i = 0 ; i < v.length ; i++ )
				if ( v[i] == '*')
					return true;
			// WARNING , Zorzi fury detected
			return false;
		*/
		
		for ( int i = 0 ; i < v.length ; i++ )
			if ( v[i] == '*')
				c = true;
		System.out.println(c);
	}
	
	private static void Esercizio3(int dim) throws IOException {
		int[] v = new int[dim];
		boolean c = true;
		int i = 0;
		
		
		Util.loadArrayInt("Inserisci un intero: ", v);
		while ( c && i < dim ) {
			if ( v[i] % 2 != 0 )
				c = false;
			i++;
		}
		System.out.println(c);
	}
	
	private static void Esercizio4(int dim) throws IOException {
		int[] v1 = new int[dim];
		int[] v2 = new int[dim];
		int n = 0;
		
		Util.loadArrayInt("Inserisci un intero (1v): ", v1);
		Util.loadArrayInt("Inserisci un intero (2v): ", v2);
		
		for ( int i = 0 ; i < dim ; i++ )
			if ( !Util.checkIntIndex(v2, v1[i]) )
				n += 1;
		
		System.out.println(n);
	}
	
	private static void Esercizio5() throws IOException {
		System.out.print("Inserisci un reale: ");
		double n = Util.inputDouble();
		/*
		 * System.out.println(contaCifre(n));
		 * 
		 * Work in progress 
		 */
	}
	
	private static int contaCifre(double n) {
		// TODO Auto-generated method stub
		if ( n <= 1 )
			return 0;
		else
			return ( 1 + contaCifre(n * 10));
	}

	private static void Esercizio6() {
		// WORK IN PROGRESS
	}
}
