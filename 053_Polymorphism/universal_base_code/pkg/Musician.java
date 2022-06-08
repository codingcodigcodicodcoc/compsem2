package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer{
	public String instrument;
	public Musician(){
		instrument = " cello";
	}
	public Musician(String a){
		instrument = a;
	}
	public Musician(String x, String y){
		super(x);
		instrument = y;
	}
	public Musician(String x, int y, String r){
		super(x,y);
		instrument = r;
	}
	public String getInstrument(){
		System.out.println(name+" has a " +instrument+".");
		return instrument;
	}
	public void playInstrument(){
		System.out.println(name+ " plays.");
	}
}

