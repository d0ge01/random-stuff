import java.io.*;
import java.util.*;


public class Prova {
	public static void main(String[] args) {
		System.out.println("Albero vuoto generato, inserisci l'elementi...");
    MyTree t1 = new MyTree();
    System.out.println("Quanti elementi vuoi inserire? ");
    int xTo;
    try {
      xTo = Util.inputInt();
    } catch (IOException e) {
      xTo = 5; // default
    }
    for ( int i = 0 ; i < xTo; i++ ) {
      System.out.print("Inserisci l'elemento #"+i+" : ");
      try {
        t1.add(Util.inputInt());
      } catch (IOException e) {
        t1.add(0);
      }
    }
    System.out.println("Vuoi ordinarlo? Si o no?");
    String sr = "";
    try {
      sr = Util.inputString();
    } catch(IOException e) {}
    if ( sr.equals("si") )
      t1.reOrder();

    System.out.print("Attraversamento in in-ordine:  ");
		t1.print(1);
    System.out.print("Attraversamento in pre-ordine: ");
    t1.print(2);
    System.out.print("Attraversamento in post-ordine:");
    t1.print(3);
    t1.display();
    System.out.println("Ci sono " + t1.getNNode() + " nodi..");
	}
}
