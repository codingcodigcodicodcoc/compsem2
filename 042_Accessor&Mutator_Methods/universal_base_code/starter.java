import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	int c = 0;
	int d = 0;
	Random rand = new Random();
	Dwarf [] x = new Dwarf [100];
	String[] y;
	y = new String [7];
	y[0] = new String ("Grumpy");
	y[1] = new String ("Dopey");
	y[2] = new String ("Sleepy");
	y[3] = new String ("Doc");
	y[4] = new String("Bashful");
	y[5] = new String("Sleepy");
	y[6] = new String("Sneezy");
	for(c=0; c<100; c++){
		x[c] = new Dwarf();
		x[c].setStuffiename(y[rand.nextInt(7)]);
		x[c].setStuffieage(rand.nextInt(100+1));
		x[c].getStuffie();
		x[c].getStuffied();
		System.out.println(x[c].getStuffie()+ " be his name, an he be " +x[c].getStuffied()+" years old");
	}
	}
}
