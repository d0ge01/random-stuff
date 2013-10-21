package it.d0ge01.scuole;

public class Scuola {
	protected String name = "";
	private Classe[] sch;
	protected int posx = 0;
	
	public Scuola(String name, int classN) {
		this.name = name;
		sch = new Classe[classN];
	}
	
	public void addClass(int p, char s) {
		if ( this.posx < this.sch.length)
			sch[this.posx] = new Classe(30,p,s);
	}
	
	public Classe[] list() {
		Classe[] buff = new Classe[this.posx];
		for ( int i = 0 ; i < this.posx ; i++ )
			buff[i] = sch[i];
		return buff;
	}
	
	public Studente searchByName(String name) {
		for ( int i = 0 ; i < this.posx ; i++ ) {
			Studente[] buff = sch[i].list();
			for ( int j = 0; j < buff.length ; j++ )
				if ( buff[j].name == name )
					return buff[j];
		}
		return null;
	}
	
}
