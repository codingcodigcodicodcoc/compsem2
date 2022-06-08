package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer{
	public String instrument;
	public Musician(){
		instrument = "cello";
	}
	public Musician(String a){
		instrument = a;
	}
	public String getInstrument(){
		return instrument;
	}
	public void playInstrument(){
		System.out.println(name+ " plays.");
	}
}

