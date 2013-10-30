package it.d0ge01.equ2;

public class Equal2 {
	private double ax;
	private double bx;
	private double c;
	public boolean real;
	
	public Equal2(double ax, double bx, double c) {
		this.ax = ax;
		this.bx = bx;
		this.c = c;
		
		this.real = (( 4 * this.ax * this.c ) >= 0);
	}
	
	public double radici(int n) {
		if ( this.real ){
			if ( n == 0 ) {
				System.out.println(((invert(this.bx)) - Math.sqrt(this.bx - (4*this.ax*this.c))) / ( 2 * this.ax));
				return ((invert(this.bx)) - Math.sqrt(this.bx - (4*this.ax*this.c))) / ( 2 * this.ax) ;
			}else {
				System.out.println(((invert(this.bx)) + Math.sqrt(this.bx - (4*this.ax*this.c))) / ( 2 * this.ax));
				return ((invert(this.bx)) + Math.sqrt(this.bx - (4*this.ax*this.c))) / ( 2 * this.ax) ;
			}
		} else {
			System.out.println("Non è numero reale.");
		}
		return 0.0;
	}

	private double invert(double n) {
		double b = n;
		if ( n < 0 )
			return n + ( b*2 );
		else
			return n - ( b*2 );
	}
}
