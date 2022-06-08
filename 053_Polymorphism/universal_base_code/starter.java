import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer[] p = new Performer[2];
		Musician[] m =  new Musician[4];
		Actor[] a = new Actor[1];
		Apprentice[] n = new Apprentice[4];
		p[0] = new Performer();
		m[0] = new Musician();
		p[1] = new Performer("Penis", 99);
		m[1] = new Musician("Screebis");
		m[2] = new Musician("dumbo","Fuckerbocker");
		m[3] = new Musician("Skreebo", 7456377, "PebissibeP");
		a[0] = new Actor("Nicholas Cage", 93128092, "Improv");
		n[0] = new Apprentice();
		n[1] = new Apprentice("NYU", 12);
		n[2] = new Apprentice("Tromboner", "NYU", 84);
		n[3] = new Apprentice("Pornelius Hubert", 8, "Claripholute", "NYU", 12);
		n[0].playInstrument();
		n[1].practice();
		n[2].perform();
		n[3].practiceAtUni();
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
		a[0].perform();
		a[0].practice();
		a[0].monologue();
		
		Performer[] pm = new Performer[4];
		pm[0]= new Performer();
		pm[1]= new Musician();
		pm[2]= new Actor();
		pm[3]= new Apprentice();
		pm[0].perform();
		pm[0].practice();
		pm[1].perform();
		((Performer)pm[1]).practice();
		((Actor)pm[2]).monologue();
		((Performer)pm[2]).perform();
		((Apprentice)pm[3]).practiceAtUni();
		((Musician)pm[3]).playInstrument();
	}
}