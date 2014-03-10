package it.salvatorecriscione.simulazionilulz;

import java.util.LinkedList;

public class Macchina extends Thread {
	private LocaleCibo dest;
	
	public Macchina(LocaleCibo x) {
		this.dest = x;
	}
	
	public void run() {
		if ( this.dest instanceof LocaleCibo ) {
				try {
					sleep((long) ((this.dest.getRoamingTime()) / 5.) );
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("["+this.dest.getNome()+"]"+"Arrivato a " + this.dest.getNome());
				
				try {
					sleep((long) ((this.dest.getDinnerTime()) / 5.) );
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("["+this.dest.getNome()+"]"+"Finito di mangiare ora si parte");
				
				try {
					sleep((long) (this.dest.timeCinema() / 5.));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("["+this.dest.getNome()+"]"+"Sei arrivato al cinema");
				
			} else {
				
			}
		}
}
