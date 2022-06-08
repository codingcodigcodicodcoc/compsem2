package pkg;
import java.util.Scanner;
import java.util.Random;


public class Socks extends Store {
	public String type;
	public Shirt(int n){
		super(n);
		type = "tube";
	}
	public Shirt(int n, String a){
		super(n,a);
		type = "tube";
	}
	public Shirt(int n, String a, String b) {
		super(n,a);
		type = b;
	}
}

