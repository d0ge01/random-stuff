package it.d0ge01.example.uno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1 {
	private static int[] v1= null;
	private static int[] v2= null;
	private static int dim = 5; // default value = 5
	public static void main(String[] Args) throws IOException {
		System.out.print("Inserisci le dimensioni dei 2 vettori: ");
		dim = inserisciInt();
		
		v1 = new int[dim];
		v2 = new int[dim];
		
		
		inserisciVett(v1);
		inserisciVett(v2);
		
		System.out.println(sommaVett(v1));
		System.out.println(sommaVett(v2));
		
	}
	
	private static void inserisciVett(int[] v) throws IOException {
		for ( int i = 0 ; i < dim ; i++ ) {
			System.out.print("Inserisci il numero " + ( i + 1 ) + ": ");
			v[i] = inserisciInt();
		}
	}
	
	private static int inserisciInt() throws IOException {
		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader input  = new BufferedReader (reader);
		String str = input.readLine();
		
		return (Integer.valueOf(str).intValue());
	}
	
	private static int sommaVett(int[] v) {
		int s = 0;
		for ( int i = 0; i < dim ; i++  )
			s += v[i];
		return s;
	}
}
