import java.io.*;
import java.util.*;

class Node {
	public int data = 0;
	// public int key = 0;
	public Node leftChild = null;
	public Node rightChild = null;

	public Node(int data) {
		this.data = data;
	}
	
	public String toString() {
		return " " + this.data + " ";
	}
	
	public void stamp() {
		System.out.println(" " + this.data + " ");
	}
}
