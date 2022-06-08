package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer {
	public String name;
	public int age;
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
	public int getAge(){
		return age;
	}
	public void practice(){
		System.out.println(name+" is practicing");
	}
	public void perform(){
		System.out.println(name+ " is performing");
	}
	public String toString(){
		return (name+ " is performing on overwritten code at " +age+ " years old");
	}
	public boolean equals(Object other){
		if(!((Performer)other instanceof Performer))
			return false;
		else
			return this.getName() == ((Performer)other).getName();
	}


}

