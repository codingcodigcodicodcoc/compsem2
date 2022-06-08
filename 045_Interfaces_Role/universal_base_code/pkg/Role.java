package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Role{
	public void attacks(Role ronmn);
	public void setHealth(int x);
	public int getHealth();
	public String getName();
	public void setName(String b);
	public boolean assaults(Creature thenm);
}

