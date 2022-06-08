package pkg;
import java.util.Scanner;
import java.util.Random;


public class APSci extends Science{
	public String Teacher = "Sullivan";
	public int grade = 10;
	public int credit = 0;
	public Course(){
		Teacher = "Sullivan";
		grade = 10;
	}
	public Course(String a){
		super(a);
	}
	public Course(String a, int b){
		super(a,b+10);
	}
	}


