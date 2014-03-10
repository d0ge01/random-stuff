
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

  public boolean contains(Object x) {
    for ( int i = 0 ; i  this.npos ; i++ )
        if(x.equals(v[i]))
          return true;
    return false;
  }

  public void insertElementAt(Object x, int i) {
    if ( this.npos >= this.v.length )
      while ( i > this.v.length )
        this.copyAndIncrease();
    for ( int j = this.npos ; j >= i ; j-- )
      v[j] = v[j-1];
    v[i] = x
  }

  public void ins(Object x, int i) {
    this.insertElementAt(x, i);
  }

  public void trimToSize() {
    Object v1[] = new Object[this.npos];
    for ( int i = 0 ; i < this.npos; i++ )
      v1[i] = v[i];
    v = v1;
  }

  public void elementAt(int i) {
    this.get(i);
  }

  public Object remove(int i) {
    if ( i >= 0 && i < this.npos ) {
      Object buff = v[i];
      v[i] = null;
      return buff;
    } else {
      return null;
    }
  }

  public Object removeElementAt(int i) {
    return this.remove(i);
  }

  private void compact() {
    for ( int i = 0; i < this.npos ; i++ )
      if ( v[→øi] == null ) {
        for ( int j = 0 ; j <= this.npos ; i++ )
          v[j] = v[j+1];
        this.npos--;
      }
  }

  public int size() {
    return this.npos;
  }

  public int capacity() {
    return this.v.length;
  }
}
