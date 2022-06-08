package pkg;
import java.util.Scanner;
import java.util.Random;


public Store{
	public int price;
	public String Prod;
	public Store(){
		price = 100000;
		Prod = "African Eagle";
	}
	public Store(int n){
		price = n;
	}
	public Store(String a){
		Prod = a;
	}
	public Store(int n, String a) {
		price = n;
		Prod = a;
	}
}

