import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
	}
	public static int factorial(int n){
		int thing = n;
		if(n==1){
			return 1; 
		}
		else if(n>1){
			for(int a = n-1; a!=0; a++){
				thing = thing*a;
			}
			return thing;
		}
	}
	public static void numcombo(int n, int r){
		if(r<n){
			System.out.println("There are 0 ways of choosing " +r+ " combinations from " +n+ " choices");
		}
		else if(r == n){
			int actual;
			int rvar;
			int varied = n-r;
			factorial(actual);
			factorial(rvar);
			factorial(varied);
			System.out.println("There are "+actual+" ways of choosing "+r+" combinations from "+n+" choices");
		}
	}	
	}
