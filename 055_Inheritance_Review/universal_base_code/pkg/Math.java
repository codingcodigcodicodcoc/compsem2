package pkg;
import java.util.Scanner;
import java.util.Random;


public class Mathematics extends Course{
	public String Teacher;
	public int grade = 0;
	public int credit = 0;
	public Mathematics(){
		Teacher = "Sullivan";
		grade = 0;
	}
	public Mathematics(String a){
		super(a);
	}
	public Mathematics(String a, int b){
		super(a,b);
	}
	String difficulty = "hard";

	public void setdifficulty(String a) {
		difficulty = a;
	}
	public String getdifficulty(){
		return difficulty;
	}

}

