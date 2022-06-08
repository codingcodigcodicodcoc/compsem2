package pkg;
import java.util.Scanner;
import java.util.Random;


public class Science extends Course {
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
	String field;
	public void setfield(String a) {
		field = a;
	}
	public String getfield(){
		return field;
	}



}

