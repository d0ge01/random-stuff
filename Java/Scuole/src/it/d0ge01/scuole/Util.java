package it.d0ge01.scuole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
	public static int inputInt() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		String str = in.readLine();
		return (Integer.valueOf(str).intValue());
	}
	
	public static double inputDouble() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		String str = in.readLine();
		return (Double.valueOf(str).doubleValue());
	}
	
	public static float inputFloat() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		String str = in.readLine();
		return (Float.valueOf(str).floatValue());
	}
	
	public static char inputChar() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		String str = in.readLine();
		return ((char) str.charAt(0));
	}
	
	
	public static String inputString() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		String str = in.readLine();
		return (str);
	}
	
	public static void loadArrayInt(String txt, int[] v) throws IOException {
		for ( int i = 0 ; i < v.length ; i++ ) {
			System.out.print(txt);
			v[i] = inputInt();
		}
	}
	
	public static void loadArrayDouble(String txt, double[] v) throws IOException {
		for ( int i = 0 ; i < v.length ; i++ ) {
			System.out.print(txt);
			v[i] = inputDouble();
		}
	}
	
	public static void loadArrayFloat(String txt, float[] v) throws IOException {
		for ( int i = 0 ; i < v.length ; i++ ) {
			System.out.print(txt);
			v[i] = inputFloat();
		}
	}
	
	public static void loadArrayChar(String txt, char[] v) throws IOException {
		for ( int i = 0 ; i < v.length ; i++ ) {
			System.out.print(txt);
			v[i] = inputChar();
		}
	}
	
	public static void loadArrayString(String txt, String[] v) throws IOException {
		for ( int i = 0 ; i < v.length ; i++ ) {
			System.out.print(txt);
			v[i] = inputString();
		}
	}
	
	public static boolean checkIntIndex(int[] v, int x) {
		for ( int i = 0 ; i < v.length ; i++ )
			if ( v[i] == x )
				return true;
		return false;
	}
}
