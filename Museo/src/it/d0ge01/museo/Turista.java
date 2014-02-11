package it.d0ge01.museo;

public class Turista extends Thread {
	private Entrata e;
	private String nome;
	
	public Turista(Entrata e, String nome) {
		this.e = e;
		this.nome = nome;
	}
	
	public void run() {
		
		while ( !e.getInside() ) { // controllo se c'è posto
			try {
				sleep((int)( Math.random() * 800)); // Aspetto un tempo random tra 1 e 800 ms
			} catch (InterruptedException e1) {
				// NULL, NOTHING, 00000000 
			}
		}
		
		System.out.println("[Faciebok] Turista " + this.nome + " sta guardando un quadro :D");
		// Osservo il quadro scrivendolo su un social network
		
		
		// Impiego un tempo random tra 1-1200 ms per scriverlo
		try {
			sleep((int)( Math.random() * 1200));
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Esco
		e.getOut();
	}
}
