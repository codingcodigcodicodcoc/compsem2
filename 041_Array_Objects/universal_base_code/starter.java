import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main (String [] args){
		int z = 0;
		int f = 0;
		Wizard[] x = new Wizard[100];
		Warrior[] y = new Warrior[100];
		for(z=0; z<100; z++){
		x[z] = new Wizard();
		}
		for(f=0; f<100; f++){
		y[f] = new Warrior();
		}
		z=0;
		f=0;
			while(z <= 99 || f <= 99){
				x[z].attack(y[f]);
				boolean p = y[f].isDead();
				if(p == true){
					f++;
					y[f].attack(x[z]);
					boolean o = x[z].isDead();
					if(o == true){
						z++;
					}
				}
			}
	}
}
