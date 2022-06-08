package pkg;
import java.util.Scanner;
import java.util.Random;


public class Zombe implements Creature{
		Random rand = new Random();
		String name;
		int health;
		int attack;
		public zombe(){
			name = "Pornelius Hubert";
			health = rand.nextInt(15+1);
			attack = rand.nextInt(15+1);
		}
		public zombe(String a){
			name = a;
			health = 15;
			attack = 15;
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
			int w = roam.getHealth() - rand.nextInt(attack+1);
			roam.setHealth(w);
		}
		public boolean isDead(){
			if(x.getHealth() <= 0){
				return true;
			}
			else{
				return false;
			}
		}
		public boolean takeDamage(int y){
			if(x.getHealth() <= x.setHealth()){
				return true;
			}
			else{
				return false;
			}
		}
	}


