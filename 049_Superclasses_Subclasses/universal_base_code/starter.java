import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer[] p = new Performer[2];
		Musician[] m =  new Musician[2];
		p[0] = new Performer();
		m[0] = new Musician();
		p[1] = new Performer("Penis", 99);
		m[1] = new Musician("Screebis");
		p[0].getName();
		m[0].getName();
		p[0].practice();
		m[0].perform();
		m[0].playInstrument();
		p[1].getName();
		p[1].perform();
		m[1].practice();
		m[1].getInstrument();
	}
}
