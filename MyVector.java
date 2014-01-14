
public class MyVector {
	private Object v[] = null;
	private int size = 1;
	private int npos = 0;
	
	public MyVector() {
		v = new Object[size];
	}
	
	public MyVector(int size) {
		this.size = size;
		v = new Object[size];
	}
	
	public void add(Object x) {
		if ( this.npos >= this.size ) {
			this.copyAndIncrease();
		}
		v[this.npos] = x;
		this.npos += 1;
	}
	
	public void add(int x) {
		if ( this.npos >= this.size ) {
			this.copyAndIncrease();
		}
		v[this.npos] = new Integer(x);
		this.npos += 1;
	}
	
	public void add(float x) {
		if ( this.npos >= this.size ) {
			this.copyAndIncrease();
		}
		v[this.npos] = new Float(x);
		this.npos += 1;
	}
	
	public void add(double x) {
		if ( this.npos >= this.size ) {
			this.copyAndIncrease();
		}
		v[this.npos] = new Double(x);
		this.npos += 1;
	}
	
	public void add(char x) {
		if ( this.npos >= this.size ) {
			this.copyAndIncrease();
		}
		v[this.npos] = new Character(x);
		this.npos += 1;
	}
	
	public void add(boolean x) {
		if ( this.npos >= this.size ) {
			this.copyAndIncrease();
		}
		v[this.npos] = new Boolean(x);
		this.npos += 1;
	}
	
	public void add(long x) {
		if ( this.npos >= this.size ) {
			this.copyAndIncrease();
		}
		v[this.npos] = new Long(x);
		this.npos += 1;
	}
	
	public void add(short x) {
		if ( this.npos >= this.size ) {
			this.copyAndIncrease();
		}
		v[this.npos] = new Short(x);
		this.npos += 1;
	}
	
	public Object get(int i) {
		if ( i >= 0 && i < this.npos ) {
			return this.v[i];
		} else {
			return null;
		}
	
	}
	private void copyAndIncrease() {
		this.size = this.size * 2;
		Object v2[] = new Object[this.size];
		for ( int i = 0 ; i < this.npos ; i++ )
			v2[i] = this.v[i];
		
		this.v = v2;
	}
}
