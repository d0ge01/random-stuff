package it.d0ge01.museo;

public class Entrata {
	
	private int nFree = 5;
	
	public Entrata(int n) {
		this.nFree = n;
	}

	public synchronized void getInside() {
		if ( nFree == 0 ) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else
			nFree --;
	}
	
	public synchronized void getOut() {
		nFree++;
		notify();
	}
}
