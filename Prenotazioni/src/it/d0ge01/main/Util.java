package it.d0ge01.main;

/*
 * E' severamente vietato per etica  usare  java.io.scanner , 
 * Si narrano leggende popolari di gente che è morta usandola
 */
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
}
