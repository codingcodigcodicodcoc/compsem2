package pkg;
import java.util.Scanner;
import java.util.Random;


public class Pants extends Store {
	public int lengths;
	public Shirt(int n){
		super(n);
		lengths = 99;
	}
	public Shirt(int n, String a){
		super(n,a);
		lengths = 99;
	}
	public Shirt(int n, String a, int b) {
		super(n,a);
		lengths = b;
	}
}

