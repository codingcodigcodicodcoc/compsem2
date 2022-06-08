package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor implements Performer{
	public String type;
	
	public Actor() {
		type = "theatre";
	}
	public Actor(String a){
		type = a;
	}
	public Actor(String x, String y){
		super(x);
		type = y;
	}
	public Actor(String x, int y, String r){
		super(x,y);
		type = r;
	}
	public void practice(){
		System.out.println(name+" is practicing and struggling to pay rent");
	}
	public void perform(){
		System.out.println(name+ " is performing hoping their parents will un-disown them");
	}
	public void monologue(){
		System.out.println("The FitnessGram™ Pacer Test is a multistage aerobic capacity test that progressively gets more difficult as it continues. The 20 meter pacer test will begin in 30 seconds. Line up at the start. The running speed starts slowly, but gets faster each minute after you hear this signal. [beep] A single lap should be completed each time you hear this sound. [ding] Remember to run in a straight line, and run as long as possible. The second time you fail to complete a lap before the sound, your test is over. The test will begin on the word start. On your mark, get ready, start.");
	}

}

