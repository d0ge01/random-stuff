package it.d0ge01.fatt;

public class Fatt {
	private int n;
	
	public Fatt(int n) {
		this.n = n;
	}
	
	
	public int fatt() {
		int s = 1;
		for ( int i = this.n ; i > 0 ; i-- )
			s *= i;
		return s;
	}
}
