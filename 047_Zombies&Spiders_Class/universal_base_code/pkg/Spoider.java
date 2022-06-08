package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spoider implements Creature{
		Random rand = new Random();
		String name;
		int health;
		int attack;
		public Spoider(){
			name = "Charlotte";
			health = rand.nextInt(5+1)+5;
			attack = rand.nextInt(5+1)+5;
		}
		public Spoider(String a){
			name = a;
			health = 5;
			attack = 5;
		}
		public void setHealth(int h){
			health = h;
		}
		public int getHealth(){
			return health;
		}
		public void setName(String b){
			name = b;
		}
		public String getName(){
			return name;
		}
		public void attack(Role rom){
			int w = rom.getHealth() - rand.nextInt(attack+1);
			rom.setHealth(w);
		}
		public boolean takeDamage(int y){
				health = health - y;
				return true;
			}
		public boolean isDead(){
			if(health <= 0){
				return true;
			}
			else{
				return false;
			}
		}
	}


