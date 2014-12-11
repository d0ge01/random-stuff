import java.util.*;

class Rsa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int p,e,q,z,n,k;
		double d;
		boolean avanti = true;

		System.out.println("Inserisci un p: ");
		p = input.nextInt();
		System.out.println("Inserisci un q: ");
		q = input.nextInt();

		n = p*q;
		z = (p-1)*(q-1);

		System.out.println("Scegli un E inferiore a " + z + " e coprimo con " + z );

		e = input.nextInt();
		
		d = 0;
		k = 1;
		while ( avanti ) {
			d = ( k * z + 1 ) / e;
			System.out.println(" k = " + k + " , d = " + d );
			if ( intero(d))
				avanti = false;
			k += 1;
		}

		int es = (int) d;
		
		System.out.println("La coppia di chiavi è : ");
		System.out.println("(" + e + ","+n+") ");
		System.out.println("(" + es+ ","+n+") ");
	}

	private static boolean intero ( double n ) {
		if ( (n - Math.floor(n)) == 0 )
			return true;
		else
			return false;
	}
}
