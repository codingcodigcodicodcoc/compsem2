import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter{
	public static void main(String args[]) {
		String Warrior;
		String Wizard;
		String Golem;
		Golem golem = new Golem("Dick");
		golem.setHealth(15);
		System.out.println("The golem's name is " +golem.getName()+ " and he has " +golem.getHealth()+ " hp");
	}
}
