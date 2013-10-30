package it.d0ge01.armstrong;

public class Armstrong {

	/**
	 * @param args
	 */
	private int n;
	private int k = 3;
	
	public Armstrong(int n){
		/*
		 * 153 = 1^3 + 5^3 + 3 ^ 3 = 1+ 125 + 27 = 153
		 */
		this.n = n;
	}
	
	public boolean checkN() {
		String nx = String.valueOf(n);
		int[] ny = new int[nx.length()];
		int s = 1;
		for ( int i = 0 ; i < nx.length() ; i++ )
			ny[i] = Integer.valueOf(nx.charAt(i));
		
		for ( int i = 0 ; i < ny.length ; i++ )
			s += ny[i] ^ this.k;
		if ( s == this.n )
			return true;
		return false;
	}

}
