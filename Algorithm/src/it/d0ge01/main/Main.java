package it.d0ge01.main;

import java.io.IOException;

import it.d0ge01.armstrong.*;
import it.d0ge01.bmi.*;
import it.d0ge01.equ2.Equal2;
import it.d0ge01.fatt.Fatt;
import it.d0ge01.util.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		menu();
	}
	
	private static void menu() throws IOException {
		boolean cond = true;
		int ch = 0;
		
		while ( cond ) {
			System.out.println("=====================================");
			System.out.println("            Menu                     ");
			System.out.println(" 1- Numero di Armstrong              ");
			System.out.println(" 2- Il tuo fattore rischio           ");
			System.out.println(" 3- Equazioni di terzo grado         ");
			System.out.println(" 4- Fattoriale di un numero          ");
			System.out.println(" 0- esci          ");
			System.out.println("=====================================");
			System.out.print("Scegli: ");
			
			ch = Util.inputInt();
			
			// Numero di Armstrong
			if ( ch == 1 ) {
				System.out.print("Inserisci un numero: ");
				int n = Util.inputInt();
				Armstrong ob = new Armstrong(n);
				if ( ob.checkN() )
					System.out.println("Si è un numero di Armstrong..");
				else
					System.out.println("Non è un numero di Armstrong ");
			}
			
			if ( ch == 2 ) {
				double altezza, massa;
				System.out.print("Inserisci la tua altezza: ");
				altezza = Util.inputDouble();
				System.out.print("Inserisci la tua massa: ");
				massa = Util.inputDouble();
				Bmi ob = new Bmi(altezza, massa);
				ob.analize();
			}
			
			if ( ch == 3 ) {
				double ax,bx,c;
				System.out.print("Inserisci il coefficente di ax: ");
				ax = Util.inputDouble();
				System.out.print("Inserisci il coefficente di bx: ");
				bx = Util.inputDouble();
				System.out.print("Inserisci il coefficente di c: ");
				c = Util.inputDouble();
				
				Equal2 ob = new Equal2(ax,bx,c);
				if ( ob.real ) {
					System.out.println("La prima radice è " + ob.radici(0));
					System.out.println("La seconda radice è " + ob.radici(1));
				}
			}
			
			if ( ch == 4 ) {
				int n;
				System.out.print("Inserisci un numero: ");
				n = Util.inputInt();
				Fatt ob = new Fatt(n);
				System.out.println("Il fattoriale è " + ob.fatt());
			}
			
			if ( ch == 0 )
				cond = false;
		}
	}
}
