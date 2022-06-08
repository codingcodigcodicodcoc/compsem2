import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		Tortoise Rock = new Tortoise("Literally just a rock", 100, true);
		Tortoise Stone = new Tortoise("Stoned", 59, true);
		Tortoise Doll = new Tortoise("Dolomite", 67, false);
		birb Dave = new birb("bord", 1, false);
		birb Felix = new birb("Felix", 9, true);

		System.out.println();
		Rock.Trick();
		Stone.Trick();								
		Doll.CheapTrick();
		
		System.out.println("-------------");
		Dave.CheapTrick();
		Felix.Trick();								
	}
}
