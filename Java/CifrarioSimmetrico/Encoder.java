import java.util.LinkedList;

class Encoder {
	private char[] zero = { '!', '"', '£', '$', '%', '&', '/', '(', ')', '=', '?', '^' };
	private char[] unos = { 'd', 'D', 'o', 'O', '0', 'g', 'G', 'e', 'E', '1' };
	private char[] dels = { '|', '_', 'L', 'Q', 'F', '+', '-', ':' };
	
	private int salt;
	public Encoder() {
		this.salt = ( ((int) (Math.random()*20)) % 2 == 0 ) ? 23 : 12;
	}
	
	public String encode(String txt) {
		String[] buffs = new String[txt.length()];
		String ret = "";
		for ( int i = 0 ; i < txt.length() ; i++ ) {
			buffs[i] = Integer.toBinaryString(((int) txt.charAt(i) ^ this.salt));
		}
		
		for ( int i = 0 ; i < buffs.length ; i++ ) {
			ret += this.getRandDel();
			for ( int j = 0 ; j < buffs[i].length();j++)
				ret += this.sub(buffs[i].charAt(j));
			ret += this.getRandDel();;
		}
		return ret;
	}
	
	private char getRandDel() {
		return this.dels[((int) ( Math.random() * dels.length))];
	}

	private char sub(char j) {
		if ( j == '1' )
			return this.zero[((int) (Math.random() * zero.length))];
		else
			return this.unos[((int) (Math.random() * unos.length))];
	}
}
		
		
