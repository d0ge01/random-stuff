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
		int[] r = new int[2];
		
		Parser uno = new Parser();
		while ( true ) {
			System.out.println("inserisci un numero reale: ( N ( cos 50 isin 50 ) oppure n + mi )");
			output = Utils.inputString();
			
			r = uno.parser(output);
			for ( int i = 0 ; i < 2 ; i++ ) {
				System.out.println(r[i]);
			}
		}
	}
}
