package pkg;
import java.util.Scanner;
import java.util.Random;


public class Golem implements Role{
		Random rand = new Random();
		String name;
		int health;
		int damage;
		public Golem(){
			name = "Trevor";
			health = rand.nextInt(100+1);
			damage = rand.nextInt(10000000+1);
		}
		public Golem(String a){
			name = a;
			health = 100;
			damage = 10000000;
		}
		public void setHealth(int x){
			health = x;
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
		public void attacks(Role penis){
			int w = penis.getHealth() - rand.nextInt(damage);
			penis.setHealth(w);
		}
		public boolean assaults(Creature thunk){
			thunk.takeDamage(damage);
			if(thunk.isDead() == true){
				System.out.println("The mighty golem attacks and defeats its foe.");
				return true;
			}
			else{
				System.out.println("The foe is damaged");
				return false;
			}
		}
	}

