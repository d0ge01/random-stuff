package it.d0ge01.museo;

public class Turista extends Thread {
	private Entrata e;
	private String nome;
	
	public Turista(Entrata e, String nome) {
		this.e = e;
		this.nome = nome;
	}
	
	public void run() {
		
		e.getInside();
		
		System.out.println("Turista " + this.nome + " sta guardando un quadro :D");
		// Osservo il quadro scrivendolo su un social network
		
		
		// Impiego un tempo random tra 1 - 3 s per scriverlo
		try {
			sleep((int)( Math.random() * 3) * 1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Esco
		e.getOut();
	}
}
