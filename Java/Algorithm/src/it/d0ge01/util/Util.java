package it.d0ge01.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Util {
	public static int inputInt() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		
		String str = in.readLine();
		
		return ( Integer.valueOf(str).intValue() );
	}
	
	public static float inputFloat() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		
		String str = in.readLine();
		
		return ( Float.valueOf(str).floatValue() );
	}
	
	public static double inputDouble() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		
		String str = in.readLine();
		
		return ( Double.valueOf(str).doubleValue() );
	}
	
	public static String inputString() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		
		String str = in.readLine();
		
		return ( str );
	}
	
	public static char inputChar() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		
		String str = in.readLine();
		
		return ( str.charAt(0) );
	}
	
	public static void caricaVettFloat(float[] v) throws IOException 
	{
		for ( int i = 0 ; i < v.length ; i++ )
		{
			System.out.print("Inserisci il valore [" + i + "] : ");
			v[i] = Util.inputFloat();
		}
	}
	
	public static void caricaVettInt(int[] v) throws IOException 
	{
		for ( int i = 0 ; i < v.length ; i++ )
		{
			System.out.print("Inserisci il valore [" + i + "] : ");
			v[i] = Util.inputInt();
		}
	}
	
	public static void caricaVettDouble(double[] v) throws IOException 
	{
		for ( int i = 0 ; i < v.length ; i++ )
		{
			System.out.print("Inserisci il valore [" + i + "] : ");
			v[i] = Util.inputDouble();
		}
	}
	
	public static void caricaVettChar(char[] v) throws IOException 
	{
		for ( int i = 0 ; i < v.length ; i++ )
		{
			System.out.print("Inserisci il valore [" + i + "] : ");
			v[i] = Util.inputChar();
		}
	}
	
}
