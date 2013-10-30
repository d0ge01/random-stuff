package it.d0ge01.bmi;

public class Bmi {
	private double mass = 0.0;
	private double height = 0.0;
	private String status = "";
	private String wat = "";
	public double bmi = 0.0;
	
	public Bmi(double height, double mass) {
		this.mass = mass;
		this.height=height;
		
		this.bmi = this.mass / ( Math.pow(this.height, 2));
		status();
	}
	public void analize() {
		System.out.println("Il tuo peso è " + this.mass);
		System.out.println("La tua altezza è " + this.height);
		System.out.println("Il tuo BMI è " + this.bmi);
		System.out.println("sei affetto da " + this.status);
		System.out.println("il tuo rischio è " + this.wat);
		
	}
	
	private void status() {
		if ( this.bmi >= 40.0 ) {
			this.status = "Obesità di III classe";
			this.wat = "Gravissima";
		}
		if ( this.bmi >= 35.0 && this.bmi <= 39.99 ) {
			this.status = "Obesità di II classe";
			this.wat = "Grave";
		}
		if ( this.bmi >= 30.0 && this.bmi <= 34.99 ){
			this.status = "Obesità di I classe";
			this.wat = "Moderato";
		}
		if ( this.bmi >= 25.0 && this.bmi <= 29.99 ){
			this.status = "Visibilmente sovrapeso";
			this.wat = "Nessuno";
		}
		if ( this.bmi >= 22.0 && this.bmi <= 24.99 ) {
			this.status = "Leggermente sovrapeso";
			this.wat = "Nessuno";
		}
		if ( this.bmi >= 19.0 && this.bmi <= 21.99 ) {
			this.status = "Nessun disturbo";
			this.wat = "Nessuno";
		}
		if ( this.bmi >= 17.50 && this.bmi <= 18.99 ) {
			this.status = "Leggermente sottopeso";
			this.wat = "Nessuno";
		}
		if ( this.bmi > 15.5 && this.bmi <= 17.49 ) {
			this.status = "Visibilmente sottopeso";
			this.wat = "Minimo";
		}
		if ( this.bmi <= 15.5 ) {
			this.status = "Grave Magrezza";
			this.wat = "Alto";
		}
	}
}
