import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		Random rand = new Random ();
		int rand_numb = 1000;
		int a = 1;
		int rand_numb2 = (a+rand_numb);
		System.out.println ("Guess a number between 1 and 1000, do it now, this is not a trick");
		int b = sc.nextInt();
		
		boolean Shquain;
		if(b == rand_numb2)
		{
			System.out.println("CORRECT, SEE NO TRICK");
		}
		else
		{
			System.out.println("HAHA IT WAS TRICK!");
		}
	}
}
