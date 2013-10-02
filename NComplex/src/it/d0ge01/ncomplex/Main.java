package it.d0ge01.ncomplex;

import java.io.IOException;

import it.d0ge01.ncomplex.util.*;
import it.d0ge01.ncomplex.parser.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			menu();
	}
	
	private static void menu() throws IOException {
		String output = "";
		int[] n1 = new int[2];
		int[] n2 = new int[2];
		int[] r = new int[2];
		
		Parser uno = new Parser();
		while ( true ) {
			System.out.println("inserisci il primo numero reale: n + mi )");
			output = Utils.inputString();	
			n1 = uno.parser(output);
			
			System.out.println("inserisci il secondo numero reale: n + mi )");
			output = Utils.inputString();
			n2 = uno.parser(output);
			
			System.out.println(complex2String(n1) + " * " + complex2String(n2) + " = ");
			
			r = prodotto(n1, n2);
			System.out.println(complex2String(r));
		}
	}
	
	private static String complex2String ( int[] v ) {
		if ( v.length > 1 )
			return " " + v[0] + " + " + v[1] + "i ";
		return "";
	}
	
	private static int[] prodotto(int[] v1, int[] v2) {
		int[] ritorno = new int[2];
		
		ritorno[0] = ( v1[0] * v2[0] - v1[1] * v1[1]);
		ritorno[1] = ( v1[1] * v2[0] + v1[0] * v2[1]);
		
		return ritorno;
	}
}
