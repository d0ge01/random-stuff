package it.d0ge01.scuole;

import java.util.LinkedList;

public class Classe {
	private LinkedList<Studente> classe;
	protected String name;
	
	public Classe(String name) {
		classe = new LinkedList();
		this.name = name;
	}
	
	public void addStudente(Studente x) {
		this.classe.add(x);
		this.classe.size();
	}
	
	@SuppressWarnings("unchecked")
	public LinkedList<Studente> list() {
		return this.classe;
	}
	
	public String toString() {
		return this.name;
	}
	
	public String toString(int i) {
		if ( i < this.classe.size())
			return ((Studente)this.classe.get(i)).name;
		return this.name;
	}
	
	public String toStamp() {
		String ret = "";
		for ( int i = 0 ; i < this.classe.size(); i++ ) {
			ret += "" + i+1 + "- " + ((Studente) this.classe.get(i)).toString() + "\n";
			
		}
		return ret;
	}
}
