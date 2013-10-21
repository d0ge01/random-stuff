package it.d0ge01.scuole;

public class Classe {
	private int size;
	protected int posx = 0;
	private Studente[] classe;
	protected String name;
	
	public Classe(int dimensione, int p, char s) {
		this.size = dimensione;
		classe = new Studente[this.size];
		this.name = "" + p + s;
	}
	
	public Classe() {
		this.size = 30;
		classe = new Studente[this.size];
	}
	
	public void addStudente(Studente x) {
		classe[posx] = x;
		this.posx += 1;
	}
	
	public Studente[] list() {
		Studente[] buff = new Studente[this.posx+1];
		for ( int i = 0 ; i <= this.posx ; i++ )
			buff[i] = this.classe[i];
		return buff;
	}
	
	public String toString() {
		String buff =  "Elenco classe " + this.name + ": \n";
		for ( int i = 0 ; i <= this.posx ; i++ )
			buff += "-"+ i + " " + classe[i].name + "\n";
		return buff;
	}
}
