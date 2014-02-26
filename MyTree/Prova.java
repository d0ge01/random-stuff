import java.io.*;
import java.util.*;


public class Prova {
	public static void main(String[] args) {
		MyTree t1 = new MyTree();
		t1.add(5);
		t1.add(7);
		t1.add(9);
		t1.add(4);
		t1.add(3);
		t1.add(99);
		t1.add(44);
    System.out.print("Attraversamento in in-ordine:");
		t1.print(1);
    System.out.print("Attraversamento in pre-ordine:");
    t1.print(2);
    System.out.print("Attraversamento in post-ordine:");
    t1.print(3);
    t1.displayTree();
	}
}
