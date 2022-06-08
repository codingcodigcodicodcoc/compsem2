import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer[] p = new Performer[2];
		Musician[] m =  new Musician[4];
		p[0] = new Performer();
		m[0] = new Musician();
		p[1] = new Performer("Penis", 99);
		m[1] = new Musician("Screebis");
		m[2] = new Musician("dumbo","Fuckerbocker");
		m[3] = new Musician("Skreebo", 7456377, "PebissibeP");
		p[0].getName();
		m[0].getName();
		p[0].practice();
		m[0].perform();
		m[0].playInstrument();
		p[1].getName();
		p[1].perform();
		m[1].practice();
		m[1].getInstrument();
		m[2].getName();
		m[2].practice();
		m[2].getInstrument();
		m[3].getName();
		m[3].perform();
		m[3].playInstrument();
	}
}