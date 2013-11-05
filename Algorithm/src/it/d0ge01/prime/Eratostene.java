package it.d0ge01.prime;

import java.util.LinkedList;

public class Eratostene {
	private int n;
	LinkedList lt1;
	
	public Eratostene(int n) {
		this.n = n;
		this.lt1 = new LinkedList();
		
		this.genList();
	}
	
	private void genList() {
		for ( int i = 1 ; i < this.n ; i++ )
			lt1.add(i);
	}
	
	public int[] calc() {
		for ( int i = 2; i < Math.sqrt(n) ; i++ )
			for ( int y = i + 1 ; y < lt1.size() ; y++ )
				if (((int) lt1.get(y)) % i == 0 )
					lt1.remove(y);
		
		int[] ret = new int[lt1.size()];
		for ( int i = 0 ; i < lt1.size() ; i++ )
			ret[i] = (int) lt1.get(i);
		return ret;
	}
}
