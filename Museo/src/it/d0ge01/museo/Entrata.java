package it.d0ge01.museo;

public class Entrata {
	
	private int nFree = 5;
	
	public Entrata(int n) {
		this.nFree = n;
	}

	public synchronized boolean getInside() {
		if ( nFree > 0 ) {
			nFree--;
			return true;
		}
		else
			return false;
	}
	
	public synchronized void getOut() {
		nFree++;
	}
}
