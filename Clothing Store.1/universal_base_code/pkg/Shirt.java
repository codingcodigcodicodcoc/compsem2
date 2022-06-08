package pkg;
import java.util.Scanner;
import java.util.Random;


public class Shirt extends Store {
	public String mats;
	public Shirt(int n){
		super(n);
		mats = "cotton";
	}
	public Shirt(int n, String a){
		super(n,a);
		mats = "cotton";
	}
	public Shirt(int n, String a, String b) {
		super(n,a);
		mats = b;
	}
}

