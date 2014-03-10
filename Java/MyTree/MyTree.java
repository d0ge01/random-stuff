import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class MyTree {
	private Node root;
	private int nx = 0;

  private int nElement;
  private boolean debug = true;

	public MyTree() {
		this.root = null;
    this.nElement = 0;
	}

	public void add(int k) {
		Node newNode = new Node();
		newNode.data = k;
    this.nElement += 1;
		if ( this.root == null ) {
			this.root = newNode;
		}
		else {
			Node buff = this.root;
			Node parent;
			while (true) {
				parent = buff;
				if ( k < buff.data ) {
					buff = buff.leftChild;
					if ( buff == null ) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					buff = buff.rightChild;
					if ( buff == null ) {
						parent.rightChild = newNode;
						return;
					}
				}
			}

		}
	}

	public int getNNode() {
		return this.nElement;
	}

	public void reOrder() {
		LinkedList<Integer> l = new LinkedList<Integer>();
		reOrderX(l,this.root);

    if ( this.debug ) {
      for ( int i = 0 ; i < l.size();i++)
        System.out.print(' ' + l.get(i) + ' ');
      System.out.println("");
    }


    for ( int i = 0 ; i < l.size() -1 ; i++ ) {
			if ( l.get(i) > l.get(i+1)) {
				l.add(l.get(i+1), i);
				l.remove(i+1);
			}
		}

    if ( this.debug ) {
      for ( int i = 0 ; i < l.size();i++)
        System.out.print(' ' + l.get(i) + ' ');
      System.out.println("");
    }

		this.root = null;
		int md = l.size()/2;

    add(l.get(md));
		l.remove(md);

    for ( int i = 0; i < l.size(); i++ )
			add(l.get(i));
	}

	private void reOrderX(LinkedList<Integer> l, Node p) {
		if ( p != null ) {
			l.add(p.data);
			if ( p.leftChild != null )
				reOrderX(l, p.leftChild);
			if ( p.rightChild != null )
				reOrderX(l, p.rightChild);
		}
	}

	public void print(int p) {
		/*
     * traverse in-order    p = 1
     * traverse pre-order   p = 2
     * traverse post-order  p = 3
     */
    switch (p) {
		case 1:
			inOrdine(this.root);
			break;
		case 2:
			preOrdine(this.root);
			break;
		case 3:
			postOrdine(this.root);
			break;
		default:
			break; // useless :(
		}
    System.out.println("");
	}

	private void preOrdine(Node p) {
		if ( p != null ) {
			System.out.print(" " + p.data + " ");
			preOrdine(p.leftChild);
			preOrdine(p.rightChild);
		}
	}
	private void inOrdine(Node p) {
		if ( p != null ) {
			inOrdine(p.leftChild);
      System.out.print(" " + p.data + " ");
			inOrdine(p.rightChild);
		}
	}
	private void postOrdine(Node p) {
		if ( p != null ) {
			postOrdine(p.leftChild);
			postOrdine(p.rightChild);
			System.out.print(" " + p.data + " ");
		}
	}

	public int maxNodeByLiv(int h) {
		return (int) Math.pow(2, h);
	}

	public int maxNodeByHeight(int h) {
		return (int) (Math.pow(2, h+1) - 1);
	}

	public int maxHeightByN() {
		return this.getNNode();
	}

	public int minHeightByN() {
		return (int) (Math.log10(this.getNNode()) / Math.log(2));
	}

  public void display() {
    Stack globalStack = new Stack();
    globalStack.push(root);
    int nBlanks = 32;
    boolean rigaVuota = false;
    System.out.println("");
    System.out.println("=========== VISUALIZZAZIONE ALBERO ============");
    while ( rigaVuota == false ) {
      Stack localStack = new Stack();
      rigaVuota = true;
      for ( int i = 0 ; i < nBlanks ; i++ )
        System.out.print(' ');
      while ( globalStack.isEmpty() == false ) {
        Node temp = (Node) ( globalStack.pop() );
        if ( temp != null ) {
          System.out.print(temp.data);
          localStack.push(temp.leftChild);
          localStack.push(temp.rightChild);

          if ( temp.leftChild != null || temp.rightChild != null )
            rigaVuota = false;
        } else {
          System.out.print("  ");
          localStack.push(null);
          localStack.push(null);
        }

        for(int j=0; j<nBlanks*2-2; j++)
          System.out.print(' ');
      }
      System.out.println("");
      nBlanks = nBlanks / 2;

      while(localStack.isEmpty()==false)
        globalStack.push(localStack.pop());
    }
  }
}
