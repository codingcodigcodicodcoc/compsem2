package pkg;
import java.util.Scanner;
import java.util.Random;


public class Deshirt extends Store {
	public String Design;
	public Deshirt(int n){
		super(n);
		Design = "Soupreem";
	}
	public Shirt(int n, String a){
		super(n,a);
		Design = "Soupreem";
	}
	public Shirt(int n, String a, String b) {
		super(n,a);
		Design = b;
	}
}

