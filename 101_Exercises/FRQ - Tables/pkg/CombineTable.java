package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombineTable{
	public CombineTable(SingleTable a, SingleTable b){
		int	seats = a.getSeats()+b.getSeats();
		int quality = (a.getQuality()+b.getQuality())/2;
		int height = a.getHeight();
		int height2 = b.getHeight();
	}
	public int canSeat(int a) {
		if(a <= seats-2){
			return true;
		}
		else{
			return false;
		}
		
	}
	public int getDesirability(){
		if(height == height2){
		return quality;
		}
		else{
		return quality -10;
		}
	}
}

