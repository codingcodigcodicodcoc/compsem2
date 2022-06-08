package pkg;
import java.util.Scanner;
import java.util.Random;


public class Course {
	public String Teacher;
	public int grade = 0;
	public int credit = 0;
	public Course(){
		Teacher = "Sullivan";
		grade = 0;
	}
	public Course(String a){
		Teacher = a;
		grade = 0;
	}
	public Course(String a, int b){
		Teacher = a;
		grade = b;
	}
	public void calcCredit(int g){
		if(g>=100){
			credit = 5;
		}
		else(100 <g>= 90){
			credit = 4;
		}
		else if(g<90 && g>= 80){
			credit = 3;
		}
		else if(g<80 && g>= 70){
			credit = 2;
		}
		else if(g<70 && g>= 60){
			credit = 1;
		}
		else if(g<60){
			credit = 0;
		}
		System.out.println(credit);
		
	}
}

