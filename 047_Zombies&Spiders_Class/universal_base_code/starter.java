import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Golem retard = new Golem("pebis");
		Zombe Gregory = new Zombe("ballgurgle");
		Spoider s = new Spoider("Mets");
		retard.assaults(Gregory);
		retard.assaults(s);
	}
}
