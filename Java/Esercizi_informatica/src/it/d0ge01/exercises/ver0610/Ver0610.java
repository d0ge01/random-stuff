package it.d0ge01.exercises.ver0610;

import java.io.IOException;

import it.d0ge01.exercises.util.*;

public class Ver0610 extends ExTemplate{

	public Ver0610() throws IOException {
		super(testo);
		// TODO Auto-generated constructor stub
	}
	
	public static String[] testo = {"Contare il carattere '?' in 5 vettori","Controlla se contiene almeno un reale < 100",
		"Sono tutti multipli di 3?","Conversione da intero a binario",
		"Conversione da intero a decimale ( ricorsivo ) ","Permutazioni"};
	public void esercizio1() throws IOException {
		char[] v1, v2,v3,v4,v5;
		v1 = new char[5];
		v2 = new char[5];
		v3 = new char[5];
		v4 = new char[5];
		v5 = new char[5];
		Util.loadArrayChar("Inserisci il carattere per il vettore 1", v1);
		Util.loadArrayChar("Inserisci il carattere per il vettore 2", v2);
		Util.loadArrayChar("Inserisci il carattere per il vettore 3", v3);
		Util.loadArrayChar("Inserisci il carattere per il vettore 4", v4);
		Util.loadArrayChar("Inserisci il carattere per il vettore 5", v5);
		
		
		System.out.println("Il numero totale di '?' trovato e' " + (contaD(v1) + contaD(v2) + contaD(v3) + contaD(v4) + contaD(v5)));
	}
	
	private static int contaD(char[] v) {
		int s = 0;
		for ( int i = 0 ; i < v.length ; i++ )
			if ( v[i] == '?' )
				s += 1;
		return s;
	}
	
	public void esercizio2() throws IOException {
		double[] v = new double[5];
		Util.loadArrayDouble("Inserisci un reale: ", v);
		
		boolean trovato = false;
		for ( int i = 0 ; ( i < v.length ) && !trovato ;  i++ )
			if ( v[i] < 100 )
				trovato = true;
		if ( trovato )
			System.out.println("Contiene un elemento minore di 100..");
		else
			System.out.println("Non contiene un elemento minore di 100..");
	}
	
	public void esercizio3() throws IOException {
		int[] v = new int[3];
		
		Util.loadArrayInt("Inserisci un intero: " , v);
		
		boolean tuttiMult = true;
		for ( int i = 0 ; i < v.length && tuttiMult; i++ )
			if ( v[i] % 3 != 0 )
				tuttiMult = false;
		if ( tuttiMult )
			System.out.println("Sono tutti multipli di 3 ");
		else
			System.out.println("Non sono tutti multipli di 3");
	}
	
	public void esercizio4() throws IOException {
		System.out.print("Inserisci un intero: ");
		int n = Util.inputInt();
		
		System.out.println("" + n + " = " + int2Bin(n)); 
	}
	
	public void esercizio5() throws IOException {
		System.out.print("Inserisci un intero: ");
		int n = Util.inputInt();
		
		System.out.println("" + n + " = " + int2BinR(n)); 
	}
	
	private static String int2Bin(int n) {
		String output = "";
		for ( ; n >= 1 ; n = n / 2)
			output = (n%2)+output;
		return output;
	}
	
	private static String int2BinR(int n) {
		return ( n <= 1 ) ? (( n <= 0 ) ? "0" : "1" ) : int2BinR(n/2) + ( n % 2 );
	}
	
	public void esercizio6() throws IOException {
		char[] v = new char[3];
		Util.loadArrayChar("Inserisci un carattere: ", v);
		
		perm(v);
		
	}
	
	private static char[] swap(int x, int y, char[] v) {
		char buff = v[x];
		v[x] = v[y];
		v[y] = buff;
		return v;
	}
	
	private static void perm(char[] v) {
		for ( int i = 0 ; i < v.length ; i++ ) {
			stampa(v);
			v = shifta(v);
		}
		
		v = swap(0,1,v);
		for ( int i = 0 ; i < v.length ; i++ ) {
			stampa(v);
			v = shifta(v);
		}
	}
	
	private static void stampa(char[] v) {
		for ( int i = 0; i < v.length ; i++ )
			System.out.print(v[i]);
		System.out.println("");
	}
	
	private static char[] shifta(char[] v) {
		char last = v[v.length-1];
		for ( int i = 0; i < v.length -1 ; i++)
			v[i+1] = v[i];
		v[0] = last;
		return v;
	}
}
