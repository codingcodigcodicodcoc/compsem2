package pkg;
import java.util.Scanner;
import java.util.Random;


public class Golem {
		Random rand = new Random();
		String name;
		int health;
		int attack;
		public Golem(){
			name = "Trevor";
			health = rand.nextInt(15+1);
			attack = rand.nextInt(15+1);
		}
		public Golem(String a){
			name = a;
			health = 15;
			attack = 15;
		}
		public void setHealth(int x){
			health = x;
		}
		public int getHealth(){
			return health;
		}
		public String getName(){
			return name;
		}
		public void attack(Warrior penis){
			int w = penis.getHealth() - rand.nextInt(attack+1);
			penis.setHealth(w);
		} 
		public void attack(Wizard penis){
			int d = penis.getHealth() - rand.nextInt(attack+1);
			penis.setHealth(d);
		} 
	}

