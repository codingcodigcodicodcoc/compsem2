package pkg;
import java.util.Scanner;
import java.util.Random;


public class History extends Course {
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
	int era = 0;
	public void setera(int a) {
		era = a;
	}
	public int getera(){
		return era;
	}


}

