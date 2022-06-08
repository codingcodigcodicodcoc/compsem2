package pkg;
import java.util.Scanner;
import java.util.Random;


public class Reco extends Science{
	public String Teacher;
	public int grade = 0;
	public int credit = 0;
	public Course(){
		Teacher = "Sullivan";
		grade = 0;
	}
	public Course(String a){
		super(a);
	}
	public Course(String a, int b){
		super(a,b);
	}

	public void passfail(int g, String a){
		if(g<60){
			System.out.println("They failed " +a+ "'s class");
		}
		else{
			System.out.println("They passed " +a+ "'s class");
		}
	}
}

