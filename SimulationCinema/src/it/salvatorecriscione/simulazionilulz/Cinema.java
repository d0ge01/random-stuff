package it.salvatorecriscione.simulazionilulz;

public class Cinema extends Thread{

	private long tempo;
	
	public Cinema(long t) {
		this.tempo = t;
	}
	public void run() {
		try {
			sleep(this.tempo / 5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[!!!!!!!!!] Il Film è iniziato");
	}
	
	
}
