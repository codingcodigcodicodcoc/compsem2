package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician{
	String School;
	int yOe;

	public Apprentice() {
		School = "CV";
		yOe = 0;
	}
	public Apprentice(String a, int b){
		School = a;
		yOe = b;
	}
	public Apprentice(String a, String b, int c){
		instrument = a;
		School = b;
		yOe = c;
	}
	public Apprentice(String a, int b, String c, String d, int e){
		name = a;
		age = b;
		instrument = c;
		School = d;
		yOe = e;
	}
	public void playInstrument(){
		System.out.println(name+ " plays their " +instrument+ ". Terribly.");
	}
	public void practice(){
		System.out.println(name+" has been practicing for "+yOe+" years. And they're still garbage.");
	}
	public void perform(){
		System.out.println(name+ " is performing poorly");
	}
	public void practiceAtUni(){
		System.out.println(name+" is practicing at " +School+ "!");
	}
	
	}




