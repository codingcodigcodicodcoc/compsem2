package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer {
	String name;
	int age;
	public Performer(){
		name = "DojaCat";
		age = 26;
	}
	public Performer(String a){
		name = a;
		age = 26;
	}
	public Performer(String a, int b){
		name = a;
		age = b;
	}
	public String getName(){
		return name;
	}
	public void practice(){
		System.out.println(name+" is practicing");
	}
	public void perform(){
		System.out.println(name+ " is performing");
	}

}

