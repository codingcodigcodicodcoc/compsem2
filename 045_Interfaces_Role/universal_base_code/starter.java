import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Role[] x = new Role[3];
		x[0] = new Golem();
		x[1] = new Warrior();
		x[2] = new Wizard();
		
		System.out.println(x[0].getName());
		System.out.println(x[1].getName());
		System.out.println(x[2].getName());
	}
}
